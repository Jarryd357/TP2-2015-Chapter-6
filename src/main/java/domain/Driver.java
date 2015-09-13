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
public class Driver 
{
    private String driverID;
    private String driverName;
    private String contactNumber;
    
    private Driver(){}
    
    private Driver(Builder builder)
    {
        driverID = builder.driverID;
        driverName = builder.driverName;
        contactNumber = builder.contactNumber;
    }
    
    public static class Builder
    {
        private String driverID;
        private String driverName;
        private String contactNumber;
        
        public Builder(String driverID)
        {
            this.driverID = driverID;
        }
        
        public Builder driverName(String value)
        {
            driverName = value;
            return this;
        }
        
        public Builder contactNumber(String value)
        {
            contactNumber = value;
            return this;
        }
        
        public Driver build()
        {
            return new Driver(this);
        }
    }

    public String getDriverID() {
        return driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;

        Driver driver = (Driver) o;

        return !(driverID != null ? !driverID.equals(driver.driverID) : driver.driverID != null);

    }

    @Override
    public int hashCode() 
    {
        return driverID != null ? driverID.hashCode() : 0;
    }
}
