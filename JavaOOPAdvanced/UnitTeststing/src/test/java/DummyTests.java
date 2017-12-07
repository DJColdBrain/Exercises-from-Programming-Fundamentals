import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTests {
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_XP = 10;
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int EXPECTED_DUMMY_HEALT = DUMMY_HEALTH - AXE_ATTACK;
    private Axe axe;
    private Dummy dummy;

    @Before
    public void initializeTestObjects(){
        dummy = new Dummy(DUMMY_HEALTH , DUMMY_XP);
        axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
    }

    @Test
    public void losesHealth(){
        axe.attack(dummy);
        Assert.assertEquals("Wrong health lose calculation", EXPECTED_DUMMY_HEALT, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void dummyIsDead(){
        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test
    public void deadDummyGiveExp(){
        axe.attack(dummy);
        Assert.assertEquals("Wrong exp give", DUMMY_XP, dummy.giveExperience());
    }
    @Test(expected = IllegalStateException.class)
    public void aliveDummyDontGiveExp(){
        dummy.giveExperience();
    }
}
