/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.models.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author THISURA THEJITH
 */
public class MovieDTO {
        
    
    private int MovieID;
    private String MovieName;
    private String Director;
    private String MainActor;
    
    
    public MovieDTO(int MovieID,String MovieName,String Director,String MainActor){
        
        this.MovieID=MovieID;
        this.MovieName=MovieName;
        this.Director=Director;
        this.MainActor=MainActor;
        
        
    } 

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int MovieID) {
        this.MovieID = MovieID;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String MovieName) {
        this.MovieName = MovieName;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getMainActor() {
        return MainActor;
    }

    public void setMainActor(String MainActor) {
        this.MainActor = MainActor;
    }
    
}
