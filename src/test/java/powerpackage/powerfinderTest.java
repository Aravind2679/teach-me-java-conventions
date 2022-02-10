package powerpackage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class powerfinderTest {

    @Test
    @DisplayName("One to the power One")
    public void oneRaisedToThePowerone()
    {
        Assertions.assertEquals(powerfinder.power(1,1),1);
    }

    @Test
    @DisplayName("Two to the power One")
    public void twoRaisedToThePowerone()
    {
        Assertions.assertEquals(powerfinder.power(2,1),2);
    }

    @Test
    @DisplayName("Two to the power Two")
    public void twoRaisedToThePowerTwo()
    {
        Assertions.assertEquals(powerfinder.power(2,2),4);
    }

    @Test
    @DisplayName("Three to the power Two")
    public void threeRaisedToThePowerTwo()
    {
        Assertions.assertEquals(powerfinder.power(3,2),9);
    }


}
