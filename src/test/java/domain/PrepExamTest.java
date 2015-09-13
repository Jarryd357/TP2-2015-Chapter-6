/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import domain.PrepExam;
import factory.PrepExamFactory;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class PrepExamTest {
    
    public PrepExamTest() {
    }

    @Test
    public void testCreatePrepExam() throws Exception
    {
        PrepExam prepExam = PrepExamFactory.createPrepExam("101","Practical","2 hours coding", 120.00);
        Assert.assertEquals(prepExam.getExamID(),"101");
        Assert.assertEquals(prepExam.getExamType(),"Practical");
        Assert.assertEquals(prepExam.getExamDescription(),"2 hours coding");
        Assert.assertEquals(prepExam.getExamPrice(),120.00);
    }
    
    @Test
    public void testUpdatePrepExam() throws Exception
    {
        PrepExam prepExam = PrepExamFactory.createPrepExam("101","Practical","2 hours coding", 120.00);
        PrepExam newPrepExam = new PrepExam.Builder(prepExam.getExamID()).examType(prepExam.getExamType()).examDescription("5 hours coding").examPrice(150.00).build();
        Assert.assertEquals(newPrepExam.getExamID(),"101");
        Assert.assertEquals(newPrepExam.getExamType(),"Practical");
        Assert.assertEquals(newPrepExam.getExamDescription(),"5 hours coding");
        Assert.assertEquals(newPrepExam.getExamPrice(),150.00);
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
