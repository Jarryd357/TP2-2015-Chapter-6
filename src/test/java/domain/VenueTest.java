/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import domain.Venue;
import factory.VenueFactory;

/**
 *
 * @author user
 */
public class VenueTest {
    
    public VenueTest() {
    }

    @Test
    public void testCreateVenue() throws Exception
    {
        Venue venue = VenueFactory.createVenue("2B","Computer Lab 2","Town Campus");
        Assert.assertEquals(venue.getVenueID(),"2B");
        Assert.assertEquals(venue.getVenueName(),"Computer Lab 2");
        Assert.assertEquals(venue.getVenueLocation(),"Town Campus");
    }
    
    @Test
    public void testUpdateVenue() throws Exception
    {
        Venue venue = VenueFactory.createVenue("2B","Computer Lab 2","Town Campus");
        Venue newVenue = new Venue.Builder("1D").venueName("Room 4").venueLocation("Town Campus").build();
        Assert.assertEquals(newVenue.getVenueID(),"1D");
        Assert.assertEquals(newVenue.getVenueName(),"Room 4");
        Assert.assertEquals(newVenue.getVenueLocation(),"Town Campus");
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
