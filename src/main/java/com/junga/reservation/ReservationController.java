package com.junga.reservation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class ReservationController {

    private ReservationService reservationService;

    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    public ReservationController(ReservationService reservationService) {
        logger.info("ReservationController");
        this.reservationService = reservationService;
    }

    @RequestMapping("/reservation")
    public String reservation(Model model) {
        logger.info("reservation");
        List<Reservation> reservations = reservationService.getReservationList();
        model.addAttribute("reservations", reservations);
        return "reservation";
    }

    @RequestMapping("/reservation/add/{songId}")
    public String addReservation(@PathVariable("songId") int songId, Model model) {
        logger.info("addReservation: " + songId);
        reservationService.addReservation(songId);
        List<Reservation> reservations = reservationService.getReservationList();
        model.addAttribute("reservations", reservations);
        return "reservation";
    }

    @RequestMapping("/reservation/delete/{songId}")
    public String deleteReservation(@PathVariable("songId") int songId, Model model) {
        logger.info("deleteReservation: " + songId);
        reservationService.deleteReservation(songId);
        List<Reservation> reservations = reservationService.getReservationList();
        model.addAttribute("reservations", reservations);
        return "reservation";
    }
}
