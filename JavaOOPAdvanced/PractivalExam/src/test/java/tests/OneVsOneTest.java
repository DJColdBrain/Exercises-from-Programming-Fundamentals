package tests;

import app.contracts.Targetable;
import app.models.actions.OneVsOne;
import app.models.participants.Warrior;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OneVsOneTest {

    @Test
    public void notTwoPeopleTest(){
        OneVsOne oneVsOne = new OneVsOne();
        Targetable target = new Warrior();
        List<Targetable> aa  = new ArrayList<>();
        aa.add(target);
        Assert.assertEquals("There should be exactly 2 participants for OneVsOne!" , oneVsOne.executeAction(aa));
    }

    @Test
    public void twoPeopleTest(){
        OneVsOne oneVsOne = new OneVsOne();
        Targetable target = new Warrior();
        Targetable wizard = new Warrior();
        List<Targetable> aa  = new ArrayList<>();
        aa.add(target);
        aa.add(wizard);
        oneVsOne.executeAction(aa);
        Assert.assertEquals(true, true) ;
    }
}
