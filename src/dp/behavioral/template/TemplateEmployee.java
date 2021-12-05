package dp.behavioral.template;

public abstract class TemplateEmployee {
    abstract void work();
    abstract void takePause();
    abstract void getPaid();

    public final void comeToWork() {
        work();
        takePause();
        work();
        getPaid();
    }
}