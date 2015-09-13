/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;
import java.util.Date;

/**
 *
 * @author user
 */
public class Payment 
{
    private String invoiceNumber;
    private String paymentMethod;
    private Date paymentDate;
    
    private Payment(){}
    
    private Payment(Builder builder)
    {
        invoiceNumber = builder.invoiceNumber;
        paymentMethod = builder.paymentMethod;
        paymentDate = builder.paymentDate;
    }
    
    public static class Builder
    {
        private String invoiceNumber;
        private String paymentMethod;
        private Date paymentDate;
        
        public Builder(String invoiceNumber)
        {
            this.invoiceNumber = invoiceNumber;
        }
        
        public Builder paymentMethod(String value)
        {
            paymentMethod = value;
            return this;
        }
        
        public Builder paymentDate(Date value)
        {
            paymentDate = value;
            return this;
        }
        
        public Payment build()
        {
            return new Payment(this);
        }
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;

        return !(invoiceNumber != null ? !invoiceNumber.equals(payment.invoiceNumber) : payment.invoiceNumber != null);

    }

    @Override
    public int hashCode() 
    {
        return invoiceNumber != null ? invoiceNumber.hashCode() : 0;
    }
}
