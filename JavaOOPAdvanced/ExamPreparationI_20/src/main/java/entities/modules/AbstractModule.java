package entities.modules;

import interfaces.Module;

public abstract class AbstractModule implements Module {

    private int id;

    public AbstractModule(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
