package dp;

import dp.behavioral.iterator.EmployeeRepository;
import dp.behavioral.iterator.Iterator;
import dp.behavioral.observer.CEO;
import dp.behavioral.observer.LeadProgrammer;
import dp.behavioral.observer.ObservableProgrammer;
import dp.behavioral.observer.ProjectManager;
import dp.behavioral.template.Manager;
import dp.behavioral.template.Programmer;
import dp.behavioral.template.TemplateEmployee;
import dp.creational.Person;
import dp.creational.employee.Employee;
import dp.creational.employee.EmployeeFactory;
import dp.creational.employee.PersonCache;
import dp.structural.bridge.JavaQuestions;
import dp.structural.bridge.QuestionFormat;
import dp.structural.decorator.ChineeseFood;
import dp.structural.decorator.Food;
import dp.structural.decorator.NonVegFood;
import dp.structural.decorator.VegFood;
import dp.structural.facade.ShopKeeper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int choice;

    public static void main(String[] args) throws CloneNotSupportedException, NumberFormatException, IOException {
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

        /* Structural design patterns' appliance */
        // 1 - bridge
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();

        questions.next();
        questions.display();
        questions.delete("what is class?");
        questions.newOne("What is inheritance? ");
        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();

        // 2 - decorator
        do {
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                {
                    VegFood vf=new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println( vf.foodPrice());
                }
                break;
                case 2:
                {
                    Food f1=new NonVegFood((Food) new VegFood());
                    System.out.println(f1.prepareFood());
                    System.out.println( f1.foodPrice());
                }
                break;
                case 3:
                {
                    Food f2=new ChineeseFood((Food) new VegFood());
                    System.out.println(f2.prepareFood());
                    System.out.println( f2.foodPrice());
                }
                break;
                default:
                {
                    System.out.println("Other than these no food available");
                }
                return;
            }

        } while(choice!=4);

        // 3 - facade
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.iphoneSale();
                }
                break;
                case 2:
                {
                    sk.samsungSale();
                }
                break;
                case 3:
                {
                    sk.blackberrySale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }
        } while(choice!=4);

        /* Behavioral design patterns` appliance */
        // 1 - iterator
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Iterator iterator = employeeRepository.getIterator();
        while(iterator.hasNext()) {
            String e = (String)iterator.next();
            System.out.println("Employee: " + e);
        }

        // 2 - template
        TemplateEmployee templateEmployee = new Programmer();
        templateEmployee.comeToWork();

        System.out.println();

        templateEmployee = new Manager();
        templateEmployee.comeToWork();

        // 3 - observer
        ObservableProgrammer programmer = new ObservableProgrammer();

        new CEO(programmer);
        new ProjectManager(programmer);
        new LeadProgrammer(programmer);

        System.out.println("Programmer successfully did his job!");
        programmer.setState("Successful");
        System.out.println("Programmer failed his new assignment.");
        programmer.setState("Failed");
    }
}

