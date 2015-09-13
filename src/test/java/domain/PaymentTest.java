/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import domain.Payment;
import factory.PaymentFactory;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class PaymentTest {
    
    public PaymentTest() {
    }

    @Test
    public void testCreatePayment() throws Exception
    {
        String payDate = "07-04-2015";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date paymentDate = sdf.parse(payDate);
        
        Payment payment = PaymentFactory.createPayment("0001","Cheque",paymentDate);
        Assert.assertEquals(payment.getInvoiceNumber(),"0001");
        Assert.assertEquals(payment.getPaymentMethod(),"Cheque");
        Assert.assertEquals(payment.getPaymentDate(),paymentDate);
    }
    
    @Test
    public void testUpdatePayment() throws Exception
    {
        String payDate = "07-04-2015";
        String newPayDate = "05-04-2015";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date paymentDate = sdf.parse(payDate);
        Date newPaymentDate = sdf.parse(newPayDate);
        
        Payment payment = PaymentFactory.createPayment("0001","Cheque",paymentDate);
        Payment newPayment = new Payment.Builder(payment.getInvoiceNumber()).paymentMethod("Cash").paymentDate(newPaymentDate).build();
        Assert.assertEquals(newPayment.getInvoiceNumber(),"0001");
        Assert.assertEquals(newPayment.getPaymentMethod(),"Cash");
        Assert.assertEquals(newPayment.getPaymentDate(),newPaymentDate);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
