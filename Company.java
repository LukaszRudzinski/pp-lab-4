// Company.java
public class Company {
    public static void main(String[] args) {
        // Create an array to hold employees
        Employee[] employees = new Employee[5];

        // Tworzy tablicę do przechowywania pracowników
        employees[0] = new Employee("Daniel Kowalski", 50000);
        employees[1] = new Employee("Jan Kowalski", 60000);
        employees[2] = new Employee("Michał Kowalski", 55000);
        employees[3] = new Employee("Emilia Kowalska", 58000);
        employees[4] = new Employee("Dawid Kowalski", 53000);

        // Wyświetla dane dla pracownika o indexie 3
        System.out.println("Employee at index 3: " + employees[3]);

        // modyfikuje wypłate dla pracownika o indexie 3
        employees[3].setSalary(60000);

        // Wyświetla dane wszystkich pracowników
        System.out.println("All employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}