/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.repositories;

import org.movie.theatre.models.dao.TheatreDAO;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author THISURA THEJITH
 */
public interface TheatreRepository extends CrudRepository<TheatreDAO,Long> {
    
}
