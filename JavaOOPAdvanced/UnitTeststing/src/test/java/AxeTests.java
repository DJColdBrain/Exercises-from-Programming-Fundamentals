import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTests {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_XP = 10;
    private static final int EXPECTED_DURABILITY = AXE_DURABILITY - 1;
    private Axe axe;
    private Dummy dummy;


    @Before
    public void initializeTestObjects(){
        axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void axeLosesDurability(){
        this.axe.attack(this.dummy);
        Assert.assertEquals("Wrong durability loss", EXPECTED_DURABILITY, this.axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void attackWithBrokenAxe(){
        for (int i = 0; i < 15; i++) {
            axe.attack(dummy);
        }
    }
}
