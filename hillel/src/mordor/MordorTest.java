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
        Assert.assertEquals("Fight with sword!", human.fight());
        Assert.assertEquals("Fight with hammer!", ork.fight());
        Assert.assertEquals("Fight with bow!", elf.fight());
    }
}
