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
import domain.TutSession;
import factory.TutSessionFactory;

/**
 *
 * @author user
 */
public class TutSessionTest {
    
    public TutSessionTest() {
    }

    @Test
    public void testCreateTutSession() throws Exception
    {
        TutSession tutSession = TutSessionFactory.createTutSession("S001","Short","IP3 Theory",149.99);
        Assert.assertEquals(tutSession.getSessionID(),"S001");
        Assert.assertEquals(tutSession.getSessionType(),"Short");
        Assert.assertEquals(tutSession.getSessionDescription(),"IP3 Theory");
        Assert.assertEquals(tutSession.getSessionPrice(), 149.99);
    }
    
    @Test
    public void testUpdateTutSession() throws Exception
    {
        TutSession tutSession = TutSessionFactory.createTutSession("S001","Short","IP3 Theory",149.99);
        TutSession newTutSession = new TutSession.Builder("S001").sessionType("Extensive").sessionDescription("IP3 Practical").sessionPrice(199.99).build();
        Assert.assertEquals(newTutSession.getSessionID(),"S001");
        Assert.assertEquals(newTutSession.getSessionType(),"Extensive");
        Assert.assertEquals(newTutSession.getSessionDescription(),"IP3 Practical");
        Assert.assertEquals(newTutSession.getSessionPrice(), 199.99);
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
