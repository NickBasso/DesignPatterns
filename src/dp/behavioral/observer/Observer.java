package dp.behavioral.observer;

public abstract class Observer {
    protected ObservableProgrammer programmer;
    public abstract void update();
}