package inheritancepackage;

class Member {

    String name;
    int age;
    double salary;

    void Details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {

    String specification;

    void EmployeeDetails() {
        Details();
        System.out.println("Specification: " + specification);
    }
}

class Manager extends Member {

    String department;

    void ManagerDetails() {
        Details();
        System.out.println("Department: " + department);
    }
}

public class Employe {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = "Adarsh";
        emp.age = 22;
        emp.salary = 30000;
        emp.specification = "Software Developer";

        Manager manager = new Manager();

        manager.name = "Rahul";
        manager.age = 35;
        manager.salary = 60000;
        manager.department = "IT";

        System.out.println("Employee Details");
        emp.EmployeeDetails();

        System.out.println();

        System.out.println("Manager Details");
        manager.ManagerDetails();
    }
}