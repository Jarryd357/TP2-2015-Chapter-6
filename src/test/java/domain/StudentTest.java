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
import domain.Student;
import factory.StudentFactory;

//import static org.testng.Assert.*;

/**
 *
 * @author user
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @Test
    public void testCreateStudent() throws Exception
    {
        Student student = StudentFactory.createStudent("206155247","J.Pretorius","0715015040","jardpretorius@gmail.com");
        Assert.assertEquals(student.getStudentID(),"206155247");
        Assert.assertEquals(student.getStudentName(),"J.Pretorius");
        Assert.assertEquals(student.getContactNumber(),"0715015040");
        Assert.assertEquals(student.getEmailAddress(),"jardpretorius@gmail.com");
    }
    
    @Test
    public void testUpdateStudent() throws Exception
    {
        Student student = StudentFactory.createStudent("206155247","J.Pretorius","0715015040","jardpretorius@gmail.com");
        Student newStudent = new Student.Builder("247155206").studentName("B.Roland").contactNumber("0217013157").emailAddress("brick@gmail.com").build();
        Assert.assertEquals(newStudent.getStudentID(),"247155206");
        Assert.assertEquals(newStudent.getStudentName(),"B.Roland");
        Assert.assertEquals(newStudent.getContactNumber(),"0217013157");
        Assert.assertEquals(newStudent.getEmailAddress(),"brick@gmail.com");
    }        

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
