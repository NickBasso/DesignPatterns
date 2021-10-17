package dp.creational.employee;

public class EmployeeFactory {
    public Employee getWork(String post){
        if(post == null){
            return null;
        }

        if(post.equalsIgnoreCase("Driver")){
            return new Driver();

        } else if(post.equalsIgnoreCase("Salesman")){
            return new Salesman();

        } else if(post.equalsIgnoreCase("Manager")){
            return new Manager();
        }

        return null;
    }
}
