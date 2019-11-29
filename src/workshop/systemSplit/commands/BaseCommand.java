package workshop.systemSplit.commands;

public abstract class BaseCommand implements Command {

    public BaseCommand(Object...args){
        this.parseArgs(args);
    }

    protected abstract void parseArgs(Object...args);
}