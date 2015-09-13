/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import domain.Appointment;
import factory.AppointmentFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }

    @Test
    public void testCreateAppointment() throws Exception
    {
        String appDate = "12-05-2015";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date appointmentDate = sdf.parse(appDate);
        Appointment appointment = AppointmentFactory.createAppointment("001",appointmentDate,"TutSession","206155247","415","N/A","06","2A","555422","IRP300S","10","N/A");
        Assert.assertEquals(appointment.getAppointmentID(),"001");
        Assert.assertEquals(appointment.getAppointmentDate(),appointmentDate);
        Assert.assertEquals(appointment.getAppointmentType(),"TutSession");
        Assert.assertEquals(appointment.getStudentID(),"206155247");
        Assert.assertEquals(appointment.getTutorID(),"415");
        Assert.assertEquals(appointment.getInvigilatorID(),"N/A");
        Assert.assertEquals(appointment.getDriverID(),"06");
        Assert.assertEquals(appointment.getVenueID(),"2A");
        Assert.assertEquals(appointment.getInvoiceNumber(),"555422");
        Assert.assertEquals(appointment.getSubjectCode(),"IRP300S");
        Assert.assertEquals(appointment.getSessionID(),"10");
        Assert.assertEquals(appointment.getExamID(),"N/A");
        
    }
    
    @Test
    public void testUpdateAppointment() throws Exception
    {   
        String appDate = "12-05-2015";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date appointmentDate = sdf.parse(appDate);
        Appointment appointment = AppointmentFactory.createAppointment("001",appointmentDate,"TutSession","206155247","415","N/A","06","2A","555422","IRP300S","10","N/A");
             
        String newAppDate = "26-05-2015";
        SimpleDateFormat nsdf = new SimpleDateFormat("dd-MM-yyyy");
        Date newAppointmentDate = nsdf.parse(newAppDate);
        
        Appointment newAppointment = new Appointment.Builder("003").appointmentDate(newAppointmentDate).appointmentType("PrepExam").studentID("206155247").tutorID("N/A").invigilatorID("101").driverID("06").venueID("H1").invoiceNumber("555422").subjectCode("TPG200S").sessionID("N/A").examID("11A").build();
        Assert.assertEquals(newAppointment.getAppointmentID(),"003");
        Assert.assertEquals(newAppointment.getAppointmentDate(),newAppointmentDate);
        Assert.assertEquals(newAppointment.getAppointmentType(),"PrepExam");
        Assert.assertEquals(newAppointment.getStudentID(),"206155247");
        Assert.assertEquals(newAppointment.getTutorID(),"N/A");
        Assert.assertEquals(newAppointment.getInvigilatorID(),"101");
        Assert.assertEquals(newAppointment.getDriverID(),"06");
        Assert.assertEquals(newAppointment.getVenueID(),"H1");
        Assert.assertEquals(newAppointment.getInvoiceNumber(),"555422");
        Assert.assertEquals(newAppointment.getSubjectCode(),"TPG200S");
        Assert.assertEquals(newAppointment.getSessionID(),"N/A");
        Assert.assertEquals(newAppointment.getExamID(),"11A");
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
