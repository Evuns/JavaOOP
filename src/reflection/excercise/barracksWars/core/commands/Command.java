package reflection.excercise.barracksWars.core.commands;

import reflection.excercise.barracksWars.interfaces.Executable;
import reflection.excercise.barracksWars.interfaces.Repository;
import reflection.excercise.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String [] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data,
                   Repository repository,
                   UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return this.data;
    }

    protected Repository getRepository() {
        return this.repository;
    }

    protected UnitFactory getUnitFactory() {
        return this.unitFactory;
    }
}
