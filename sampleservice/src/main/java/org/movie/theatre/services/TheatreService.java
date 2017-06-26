/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.services;

import java.util.ArrayList;
import java.util.List;
import org.movie.theatre.models.dao.MoviesDAO;
import org.movie.theatre.models.dao.TheatreDAO;
import org.movie.theatre.models.dao.UsersDAO;
import org.movie.theatre.models.dto.MovieDTO;
import org.movie.theatre.models.dto.TheatreDTO;
import org.movie.theatre.models.dto.UsersDTO;
import org.movie.theatre.repositories.MovieRepository;
import org.movie.theatre.repositories.TheatreRepository;
import org.movie.theatre.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {
    
    @Autowired
    private MovieRepository movieRepo;

    //Service to get all movies
    public List<MovieDTO> getMovies(){
       List<MovieDTO> movieResponse = new ArrayList<MovieDTO>();
       Iterable<MoviesDAO> movies = movieRepo.findAll();
       for(MoviesDAO movie : movies){
            MovieDTO movieDTO = new MovieDTO(movie.getMovieID(),movie.getMovieName(),movie.getDirector(),movie.getMainActor());
            movieResponse.add(movieDTO);
       }
       return movieResponse;
    }


    @Autowired
    private TheatreRepository theatreRepo;

    //Service to get all theatres
    public List<TheatreDTO> getTheatres(){
        List<TheatreDTO> theatreResponse = new ArrayList<TheatreDTO>();
        Iterable<TheatreDAO> theatres = theatreRepo.findAll();
        for(TheatreDAO theatre : theatres){
            TheatreDTO theatreDTO = new TheatreDTO(theatre.getTheatreID(),theatre.getNameandLocation());
            theatreResponse.add(theatreDTO);
        }
        return theatreResponse;
    }


    @Autowired
    private UserRepository userRepo;

//    public void addUser(UsersDTO item){
//
//        Iterable<UsersDAO> users = userRepo.findAll();
//
//        List<UsersDTO> userResponse = new ArrayList<>();
//        List<UsersDAO> userList = new ArrayList<>();
//
//        for(UsersDAO user : users){
//            UsersDTO userDTO = new UsersDTO(user.getUserID(), user.getEmail(),user.getUsername(), user.getPassword());
//            userResponse.add(userDTO);
//        }
//
//        userResponse.add(item);
//
//        for(UsersDTO user : userResponse){
//            UsersDAO userDAO = new UsersDAO(user.getUserID(), user.getEmail(),user.getUsername(), user.getPassword());
//            userList.add(userDAO);
//        }
//
//        Iterable<UsersDAO> iterable = userList;
//
//        UsersDAO xxx = new UsersDAO();
//        userRepo.save(xxx);
//    }

    //Service to add a new user to the database
    public void addUser(UsersDTO user){

        UsersDAO userDAO = new UsersDAO(user.getEmail(),user.getUsername(), user.getPassword());
        userRepo.save(userDAO);
    }


    //Service to validate/autenticate a user when logging in
    public boolean validateUser(String email, String password){

        List<UsersDTO> userResponse = new ArrayList<UsersDTO>();
        Iterable<UsersDAO> users = userRepo.findAll();
        for(UsersDAO user : users){

            String email2 = user.getEmail();
            String password2 = user.getPassword();

            if (email.equals(email2) && password.equals(password2))
            {
                return true;
            }
        }
        return false;
    }
}
