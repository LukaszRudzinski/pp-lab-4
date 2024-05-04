public static void main(String[] args) {
    // Tworzę tabelę dla pracowników
    Employee[] employees = new Employee[5];

    // Dodaje pracowników
    employees[0] = new Manager("Daniel Kowalski", 70000, 0);
    employees[1] = new Worker("Jan Kowalski", 60000, "Engineer");
    employees[2] = new Employee("Michał Kowalski", 55000);
    employees[3] = new Worker("Emilia Kowalska", 58000, "Technician");
    employees[4] = new Manager("Dawid Kowalski", 75000, 3);

    // Liczę ilość pracowników, którzy nie są managerami
    int numberOfNonManagers = 0;
    for (Employee employee : employees) {
        if (!(employee instanceof Manager)) {
            numberOfNonManagers++;
        }
    }

    // ustawiam tą wartość jako wartość dla numberOfSubordinates dla managera z indexem 0
    ((Manager) employees[0]).setNumberOfSubordinates(numberOfNonManagers);

    // Zmieniam wypłatę dla managera z indexem 0 na określoną wartość
    employees[0].setSalary(75000);

    // Wyświetlam dane dla wszystkich pracowników
    System.out.println("All employees:");
    for (Employee employee : employees) {
        System.out.println(employee);
    }
}