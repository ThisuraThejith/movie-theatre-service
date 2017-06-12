/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.models.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class MoviesDAO {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    //@Column(name="MovieID")
    private int movieid;
    //@Column(name="MovieName")
    private String moviename;
    //@Column(name="Director")
    private String director;
    //@Column(name="MainActor")
    private String mainactor;
    
    public MoviesDAO(){};
    
    
    public int getMovieID() {
        return movieid;
    }

    public void setMovieID(int MovieID) {
        this.movieid = MovieID;
    }

    public String getMovieName() {
        return moviename;
    }

    public void setMovieName(String MovieName) {
        this.moviename = MovieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String Director) {
        this.director = Director;
    }

    public String getMainActor() {
        return mainactor;
    }

    public void setMainActor(String MainActor) {
        this.mainactor = MainActor;
    }
}
