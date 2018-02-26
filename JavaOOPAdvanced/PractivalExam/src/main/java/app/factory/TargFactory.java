package app.factory;

import app.contracts.ActionFactory;
import app.contracts.Targetable;
import app.contracts.TargetableFactory;
import app.models.participants.Boss;
import app.models.participants.Necromancer;
import app.models.participants.Warrior;
import app.models.participants.Wizard;

import java.lang.reflect.InvocationTargetException;

public class TargFactory implements TargetableFactory {
    @Override
    public Targetable create(String name, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Targetable targetable;

        switch (className) {
            case "Warrior":
                targetable = new Warrior();
                targetable.setName(name);

                break;
            case "Wizard":
                targetable = new Wizard();
                targetable.setName(name);

                break;
            case "Necromancer":
                targetable = new Necromancer();
                targetable.setName(name);

                break;

            case"Boss":
                targetable = new Boss();
                targetable.setName(name);
                break;
            default:
                targetable = null;
        }
        return targetable;
    }
}
