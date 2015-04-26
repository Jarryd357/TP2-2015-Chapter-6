/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.TutSession;

/**
 *
 * @author user
 */
public class TutSessionFactory 
{
    public static TutSession createTutSession(String sessionID, String sessionType, String sessionDescription, double sessionPrice)
    {
        TutSession tutSession = new TutSession.Builder(sessionID).sessionType(sessionType)
                          .sessionDescription(sessionDescription).sessionPrice(sessionPrice).build();
        
        return tutSession;
    }    
}
