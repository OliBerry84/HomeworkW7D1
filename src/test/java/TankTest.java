import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("K2 Black Panther", 10000);
    }

    @Test
    public void tankHasType(){
        assertEquals("K2 Black Panther", tank.getType());
    }

    @Test
    public void tankHealthValue(){
        assertEquals(10000, tank.getHealthValue());
    }
}
