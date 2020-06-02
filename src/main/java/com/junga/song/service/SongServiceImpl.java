package com.junga.song.service;

import com.junga.song.vo.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl implements SongService {

    private final List<Song> songs = new ArrayList<>();

    public SongServiceImpl() {
        songs.add(new Song(1, "깡", 2));
        songs.add(new Song(2, "Seoul", 3));
        songs.add(new Song(3, "Blueming", 1));
        songs.add(new Song(4, "팔레트", 1));
        songs.add(new Song(5, "밤편지", 1));
    }

    @Override
    public Song getSong(int songId) {
        return songs.stream()
                .filter(song -> song.getSongId() == songId)
                .collect(Collectors.toList())
                .get(0);
    }
}
