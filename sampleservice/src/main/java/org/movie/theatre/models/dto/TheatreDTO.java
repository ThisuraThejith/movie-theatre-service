/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.models.dto;

/**
 *
 * @author THISURA THEJITH
 */
public class TheatreDTO {


    private int theatreID;
    private String nameandLocation;


    public TheatreDTO(int TheatreID,String NameandLocation){

        this.theatreID =TheatreID;
        this.nameandLocation =NameandLocation;

    }

    public int getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(int TheatreID) {
        this.theatreID = TheatreID;
    }

    public String getNameandLocation() {
        return nameandLocation;
    }

    public void setNameandLocation(String NameandLocation) {
        this.nameandLocation = NameandLocation;
    }

}
