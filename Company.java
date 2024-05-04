public static void main(String[] args) {
    // Tworzę tabele do przechowania pracowników
    Employee[] employees = new Employee[7];

    // Dodaje pracowników do tabeli
    employees[0] = new Manager("Daniel Kowalski", 70000, 0);
    employees[1] = new Worker("Jan Kowalski", 60000, "Engineer");
    employees[2] = new Employee("Michał Kowalski", 55000);
    employees[3] = new Worker("Emilia Kowalska", 58000, "Technician");
    employees[4] = new Manager("Dawid Kowalski", 75000, 3);
    employees[5] = new Manager("Alicja Kowalska", 72000, 0);
    employees[6] = new Worker("Dariusz Kowalski", 62000, "Developer");

    // zwiększam pracownikom wypłate
    for (Employee employee : employees) {
        double newSalary = employee.getSalary() + 500;
        employee.setSalary(newSalary);
    }

    // zmieniam wartość dla managerów
    for (Employee employee : employees) {
        if (employee instanceof Manager) {
            ((Manager) employee).setNumberOfSubordinates(4);
            employee.setSalary(75000);
        }
    }

    // Wyświetlam zaktualizowane informacje
    System.out.println("Updated information about employees:");
    for (Employee employee : employees) {
        System.out.println(employee);
    }
}