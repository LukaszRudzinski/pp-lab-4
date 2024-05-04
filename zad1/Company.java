// Company.java
public class Company {
    public static void main(String[] args) {
        // Create an array to hold employees
        Employee[] employees = new Employee[5];

        // Add five employees to the array
        employees[0] = new Employee("John Doe", 50000);
        employees[1] = new Employee("Jane Smith", 60000);
        employees[2] = new Employee("Michael Johnson", 55000);
        employees[3] = new Employee("Emily Brown", 58000);
        employees[4] = new Employee("David Lee", 53000);

        // Display data for an employee with index 3
        System.out.println("Employee at index 3: " + employees[3]);

        // Modify the salary for an employee with index 3
        employees[3].setSalary(60000);

        // Display data for all employees
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}