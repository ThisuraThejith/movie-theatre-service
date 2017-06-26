/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import org.movie.theatre.models.dto.CreditDTO;
import org.movie.theatre.models.dto.MobileDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.Mobile.MOBILECONTROLLER)
public class MobileController {
    
    @Autowired
    private TheatreService theatreService;

    @CrossOrigin
    @RequestMapping(value=Constants.Mobile.ADD_MOBILE, method=RequestMethod.GET, produces = "application/json")
    public void addMobile(String MobileNo, String PIN, String amount)
    {
        MobileDTO mobile = new MobileDTO(MobileNo, PIN, amount);
        theatreService.addMobile(mobile);
    }

}
