/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Student;

/**
 *
 * @author user
 */
public class StudentFactory 
{
    public static Student createStudent(String studentID, String studentName, String contactNumber, String emailAddress)
    {
        Student student = new Student.Builder(studentID).studentName(studentName)
                          .contactNumber(contactNumber).emailAddress(emailAddress).build();
        
        return student;
    }        
}
