class Employee {

    public String name;
    public int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // copy constructor
    Employee(Employee c) {
        System.out.println("Copy constructor called!");
        this.id = c.id;
        this.name = c.name;
    }
}

public class Main {

    public static void main(String[] args) {
        Employee e1;
        e1 = new Employee(10, "Prashant");

        Employee e2 = new Employee(e1);
        Employee e3 = e2;// Gives Shallow Copy of Object
        e3.name = "Shubbham";
        System.out.println("Name and Id of Employee e1"+ e1.id+ " " + e1.name);
        System.out.println("Name and Id of Employee e2"+ e2.id+ " " + e2.name);
        System.out.println("Name and Id of Employee e3"+ e3.id+ " " + e3.name);
    }
}