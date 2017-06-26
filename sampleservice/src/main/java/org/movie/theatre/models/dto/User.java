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

public class User {

    private String username;
    private String password;

    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public User() {

    }
//
//    User() { // jpa only
//    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
