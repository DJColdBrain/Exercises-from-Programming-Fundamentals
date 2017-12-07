import interfaces.Target;
import interfaces.Weapon;
import org.junit.Assert;
import org.junit.Test;

public class HeroTest {

    private static final int TAGRET_EXP = 10;
    private static final int TAGRET_HEALTH = 10;
    private static final int WEAPON_ATTACK = 10;
    private static final int WEAPON_DURABILITY = 10;



    @Test
    public void heroGainsExperienceAfterAttackingIfTargetIsDead(){
        Target fakeTarget = new Target() {
            public void takeAttack(int AttackPoints) {

            }

            public int getHealth() {
                return TAGRET_HEALTH;
            }

            public int giveExperience() {
                return TAGRET_EXP;
            }

            public boolean isDead() {
                return true;
            }
        };

        Weapon weapon = new Weapon() {
            public void attack(Target target) {

            }

            public int getAttackPoints() {
                return WEAPON_ATTACK;
            }

            public int getDurabilityPoints() {
                return WEAPON_DURABILITY;
            }
        };

        Hero hero = new Hero("Gosho", weapon);
        hero.attack(fakeTarget);
        Assert.assertEquals("Expireance is not gained when needed", TAGRET_EXP, hero.getExperience());
    }
}
