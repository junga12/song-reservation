package com.junga.service;

import com.junga.domain.Artist;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ArtistServiceImplTest {

    private ArtistService artistService;

    @Before
    public void init() {
        artistService = new ArtistServiceImpl();
    }

    @Test
    public void getArtist() {
        Artist artist1 = artistService.getArtist(1);
        assertEquals(artist1.getArtistId(), 1);
        assertEquals(artist1.getArtistName(), "아이유");
        assertEquals(artist1.getBirthDate(), LocalDate.of(1993, 5, 16));

        Artist artist2 = artistService.getArtist(2);
        assertEquals(artist2.getArtistId(), 2);
        assertEquals(artist2.getArtistName(), "비");
        assertEquals(artist2.getBirthDate(), LocalDate.of(1982, 6, 25));


        Artist artist3 = artistService.getArtist(3);
        assertEquals(artist3.getArtistId(), 3);
        assertEquals(artist3.getArtistName(), "이효리");
        assertEquals(artist3.getBirthDate(), LocalDate.of(1979, 5, 10));
    }
}