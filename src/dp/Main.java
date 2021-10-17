package dp;

import dp.creational.Person;
import dp.creational.employee.Driver;
import dp.creational.employee.Employee;
import dp.creational.employee.EmployeeFactory;
import dp.creational.employee.PersonCache;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        /* Creational design patterns' appliance */
        // 1 - builder
        Person person = new Person.Builder()
                .setGender("male")
                .setAddress("Vlaicu Pircalab")
                .setAge(28)
                .setFirstname("Peter")
                .setLastname("Kulov").build();
        System.out.println(person);

        // 2 - factory
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getWork("salesman");
        employee.work();

        // 3 - prototype
        PersonCache.loadCache();

        Person clonedShape = PersonCache.getPerson("1");
        clonedShape.work();

        Person clonedShape2 = PersonCache.getPerson("2");
        clonedShape2.work();

        Person clonedShape3 = PersonCache.getPerson("3");
        clonedShape3.work();
    }
}

