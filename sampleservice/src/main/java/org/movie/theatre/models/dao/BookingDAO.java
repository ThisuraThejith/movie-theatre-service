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
@Table(name="booking")
public class BookingDAO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int bookingid;
    private String movie;
    private String theatre;
    private String seatno;
    private String showtime;

    public BookingDAO(){

    }

    public BookingDAO(String movie, String theatre, String seatno, String showtime)
    {
        this.movie = movie;
        this.theatre = theatre;
        this.seatno = seatno;
        this.showtime = showtime;
    }
    
    public int getBookingID() {
        return bookingid;
    }

    public void setBookingID(int BookingID) {
        this.bookingid = BookingID;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String Movie) {
        this.movie = Movie;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String Theatre) {
        this.theatre = Theatre;
    }

    public String getSeatNo() {
        return seatno;
    }

    public void setSeatNo(String SeatNo) {
        this.seatno = SeatNo;
    }

    public String getShowTime() {
        return showtime;
    }

    public void setShowTime(String ShowTime) {
        this.showtime = ShowTime;
    }
}
