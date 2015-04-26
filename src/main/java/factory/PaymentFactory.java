/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Payment;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class PaymentFactory 
{
    public static Payment createPayment(String invoiceNumber, String paymentMethod, SimpleDateFormat Date)
    {
        Payment payment = new Payment.Builder(invoiceNumber).paymentMethod(paymentMethod)
                          .Date(Date).build();
        
        return payment;
    }    
}
