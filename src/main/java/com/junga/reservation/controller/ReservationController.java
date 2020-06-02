package com.junga.reservation.controller;

import com.junga.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class ReservationController {

    private ReservationService reservationService;

    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping("/reservation")
    public String reservation(Model model) {
        model.addAttribute("reservations", reservationService.getReservationList());
        return "reservation";
    }

    @RequestMapping("/reservation/add/{songId}")
    public String addReservation(@PathVariable("songId") int songId, Model model) {
        reservationService.addReservation(songId);
        model.addAttribute("reservations", reservationService.getReservationList());
        return "reservation";
    }

    @RequestMapping("/reservation/delete/{songId}")
    public String deleteReservation(@PathVariable("songId") int songId, Model model) {
        reservationService.deleteReservation(songId);
        model.addAttribute("reservations", reservationService.getReservationList());
        return "reservation";
    }
}
