/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.Model;
import java.sql.Date;
/**
 *
 * @author ESTUDIANTE
 */
public class Invoice {
    private long id;
    private Person personId;
    private Parthers parthersId;
    private Date CreationDate;
    
    public Invoice(){
    
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

    public Parthers getParthersId() {
        return parthersId;
    }

    public void setParthersId(Parthers parthersId) {
        this.parthersId = parthersId;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }
    
}
