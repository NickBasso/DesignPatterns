package dp.creational.employee;

import dp.creational.Person;

import java.util.Hashtable;

public class PersonCache {

    private static Hashtable<String, Person> employeeMap  = new Hashtable<String, Person>();

    public static Person getPerson(String personID) throws CloneNotSupportedException {
        Person cachedPerson = employeeMap.get(personID);
        return (Person) cachedPerson.clone();
    }

    public static void loadCache() {
        Driver driver = new Driver();
        driver.setId("1");
        employeeMap.put(driver.getId(), driver);

        Salesman salesman = new Salesman();
        salesman.setId("2");
        employeeMap.put(salesman.getId(), salesman);

        Manager manager = new Manager();
        manager.setId("3");
        employeeMap.put(manager.getId(), manager);
    }
}
