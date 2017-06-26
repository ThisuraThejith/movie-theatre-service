/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import org.movie.theatre.models.dto.BookingDTO;
import org.movie.theatre.models.dto.UsersDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.Booking.BOOKINGCONTROLLER)
public class BookingController {
    
    @Autowired
    private TheatreService theatreService;

    @CrossOrigin
    @RequestMapping(value=Constants.Booking.ADD_BOOKING, method=RequestMethod.GET, produces = "application/json")
    public void addBooking(String Movie, String Theatre, String SeatNo, String ShowTime)
    {
        BookingDTO booking = new BookingDTO(Movie, Theatre, SeatNo,ShowTime);
        theatreService.addBooking(booking);
    }

}
