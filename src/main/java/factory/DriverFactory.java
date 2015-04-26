/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import domain.Driver;

/**
 *
 * @author user
 */
public class DriverFactory 
{
    public static Driver createDriver(String driverID, String driverName, String contactNumber)
    {
        Driver driver = new Driver.Builder(driverID).driverName(driverName)
                          .contactNumber(contactNumber).build();
        
        return driver;
    }       
}
