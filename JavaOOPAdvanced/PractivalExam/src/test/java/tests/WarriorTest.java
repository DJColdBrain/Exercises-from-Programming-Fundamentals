package tests;

import app.contracts.Targetable;
import app.models.participants.Warrior;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class WarriorTest {

    private Targetable warrior = new Warrior();

    @Test
    public void takeDamage(){

        warrior.takeDamage(5);
        Assert.assertEquals(45.0, warrior.getHealth(), 0);
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
        Targetable targetable = new Warrior();
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);
        warrior.attack(targetable);

        try {

            Class warrior = Warrior.class;
            Field field = warrior.getDeclaredFields()[4];
            field.setAccessible(true);

            Assert.assertEquals(2, field.get(warrior) );
        } catch (Exception e) {
        }

    }


    @Test
    public void giveReward(){
        Targetable targetable = new Warrior();
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        targetable.attack(warrior);
        try {

            Class warrior = Warrior.class;
            Field field = warrior.getDeclaredFields()[2];
            field.setAccessible(true);

            Assert.assertEquals(400, field.get(warrior) );
        } catch (Exception e) {
        }
    }

    @Test
    public void reciveReward(){
        warrior.receiveReward(100);
        try {

            Class warrior = Warrior.class;
            Field field = warrior.getDeclaredFields()[2];
            field.setAccessible(true);

            Assert.assertEquals(300, field.get(warrior) );
        } catch (Exception e) {
        }
    }

    @Test
    public void targetIsDead(){
        Targetable aa = new Warrior();
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);

        Assert.assertEquals("null is dead! Cannot be attacked.",  warrior.attack(aa));
    }

    @Test
    public void warriorIsDead(){
        Targetable aa = new Warrior();
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);
        warrior.attack(aa);

        Assert.assertEquals("null is dead! Cannot attack.",  aa.attack(warrior));
    }
}
