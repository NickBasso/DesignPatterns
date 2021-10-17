package dp.creational.employee;

import dp.creational.Person;

public class Driver extends Person implements Employee{
    @Override
    public void work() {
        System.out.println("Driver's work!");
    }
}
