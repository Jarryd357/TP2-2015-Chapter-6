/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author user
 */
public class Tutor 
{
    private String tutorID;
    private String tutorName;
    private String contactNumber;
    
    private Tutor(){}
    
    private Tutor(Builder builder)
    {
        tutorID = builder.tutorID;
        tutorName = builder.tutorName;
        contactNumber = builder.contactNumber;
    }
    
    public static class Builder
    {
        private String tutorID;
        private String tutorName;
        private String contactNumber;
        
        public Builder(String tutorID)
        {
            this.tutorID = tutorID;
        }
        
        public Builder tutorName(String value)
        {
            tutorName = value;
            return this;
        }
        
        public Builder contactNumber(String value)
        {
            contactNumber = value;
            return this;
        } 
        
        public Tutor build()
        {
            return new Tutor(this);
        }
    }

    public String getTutorID() {
        return tutorID;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Tutor)) return false;

        Tutor tutor = (Tutor) o;

        return !(tutorID != null ? !tutorID.equals(tutor.tutorID) : tutor.tutorID != null);

    }

    @Override
    public int hashCode() 
    {
        return tutorID != null ? tutorID.hashCode() : 0;
    }
}
