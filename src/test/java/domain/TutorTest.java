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
import domain.Tutor;
import factory.TutorFactory;
/**
 *
 * @author user
 */
public class TutorTest {
    
    public TutorTest() {
    }

    @Test
    public void testCreateTutor() throws Exception
    {
        Tutor tutor = TutorFactory.createTutor("415","J.John","0829026655");
        Assert.assertEquals(tutor.getTutorID(),"415");
        Assert.assertEquals(tutor.getTutorName(),"J.John");
        Assert.assertEquals(tutor.getContactNumber(),"0829026655");
    }
    
    @Test
    public void testUpdateTutor() throws Exception
    {
        Tutor tutor = TutorFactory.createTutor("415","J.John","0829026655");
        Tutor newTutor = new Tutor.Builder("416").tutorName("H.Jack").contactNumber("0729025566").build();
        Assert.assertEquals(newTutor.getTutorID(),"416");
        Assert.assertEquals(newTutor.getTutorName(),"H.Jack");
        Assert.assertEquals(newTutor.getContactNumber(),"0729025566");
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
