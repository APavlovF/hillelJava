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
        Assert.assertEquals("I'm human", human.person());
        Assert.assertEquals("Fight with sword!", human.fight());
        Assert.assertEquals("I'm ork", ork.person());
        Assert.assertEquals("Fight with hammer!", ork.fight());
        Assert.assertEquals("I'm elf", elf.person());
        Assert.assertEquals("Fight with bow!", elf.fight());
    }
}