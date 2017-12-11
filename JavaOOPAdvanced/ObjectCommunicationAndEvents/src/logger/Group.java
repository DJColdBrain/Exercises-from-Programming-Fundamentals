package logger;

import logger.interfaces.AttackGroup;
import logger.interfaces.Attacker;
import logger.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup {

    private List<Attacker> attackerList;

    public Group() {
        this.attackerList = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        attackerList.add(attacker);
    }

    @Override
    public void groupTarget(Target target) {
        for (Attacker attacker : attackerList) {
            attacker.setTarget(target);
        }

    }

    @Override
    public void groupAttack() {
        for (Attacker attacker : attackerList) {
            attacker.attack();
        }
    }
}
