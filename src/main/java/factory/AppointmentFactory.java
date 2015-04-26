/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Appointment;
import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class AppointmentFactory 
{
    public static Appointment createAppointment(String appointmentID, SimpleDateFormat appointmentDate, String appointmentType, String studentID,
       String tutorID, String invigilatorID, String driverID, String venueID, String invoiceNumber, String subjectCode, String sessionID, String examID)
    {
        Appointment appointment = new Appointment.Builder(appointmentID).appointmentDate(appointmentDate)
                          .appointmentType(appointmentType).studentID(studentID).tutorID(tutorID).invigilatorID(invigilatorID).driverID(driverID).invoiceNumber(invoiceNumber).
                            subjectCode(subjectCode).sessionID(sessionID).examID(examID).build();
        
        return appointment;
    }    
}
