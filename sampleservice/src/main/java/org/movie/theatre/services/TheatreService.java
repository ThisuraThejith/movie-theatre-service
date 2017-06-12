/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.services;

import java.util.ArrayList;
import java.util.List;
import org.movie.theatre.models.dao.MoviesDAO;
import org.movie.theatre.models.dto.MovieDTO;
import org.movie.theatre.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {
    
    @Autowired
    private MovieRepository movieRepo;
    
    public List<MovieDTO> getMovies(){
       List<MovieDTO> movieResponse = new ArrayList<MovieDTO>();
       Iterable<MoviesDAO> movies = movieRepo.findAll();
       for(MoviesDAO movie : movies){
            MovieDTO movieDTO = new MovieDTO(movie.getMovieID(),movie.getMovieName(),movie.getDirector(),movie.getMainActor());
            movieResponse.add(movieDTO);
       }
       return movieResponse;
    }
}
