package com.junga.reservation;

import com.junga.reservation.Reservation;
import com.junga.reservation.ReservationService;
import com.junga.reservation.ReservationServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReservationServiceImplTest {

    private ReservationService reservationService;

    @Before
    public void init() {
        reservationService = new ReservationServiceImpl();
    }

    @Test
    public void getReservations() {
        List<Reservation> reservations = reservationService.getReservationList();
        assertEquals(reservations.size(), 0);
    }

    @Test
    public void addReservation() {
        reservationService.addReservation(1);
        reservationService.addReservation(3);
        List<Reservation> reservations = reservationService.getReservationList();
        assertEquals(reservations.size(), 2);
        assertEquals(reservations.get(0).getSongId(), 1);
        assertEquals(reservations.get(1).getSongId(), 3);

        Reservation reservation = reservations.get(0);
        assertEquals(reservation.getArtistName(), "비");
        assertEquals(reservation.getSongName(), "깡");
    }

    @Test
    public void deleteReservation() {
        addReservation();
        reservationService.deleteReservation(1);
        List<Reservation> reservations = reservationService.getReservationList();
        assertEquals(reservations.size(), 1);
        assertEquals(reservations.get(0).getSongId(), 3);
    }
}