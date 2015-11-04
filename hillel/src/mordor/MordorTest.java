package mordor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class MordorTest {

    @Test
    public void fightTest() {
        Human human = new Human();
        Ork ork = new Ork();
        Elf elf = new Elf();

        Assert.assertEquals("I'm human" + " " + "Fight with sword!", human.person() + " " + human.fight());
        Assert.assertEquals("I'm ork" + " " + "Fight with hammer!", ork.person() + " " + ork.fight());
        Assert.assertEquals("I'm elf" + " " + "Fight with bow!", elf.person() + " " + elf.fight());
    }

    @Test
    public void damageTest() {
        Human human = new Human();
        Ork ork = new Ork();
        Elf elf = new Elf();

        Sword sword = new Sword();
        Hammer hammer = new Hammer();
        Bow bow = new Bow();

        int damage1 = human.damage + sword.damage;
        int damage2 = human.damage + hammer.damage;

        Assert.assertEquals(7, damage1);
        Assert.assertEquals(8, damage2);

    }
}