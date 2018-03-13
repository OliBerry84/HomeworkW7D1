import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {

        Helicopter helicopter;

        @Before
        public void before(){
            helicopter = new Helicopter("Mi-24 Hind", 3000, 150);
        }

        @Test
        public void helicopterHasType(){
            assertEquals("Mi-24 Hind", helicopter.getType());
        }

        @Test
        public void helicopterHealthValue(){
            assertEquals(3000, helicopter.getHealthValue());
        }

}

