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
@Table(name="users")
public class UsersDAO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userid;
    private String email;
    private String username;
    private String password;

    public UsersDAO()
    {

    }

    public UsersDAO(String email, String username, String password)
    {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getUserID() {
        return userid;
    }

    public void setUserID(int UserID) {
        this.userid = UserID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
}
