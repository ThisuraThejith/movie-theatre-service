/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.models.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatres")
public class TheatreDAO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    //@Column(name="MovieID")
    private int theatreid;
    //@Column(name="MovieName")
    private String nameandlocation;


    public TheatreDAO(){};


    public int getTheatreID() {
        return theatreid;
    }

    public void setTheatreID(int TheatreID) {
        this.theatreid = TheatreID;
    }

    public String getNameandLocation() {
        return nameandlocation;
    }

    public void setNameandLocation(String NameandLocation) {
        this.nameandlocation = NameandLocation;
    }
}
