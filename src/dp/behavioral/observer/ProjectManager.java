package dp.behavioral.observer;

public class ProjectManager extends Observer {

    public ProjectManager(ObservableProgrammer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }

    @Override
    public void update() {
        if(this.programmer.getState().equalsIgnoreCase("Successful")) {
            System.out.println("Manager is happy with Lead Programmer and this Programmer.");
        } else {
            System.out.println("Manager is unhappy with Lead Programmer and this Programmer.");
        }
    }
}
