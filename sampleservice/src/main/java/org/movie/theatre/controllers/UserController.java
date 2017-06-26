/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import org.movie.theatre.models.dto.TheatreDTO;
import org.movie.theatre.models.dto.User;
import org.movie.theatre.models.dto.UsersDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(Constants.User.USERCONTROLLER)
public class UserController {
    
    @Autowired
    private TheatreService theatreService;

    @CrossOrigin
    @RequestMapping(value=Constants.User.ADD_USER, method=RequestMethod.GET, produces = "application/json")
    public void addUser(String email, String username, String password)
    {
        UsersDTO user = new UsersDTO(email, username, password);
        theatreService.addUser(user);
    }

    @CrossOrigin
    @RequestMapping(value=Constants.User.GET_USER, method=RequestMethod.GET, produces = "application/json")
    public boolean validate(String email, String password)
    {
        boolean status = theatreService.validateUser(email, password);
        return status;
    }
}
