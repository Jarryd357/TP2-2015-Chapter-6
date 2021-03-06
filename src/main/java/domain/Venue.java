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
public class Venue 
{
    private String venueID;
    private String venueName;
    private String venueLocation;
    
    private Venue(){}
    
    private Venue(Builder builder)
    {
        venueID = builder.venueID;
        venueName = builder.venueName;
        venueLocation = builder.venueLocation;
    }
    
    public static class Builder
    {
        private String venueID;
        private String venueName;
        private String venueLocation;
        
        public Builder(String venueID)
        {
            this.venueID = venueID;
        }
        
        public Builder venueName(String value)
        {
            venueName = value;
            return this;
        }
        
        public Builder venueLocation(String value)
        {
            venueLocation = value;
            return this;
        }
        
        public Venue build()
        {
            return new Venue(this);
        }
    }

    public String getVenueID() {
        return venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getVenueLocation() {
        return venueLocation;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Tutor)) return false;

        Venue venue = (Venue) o;

        return !(venueID != null ? !venueID.equals(venue.venueID) : venue.venueID != null);

    }

    @Override
    public int hashCode() 
    {
        return venueID != null ? venueID.hashCode() : 0;
    }
}
