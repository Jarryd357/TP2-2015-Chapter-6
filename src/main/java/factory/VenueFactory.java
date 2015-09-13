/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Venue;

/**
 *
 * @author user
 */
public class VenueFactory 
{
    public static Venue createVenue(String venueID, String venueName, String venueLocation)
    {
        Venue venue = new Venue.Builder(venueID).venueName(venueName)
                          .venueLocation(venueLocation).build();
        
        return venue;
    }    
}
