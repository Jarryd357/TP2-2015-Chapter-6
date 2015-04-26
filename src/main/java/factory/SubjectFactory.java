/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Subject;

/**
 *
 * @author user
 */
public class SubjectFactory 
{
    public static Subject createSubject(String subjectCode, String subjectName, String Stream)
    {
        Subject subject = new Subject.Builder(subjectCode).subjectName(subjectName)
                          .Stream(Stream).build();
        
        return subject;
    }    
}
