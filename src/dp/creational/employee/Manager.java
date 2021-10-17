package dp.creational.employee;

import dp.creational.Person;

public class Manager extends Person implements Employee {
    @Override
    public void work() {
        System.out.println("Manager's work!");
    }
}
