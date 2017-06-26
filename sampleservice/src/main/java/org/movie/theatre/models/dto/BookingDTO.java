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
public class BookingDTO {


    private int bookingid;
    private String movie;
    private String theatre;
    private String seatno;
    private String showtime;

    public  BookingDTO(){

    }


    public BookingDTO(int BookingID, String Movie, String Theatre, String SeatNo, String Showtime){
        
        this.bookingid=BookingID;
        this.movie=Movie;
        this.theatre=Theatre;
        this.seatno=SeatNo;
        this.showtime=Showtime;
        
    }

    public BookingDTO(String Movie, String Theatre, String SeatNo, String Showtime){

        this.movie=Movie;
        this.theatre=Theatre;
        this.seatno=SeatNo;
        this.showtime=Showtime;

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
