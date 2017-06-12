/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import java.util.List;
import org.movie.theatre.models.dto.MovieDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.Movie.CONTROLLER)
public class MovieController {
    
    @Autowired
    private TheatreService theatreService;
    
    @RequestMapping(value=Constants.Movie.GET_MOVIES, method=RequestMethod.GET, produces = "application/json")
    public List<MovieDTO> getMovies(){
        return theatreService.getMovies(); 
    }
}
