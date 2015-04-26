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
public class Invigilator 
{
    private String invigilatorID;
    private String invigilatorName;
    private String contactNumber;
    
    private Invigilator(){}
    
    private Invigilator(Builder builder)
    {
        invigilatorID = builder.invigilatorID;
        invigilatorName = builder.invigilatorName;
        contactNumber = builder.contactNumber;
    }
    
    public static class Builder
    {
        private String invigilatorID;
        private String invigilatorName;
        private String contactNumber;
        
        public Builder(String invigilatorID)
        {
            this.invigilatorID = invigilatorID;
        }
        
        public Builder invigilatorName(String value)
        {
            invigilatorName = value;
            return this;
        }
        
        public Builder contactNumber(String value)
        {
            contactNumber = value;
            return this;
        }
        
        public Invigilator build()
        {
            return new Invigilator(this);
        }
    }

    public String getInvigilatorID() {
        return invigilatorID;
    }

    public String getInvigilatorName() {
        return invigilatorName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Tutor)) return false;

        Invigilator invigilator = (Invigilator) o;

        return !(invigilatorID != null ? !invigilatorID.equals(invigilator.invigilatorID) : invigilator.invigilatorID != null);

    }

    @Override
    public int hashCode() 
    {
        return invigilatorID != null ? invigilatorID.hashCode() : 0;
    }
}
