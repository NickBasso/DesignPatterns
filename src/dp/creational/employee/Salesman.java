package dp.creational.employee;

import dp.creational.Person;

public class Salesman extends Person implements Employee {
    @Override
    public void work() {
        System.out.println("Salesman's work!");
    }
}
