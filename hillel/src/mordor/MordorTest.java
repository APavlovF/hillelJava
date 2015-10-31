package mordor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class MordorTest {

    @Test
    public void fightTest(){
        Human human = new Human();
        Ork ork = new Ork();
        Elf elf = new Elf();

        Assert.assertEquals("I'm human" + " " + "Fight with sword!", human.person()+ " " + human.fight());

        Assert.assertEquals("I'm ork" + " " + "Fight with hammer!", ork.person() + " " + ork.fight());

        Assert.assertEquals("I'm elf" + " " + "Fight with bow!", elf.person()+ " " + elf.fight());

    }
}
