import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RubyjuTest {

    Rubyju rubyju;

    @Before
    public void before(){
        rubyju = new Rubyju( "Rubyju",4000, 250);
    }

    @Test
    public void rubyjuHasName(){
        assertEquals("Rubyju", rubyju.getName());
    }

    @Test
    public void rubyjuHealthValue(){
        assertEquals(4000, rubyju.getHealthValue());
    }

    @Test
    public void rubyjuAttackValue(){
        assertEquals(250, rubyju.getAttackValue());
    }

    @Test
    public void rubyjuRoar(){
        assertEquals("Screeeeeeech", rubyju.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Rubyju casts a big shadow as she flies downtown", rubyju.move("casts a big shadow as she flies downtown"));
    }

}