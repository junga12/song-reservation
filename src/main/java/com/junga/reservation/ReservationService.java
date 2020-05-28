package com.junga.reservation;

import java.util.List;

public interface ReservationService {

    public List<Reservation> getReservationList();
    public void addReservation(int songId);
    public void deleteReservation(int songId);
}
