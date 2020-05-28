package com.junga.reservation;

import com.junga.domain.Song;
import com.junga.service.ArtistService;
import com.junga.service.ArtistServiceImpl;
import com.junga.service.SongService;
import com.junga.service.SongServiceImpl;
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
        reservations = reservations.stream()
                .filter(reservation -> reservation.getSongId() != songId)
                .collect(Collectors.toList());
    }
}
