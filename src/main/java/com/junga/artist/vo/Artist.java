package com.junga.artist.vo;

import java.time.LocalDate;

public class Artist {

    private int artistId;
    private String artistName;
    private LocalDate birthDate;

    public Artist() {
    }

    public Artist(int artistId, String artistName, LocalDate birthDate) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
