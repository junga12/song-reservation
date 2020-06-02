package com.junga.song.vo;

public class Song {

    private int songId;
    private String songName;
    private int[] genreId;
    private int artistId;

    public Song() {
    }

    public Song(int songId, String songName, int artistId) {
        this.songId = songId;
        this.songName = songName;
        this.artistId = artistId;
    }

    public Song(int songId, String songName, int[] genreId, int artistId) {
        this.songId = songId;
        this.songName = songName;
        this.genreId = genreId;
        this.artistId = artistId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int[] getGenreId() {
        return genreId;
    }

    public void setGenreId(int[] genreId) {
        this.genreId = genreId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
}
