package dp.behavioral.observer;

public class LeadProgrammer extends Observer {

    public LeadProgrammer(ObservableProgrammer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }

    @Override
    public void update() {
        if(this.programmer.getState().equalsIgnoreCase("Successful")) {
            System.out.println("Lead Programmer is proud of his Programmer.");
        } else {
            System.out.println("Lead Programmer is not proud of his Programmer.");
        }
    }
}
