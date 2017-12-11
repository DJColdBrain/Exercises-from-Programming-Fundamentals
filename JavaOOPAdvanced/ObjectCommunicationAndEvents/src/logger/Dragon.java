package logger;

import logger.interfaces.Handler;
import logger.interfaces.Observer;
import logger.interfaces.Subject;
import logger.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Target {

    private static final String THIS_DIED_EVENT = "%s dies";

    private String id;
    private int hp;
    private int reward;
    private boolean eventTriggered;
    private Handler handler;
    private List<Observer> observerList;

    public Dragon(String id, int hp, int reward, Handler handler) {
        this.id = id;
        this.hp = hp;
        this.reward = reward;
        this.handler = handler;
        observerList = new ArrayList<>();
    }

    @Override
    public void receiveDamage(int dmg) {
        if (!this.isDead()) {
            this.hp -= dmg;
        }

        if (this.isDead() && !eventTriggered) {
            handler.handle(LogType.EVENT,String.format(THIS_DIED_EVENT, this));
            this.eventTriggered = true;
            this.notifyObservers();
        }
    }

    @Override
    public boolean isDead() {
        return this.hp <= 0;
    }

    @Override
    public String toString() {
        return this.id;
    }

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.reward);
        }
    }
}
