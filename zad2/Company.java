// Company.java
import employees.*;

public class Company {
    public static void main(String[] args) {
        // Create an array to hold employees
        Employee[] employees = new Employee[5];

        // Add employees to the array
        employees[0] = new Manager("John Doe", 70000, 0);
        employees[1] = new Worker("Jane Smith", 60000, "Engineer");
        employees[2] = new Employee("Michael Johnson", 55000);
        employees[3] = new Worker("Emily Brown", 58000, "Technician");
        employees[4] = new Manager("David Lee", 75000, 3);

        // Display data for all employees
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}