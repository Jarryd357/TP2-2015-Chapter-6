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
import factory.DriverFactory;
import org.testng.annotations.Test;
import domain.Driver;

/**
 *
 * @author user
 */
public class DriverTest {
    
    public DriverTest() {
    }

    @Test
    public void testCreateDriver() throws Exception
    {
        Driver driver = DriverFactory.createDriver("015","R.Guy","0215014050");
        Assert.assertEquals(driver.getDriverID(),"015");
        Assert.assertEquals(driver.getDriverName(),"R.Guy");
        Assert.assertEquals(driver.getContactNumber(),"0215014050");
    }
    
    @Test
    public void testUpdateDriver() throws Exception
    {
        Driver driver = DriverFactory.createDriver("015","R.Guy","0215014050");
        Driver newDriver = new Driver.Builder(driver.getDriverID()).driverName(driver.getDriverName()).contactNumber("0815015040").build();
        Assert.assertEquals(newDriver.getDriverID(),"015");
        Assert.assertEquals(newDriver.getDriverName(),"R.Guy");
        Assert.assertEquals(newDriver.getContactNumber(),"0815015040");
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
