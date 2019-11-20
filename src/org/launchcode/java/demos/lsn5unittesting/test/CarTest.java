package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class CarTest {

    Car testCar;

    @Before
    public void createCarObject() {
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, testCar.getGasTankLevel(), .001);
//        assertFalse(testCar.getGasTankLevel() == 0);
//        assertTrue(testCar.getGasTankLevel() == 10);
    }


    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankExceedingTankRange() {
        testCar.drive(600);
        assertEquals(0, testCar.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasTankOverfillException() {
        testCar.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than size of the tank.");
    }

}
