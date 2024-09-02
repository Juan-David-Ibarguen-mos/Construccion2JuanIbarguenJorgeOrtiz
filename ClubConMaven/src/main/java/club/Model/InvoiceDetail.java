/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.Model;

/**
 *
 * @author ESTUDIANTE
 */
public class InvoiceDetail {
    private long id;
    private Invoice invoiceId;
    private long ItemNumber;
    private String concept;
    private long ItemValue;
    
    public InvoiceDetail(){
    
    } 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(long ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public long getItemValue() {
        return ItemValue;
    }

    public void setItemValue(long ItemValue) {
        this.ItemValue = ItemValue;
    }
    
}
