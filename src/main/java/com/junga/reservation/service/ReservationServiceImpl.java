package com.junga.reservation.service;

import com.junga.song.vo.Song;
import com.junga.reservation.vo.Reservation;
import com.junga.artist.service.ArtistService;
import com.junga.artist.service.ArtistServiceImpl;
import com.junga.song.service.SongService;
import com.junga.song.service.SongServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {

    private List<Reservation> reservations = new ArrayList<>();
    private static final SongService songService = new SongServiceImpl();
    private static final ArtistService artistService = new ArtistServiceImpl();

    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Override
    public List<Reservation> getReservationList() {
        return reservations;
    }

    @Override
    public void addReservation(int songId) {
        Song song = songService.getSong(songId);
        reservations.add(new Reservation(songId, song.getSongName(),
                        song.getArtistId(), artistService.getArtist(song.getArtistId()).getArtistName()));
    }

    @Override
    public void deleteReservation(int songId) {
        reservations = reservations.stream() // songId에 해당하는 것 전부 제거
                .filter(reservation -> reservation.getSongId() != songId)
                .collect(Collectors.toList());
    }
}
