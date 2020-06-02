package com.junga.reservation.service;

import com.junga.reservation.vo.Reservation;

import java.util.List;

public interface ReservationService {

    public List<Reservation> getReservationList();
    public void addReservation(int songId);
    public void deleteReservation(int songId);
}
