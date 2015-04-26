/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Tutor;

/**
 *
 * @author user
 */
public class TutorFactory 
{
    public static Tutor createTutor(String tutorID, String tutorName, String contactNumber)
    {
        Tutor tutor = new Tutor.Builder(tutorID).tutorName(tutorName)
                          .contactNumber(contactNumber).build();
        
        return tutor;
    }    
}
