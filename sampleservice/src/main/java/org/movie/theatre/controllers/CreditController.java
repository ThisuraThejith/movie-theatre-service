/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.controllers;

import org.movie.theatre.models.dto.BookingDTO;
import org.movie.theatre.models.dto.CreditDTO;
import org.movie.theatre.services.TheatreService;
import org.movie.theatre.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.Credit.CREDITCONTROLLER)
public class CreditController {
    
    @Autowired
    private TheatreService theatreService;

    @CrossOrigin
    @RequestMapping(value=Constants.Credit.ADD_CREDIT, method=RequestMethod.GET, produces = "application/json")
    public void addCredit(int CCNo, String amount, String CVCNo, String name)
    {
        CreditDTO credit = new CreditDTO(CCNo, amount, CVCNo, name);
        theatreService.addCredit(credit);
    }

}
