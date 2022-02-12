package powerpackage;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {

    @Test
    public void oneRaisedToPowerOne() {
        assertEquals(PowerFinder.power(1,1),1);
    }

    @Test
    public void twoRaisedToPowerOne() {
        assertEquals(PowerFinder.power(2,1),2);
    }

    @Test
    public void twoRaisedToPowerTwo() {
        assertEquals(PowerFinder.power(2,2),4);
    }

    @Test
    public void threeRaisedToPowerTwo() {
        assertEquals(PowerFinder.power(3,2),9);
    }


}