package app.factory;

import app.contracts.Action;
import app.contracts.ActionFactory;
import app.contracts.Targetable;
import app.contracts.TargetableFactory;
import app.models.actions.BossFight;
import app.models.actions.OneVsOne;
import app.models.participants.Boss;
import app.models.participants.Necromancer;
import app.models.participants.Warrior;
import app.models.participants.Wizard;

import java.lang.reflect.InvocationTargetException;

public class ActFactory implements ActionFactory{
    @Override
    public Action create(String actionName, String... participantNames) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Action action = null;
        switch (actionName){
            case "OneVsOne":
                action = new OneVsOne();
                break;
            case "BossFight":
                action = new BossFight();
        }
        return action;
    }


}
