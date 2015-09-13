/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;
import java.util.Date;
//import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class Appointment 
{
    private String appointmentID;
    private Date appointmentDate;
    private String appointmentType;
    private String studentID;
    private String tutorID;
    private String invigilatorID;
    private String driverID;
    private String venueID;
    private String invoiceNumber;
    private String subjectCode;
    private String sessionID;
    private String examID;
    
    private Appointment(){}
    
    private Appointment(Builder builder)
    {
        appointmentID = builder.appointmentID;
        appointmentDate = builder.appointmentDate;
        appointmentType = builder.appointmentType;
        studentID = builder.studentID;
        tutorID = builder.tutorID;
        invigilatorID = builder.invigilatorID;
        driverID = builder.driverID;
        venueID = builder.venueID;
        invoiceNumber = builder.invoiceNumber;
        subjectCode = builder.subjectCode;
        sessionID = builder.sessionID;
        examID = builder.examID;
    }
    
    public static class Builder
    {
        private String appointmentID;
        private Date appointmentDate;
        private String appointmentType;
        private String studentID;
        private String tutorID;
        private String invigilatorID;
        private String driverID;
        private String venueID;
        private String invoiceNumber;
        private String subjectCode;
        private String sessionID;
        private String examID;
        
        public Builder(String appointmentID)
        {
            this.appointmentID = appointmentID;
        }
        
        public Builder appointmentDate(Date value)
        {
            appointmentDate = value;
            return this;
        }
        
        public Builder appointmentType(String value)
        {
            appointmentType = value;
            return this;
        }
        
        public Builder studentID(String value)
        {
            studentID = value;
            return this;
        }
        
        public Builder tutorID(String value)
        {
            tutorID = value;
            return this;
        }
        
        public Builder invigilatorID(String value)
        {
            invigilatorID = value;
            return this;
        }
        
        public Builder driverID(String value)
        {
            driverID = value;
            return this;
        }
        
        public Builder venueID(String value)
        {
            venueID = value;
            return this;
        }
        
        public Builder invoiceNumber(String value)
        {
            invoiceNumber = value;
            return this;
        }
        
        public Builder subjectCode(String value)
        {
            subjectCode = value;
            return this;
        }
        
        public Builder sessionID(String value)
        {
            sessionID = value;
            return this;
        }
        
        public Builder examID(String value)
        {
            examID = value;
            return this;
        }
        
        public Appointment build()
        {
            return new Appointment(this);
        }
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getTutorID() {
        return tutorID;
    }

    public String getInvigilatorID() {
        return invigilatorID;
    }

    public String getDriverID() {
        return driverID;
    }

    public String getVenueID() {
        return venueID;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSessionID() {
        return sessionID;
    }

    public String getExamID() {
        return examID;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;

        Appointment appointment = (Appointment) o;

        return !(appointmentID != null ? !appointmentID.equals(appointment.appointmentID) : appointment.appointmentID != null);

    }

    @Override
    public int hashCode() 
    {
        return appointmentID != null ? appointmentID.hashCode() : 0;
    }
}
