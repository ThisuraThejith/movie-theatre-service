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
public class UsersDTO {


    private int UserID;
    private String Email;
    private String Username;
    private String Password;

    public UsersDTO(){}

    public UsersDTO(int UserID, String Email, String Username, String Password){

        this.UserID=UserID;
        this.Email=Email;
        this.Username=Username;
        this.Password=Password;
    }

    public UsersDTO(String Email, String Username, String Password){

        this.Email=Email;
        this.Username=Username;
        this.Password=Password;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
