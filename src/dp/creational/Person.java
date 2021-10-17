package dp.creational;

import dp.creational.employee.Employee;

import java.util.StringJoiner;

public class Person implements Employee, Cloneable {

    private int age;
    private String firstname;
    private String lastname;
    private String address;
    private String gender;

    private String id;

    public Person() {}

    public Person(Person person) {
        this.gender = person.gender;
        this.firstname = person.firstname;
        this.lastname = person.lastname;
        this.gender = person.gender;
        this.address = person.address;
        this.id = person.id;
    }

    public Person clone() throws CloneNotSupportedException {
        return new Person(this);
    }

    public void work() {
        System.out.println("Person's work!");
    }

    // Builder creation DP appliance though chaining
    public static class Builder {
        private int age;
        private String firstname;
        private String lastname;
        private String address;
        private String gender;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this.age, this.firstname, this.lastname, this.address, this.gender);
        }
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String firstname) {
        this.firstname = firstname;
    }

    public Person(int age, String firstname) {
        this.age = age;
        this.firstname = firstname;
    }

    public Person(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(int age, String firstname, String lastname,
                      String address, String gender) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String fathername) {
        this.address = fathername;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String mothername) {
        this.gender = mothername;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("firstname='" + firstname + "'")
                .add("lastname='" + lastname + "'")
                .add("address='" + address + "'")
                .add("gender='" + gender + "'")
                .add("id='" + id + "'")
                .toString();
    }
}
