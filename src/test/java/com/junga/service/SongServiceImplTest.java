package com.junga.service;

import com.junga.domain.Song;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongServiceImplTest {

    private SongService songService = new SongServiceImpl();

    @Before
    public void init() {
        songService = new SongServiceImpl();
    }

    @Test
    public void getSong() {
        Song song1 = songService.getSong(1);
        assertEquals(song1.getSongName(), "깡");
        assertEquals(song1.getArtistId(), 2);

        Song song2 = songService.getSong(4);
        assertEquals(song2.getSongName(), "팔레트");
        assertEquals(song2.getArtistId(), 1);

        Song song3 = songService.getSong(3);
        assertEquals(song3.getSongName(), "Blueming");
        assertEquals(song3.getArtistId(), 1);

    }
}