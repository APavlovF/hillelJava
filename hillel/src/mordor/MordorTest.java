package mordor;

import OOP.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class MordorTest {

    @Test
    public void fightTest(){
        HumanFight human = new HumanFight();
        OrkFight ork = new OrkFight();
        ElfFight elf = new ElfFight();
        Assert.assertEquals("Fight with sword!", human.fight());
        Assert.assertEquals("Fight with hammer!", ork.fight());
        Assert.assertEquals("Fight with bow!", elf.fight());
    }
}
