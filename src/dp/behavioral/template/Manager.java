package dp.behavioral.template;

public class Manager extends TemplateEmployee {
    @Override
    void work() {
        System.out.println("Managing other employees.");
    }

    @Override
    void takePause() {
        System.out.println("Taking a small break from managing employees.");
    }

    @Override
    void getPaid() {
        System.out.println("Getting paid for overseeing the development of the project.");
    }
}