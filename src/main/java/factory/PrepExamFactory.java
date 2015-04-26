/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.PrepExam;

/**
 *
 * @author user
 */
public class PrepExamFactory 
{
    public static PrepExam createPrepExam(String examID, String examType, String examDescription, double examPrice)
    {
        PrepExam prepExam = new PrepExam.Builder(examID).examType(examType)
                          .examDescription(examDescription).examPrice(examPrice).build();
        
        return prepExam;
    }    
}
