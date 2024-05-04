// Company.java
import employees.*;

public class Company {
    public static void main(String[] args) {
        // Create an array to hold employees
        Employee[] employees = new Employee[5];

        // Add employees to the array
        employees[0] = new Manager("Daniel Kowalski", 70000, 0);
        employees[1] = new Worker("Jan Kowalski", 60000, "Engineer");
        employees[2] = new Employee("Michał Kowalski", 55000);
        employees[3] = new Worker("Emilia Kowalska", 58000, "Technician");
        employees[4] = new Manager("Dawid Kowalski", 75000, 3);

        // Wyświetla dane wszystkich pracowników
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}