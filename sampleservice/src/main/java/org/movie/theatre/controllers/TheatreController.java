/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import org.movie.theatre.models.dto.MovieDTO;
import org.movie.theatre.models.dto.TheatreDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(Constants.Theatre.THEATRECONTROLLER)
public class TheatreController {
    
    @Autowired
    private TheatreService theatreService;

    @CrossOrigin
    @RequestMapping(value=Constants.Theatre.GET_THEATRES, method=RequestMethod.GET, produces = "application/json")
    public List<TheatreDTO> getTheatres()
    {
        return theatreService.getTheatres();
    }
}
