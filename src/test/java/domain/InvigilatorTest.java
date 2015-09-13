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
import domain.Invigilator;
import factory.InvigilatorFactory;

/**
 *
 * @author user
 */
public class InvigilatorTest {
    
    public InvigilatorTest() {
    }

    @Test
    public void testCreateInvigilator() throws Exception
    {
        Invigilator invigilator = InvigilatorFactory.createInvigilator("110","R.Ritchie","0727023344");
        Assert.assertEquals(invigilator.getInvigilatorID(),"110");
        Assert.assertEquals(invigilator.getInvigilatorName(),"R.Ritchie");
        Assert.assertEquals(invigilator.getContactNumber(),"0727023344");
    }
    
    @Test
    public void testUpdateInvigilator() throws Exception
    {
        Invigilator invigilator = InvigilatorFactory.createInvigilator("110","R.Ritchie","0727023344");
        Invigilator newInvigilator = new Invigilator.Builder(invigilator.getInvigilatorID()).invigilatorName(invigilator.getInvigilatorName()).contactNumber("0743041122").build();
        Assert.assertEquals(newInvigilator.getInvigilatorID(),"110");
        Assert.assertEquals(newInvigilator.getInvigilatorName(),"R.Ritchie");
        Assert.assertEquals(newInvigilator.getContactNumber(),"0743041122");
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
