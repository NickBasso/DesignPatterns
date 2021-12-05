package dp.behavioral.template;

public class Programmer extends TemplateEmployee {
    @Override
    void work() {
        System.out.println("Writing code.");
    }

    @Override
    void takePause() {
        System.out.println("Taking a small break from writing code.");
    }

    @Override
    void getPaid() {
        System.out.println("Getting paid for developing the project.");
    }
}