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
import domain.Subject;
import factory.SubjectFactory;

/**
 *
 * @author user
 */
public class SubjectTest {
    
    public SubjectTest() {
    }

    @Test
    public void testCreateSubject() throws Exception
    {
        Subject subject = SubjectFactory.createSubject("IRP300S","Internet Programming 3","Soft. Dev.");
        Assert.assertEquals(subject.getSubjectCode(),"IRP300S");
        Assert.assertEquals(subject.getSubjectName(),"Internet Programming 3");
        Assert.assertEquals(subject.getStream(),"Soft. Dev.");
    }
    
    @Test
    public void testUpdateSubject() throws Exception
    {
        Subject subject = SubjectFactory.createSubject("IRP300S","Internet Programming 3","Soft. Dev.");
        Subject newSubject = new Subject.Builder("TPG200S").subjectName("Technical Programming 2").Stream("Soft. Dev.").build();
        Assert.assertEquals(newSubject.getSubjectCode(),"TPG200S");
        Assert.assertEquals(newSubject.getSubjectName(),"Technical Programming 2");
        Assert.assertEquals(newSubject.getStream(),"Soft. Dev.");
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
