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
public class MobileDTO {

    private int id;
    private String mobileno;
    private String pin;
    private String amount;


    public MobileDTO(){


    }

    public MobileDTO(int id, String mobileno, String pin, String amount)
    {
        this.id=id;
        this.mobileno = mobileno;
        this.pin = pin;
        this.amount = amount;
    }

    public MobileDTO(String mobileno, String pin, String amount)
    {
        this.mobileno = mobileno;
        this.pin = pin;
        this.amount = amount;
    }


    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
}
