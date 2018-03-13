import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavasaurusTest {
    Javasaurus javasaurus;
    Helicopter helicopter;
    Tank tank;

    @Before
    public void before(){
        javasaurus = new Javasaurus("Javasaurus", 5000, 100);
        tank = new Tank("K2 Black Panther", 10000, 250);
        helicopter = new Helicopter("Mi-24 Hind",  3000, 150);
    }

    @Test
    public void javasaurusHasName(){
        assertEquals("Javasaurus", javasaurus.getName());
    }

    @Test
    public void javasaurusHealthValue(){
        assertEquals(5000, javasaurus.getHealthValue());
    }

    @Test
    public void javasaurusAttackValue(){
        assertEquals(100, javasaurus.getAttackValue());
    }

    @Test
    public void javasaurusRoar(){
        assertEquals("Meow", javasaurus.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Javasaurus tramples some american tourists on his way down the street", javasaurus.move("tramples some american tourists on his way down the street"));
    }

    @Test
    public void javaAttack(){
        javasaurus.attack(tank);
        assertEquals(9900, tank.getHealthValue());
    }

    @Test
    public void javaTakeDamage(){
        tank.attack(javasaurus);
        assertEquals(4750, javasaurus.getHealthValue());
    }
}
