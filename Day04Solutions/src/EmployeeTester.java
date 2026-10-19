void main() {
    Employee alice = new Employee("Alice", 1000);
    Employee bob = new Employee("Bob", 1001);
    Employee charlotte = new Employee("Charlotte", 1002);
    Employee derek = new Employee("Derek", 1003);
    Employee sam = new Employee("Sam", 1010);
    Employee serena = new Employee("Serena", 1011);

    EmployeeHolder company = new EmployeeHolder();
    IO.println("Initial company size: " + company.size());
    company.add(alice);
    company.add(bob);
    company.add(charlotte);
    company.add(derek);
    company.add(sam);
    company.add(serena);

    IO.println("Company size after adding 4 employees: " +
            company.size());
    for (int i = 0; i < company.size(); i++) {
        Employee e = company.get(i);
        IO.println("Employee " + i + " is " + e.getName() +
                " with ID number " + e.getIdNumber());
    }

    IO.println("Employees with even ID number:");
    for (int i = 0; i < company.size(); i++) {
        Employee e = company.get(i);
        if (e.getIdNumber() % 2 == 0) {
            IO.println(e.getName() + " with ID number " +
                    e.getIdNumber());
        }
    }

    IO.println("Employees whose name starts with 'S':");
    for (int i = 0; i < company.size(); i++) {
        Employee e = company.get(i);
        if (e.getName().startsWith("S")) {
            IO.println(e.getName() + " with ID number " +
                    e.getIdNumber());
        }
    }
}
