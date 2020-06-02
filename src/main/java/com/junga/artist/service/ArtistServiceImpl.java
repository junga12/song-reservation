package com.junga.artist.service;

import com.junga.artist.vo.Artist;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final List<Artist> artists = new ArrayList<>();

    public ArtistServiceImpl() {
        artists.add(new Artist(1, "아이유", LocalDate.of(1993, 5, 16)));
        artists.add(new Artist(2, "비", LocalDate.of(1982, 6, 25)));
        artists.add(new Artist(3, "이효리", LocalDate.of(1979, 5, 10)));
    }

    @Override
    public Artist getArtist(int artistId) {
        return artists.stream()
                .filter(artist -> artist.getArtistId() == artistId)
                .collect(Collectors.toList())
                .get(0);
    }
}
