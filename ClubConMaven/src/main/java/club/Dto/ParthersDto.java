/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.Dto;

import club.Model.Person;
import java.sql.Date;
import java.sql.Types;

/**
 *
 * @author ESTUDIANTE
 */
public class ParthersDto {
    private long id;
    private Person personId;
    private long AvailableFunds;
    private Types SubscriptionType;
    private Date SharpeningDate;
    
    public ParthersDto(){
    
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public long getAvailableFunds() {
        return AvailableFunds;
    }

    public void setAvailableFunds(long AvailableFunds) {
        this.AvailableFunds = AvailableFunds;
    }

    public Types getSubscriptionType() {
        return SubscriptionType;
    }

    public void setSubscriptionType(Types SubscriptionType) {
        this.SubscriptionType = SubscriptionType;
    }

    public Date getSharpeningDate() {
        return SharpeningDate;
    }

    public void setSharpeningDate(Date SharpeningDate) {
        this.SharpeningDate = SharpeningDate;
    }

}
