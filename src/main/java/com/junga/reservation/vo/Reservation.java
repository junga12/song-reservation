package com.junga.reservation.vo;

public class Reservation {

    private int no;
    private int songId;
    private String songName;
    private int artistId;
    private String artistName;

    public Reservation() {
    }

    public Reservation(int songId, String songName, int artistId, String artistName) {
        this.songId = songId;
        this.songName = songName;
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
