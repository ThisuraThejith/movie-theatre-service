/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.repositories;

import org.movie.theatre.models.dao.BookingDAO;
import org.movie.theatre.models.dao.CreditDAO;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author THISURA THEJITH
 */
public interface CreditRepository extends CrudRepository<CreditDAO,Long> {
    
}
