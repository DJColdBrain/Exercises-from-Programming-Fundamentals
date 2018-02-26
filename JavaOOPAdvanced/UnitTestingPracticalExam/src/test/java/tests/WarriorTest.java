package tests;

import app.contracts.Targetable;
import app.models.participants.Warrior;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WarriorTest {

    private Targetable warrior = new Warrior();
    private Targetable targetable = new Warrior();

    @Test
    public void takeDamage(){

        warrior.takeDamage(5);
        Assert.assertEquals(45, warrior.getHealth(), 0);
    }

    @Test
    public void isAlive(){
        warrior.takeDamage(5);
        Assert.assertEquals(true, warrior.isAlive());
    }

    @Test
    public void isNotAlive(){
        warrior.takeDamage(55);
        Assert.assertEquals(false, warrior.isAlive());
    }

    @Test
    public void levelUp(){
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);


        try {


            Field field = warrior.getClass() .getDeclaredField("level");
            field.setAccessible(true);

            Assert.assertEquals(2, field.getInt(warrior) );
        } catch (Exception e) {
        }

    }

    @Test
    public void sameLevel(){
        warrior.attack(targetable);


        try {


            Field field = warrior.getClass() .getDeclaredField("level");
            field.setAccessible(true);

            Assert.assertEquals(1, field.getInt(warrior) );
        } catch (Exception e) {
        }

    }


    @Test
    public void giveReward(){
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);

        Assert.assertEquals(400, targetable.getReward(), 0 );

    }


    @Test
    public void targetIsDead(){
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);


        Assert.assertEquals("null is dead! Cannot be attacked.",  warrior.attack(targetable));
    }

    @Test
    public void warriorIsDead(){
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);


        Assert.assertEquals("null is dead! Cannot attack.",  targetable.attack(warrior));
    }

    @Test
    public void isDeadAlive(){
        warrior.takeDamage(55);
        Assert.assertEquals(false, warrior.isAlive());
    }

    @Test(expected = NullPointerException.class)
    public void attackingNull(){
        warrior.attack(null);


        Assert.assertEquals("null is dead! Cannot attack.",  targetable.attack(warrior));
    }
}
