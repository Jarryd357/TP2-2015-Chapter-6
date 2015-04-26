/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Invigilator;

/**
 *
 * @author user
 */
public class InvigilatorFactory 
{
    public static Invigilator createInvigilator(String invigilatorID, String invigilatorName, String contactNumber)
    {
        Invigilator invigilator = new Invigilator.Builder(invigilatorID).invigilatorName(invigilatorName)
                          .contactNumber(contactNumber).build();
        
        return invigilator;
    }    
}
