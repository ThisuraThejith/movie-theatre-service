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
@Table(name="creditcard")
public class CreditDAO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int id;
    private int ccno;
    private String amount;
    private String cvcno;
    private String name;


    public CreditDAO(){

    }

    public CreditDAO(int ccno, String amount, String cvcno, String name)
    {
        this.ccno = ccno;
        this.amount = amount;
        this.cvcno = cvcno;
        this.name = name;
    }


    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getCCNo() {
        return ccno;
    }

    public void setCCNo(int CCNo) {
        this.ccno = CCNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String Amount) {
        this.amount = Amount;
    }

    public String getCVCNo() {
        return cvcno;
    }

    public void setCVCNo(String CVCNo) {
        this.cvcno = CVCNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

}
