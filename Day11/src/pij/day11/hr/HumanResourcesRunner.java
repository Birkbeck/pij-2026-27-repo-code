package pij.day11.hr;

import java.util.Set;

public class HumanResourcesRunner {

    public static void setUp(HumanResources hr) {
        hr.addEmployee("Alice", 1001, 2002);
        hr.addEmployee("Bob", 1002, 2002);
        hr.addManager("Celia", 1003, 2004, Set.of(1001, 1002));
        hr.addManager("Doris", 1004, 2004, Set.of(1003));
    }

    static void main() {
        HumanResources hr = new HumanResources();
        setUp(hr);
        hr.paySalaries();
        IO.println();
        hr.printStaffList();
        IO.println();
        hr.printManagerList();
    }
}
