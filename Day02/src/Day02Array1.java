void main() {
    String[] employeeArray;
    employeeArray = new String[5];
    employeeArray[0] = "Alice";
    employeeArray[1] = "Bob";
    employeeArray[2] = "Charlie";
    employeeArray[3] = "Dave";
    employeeArray[4] = "Eve";
    IO.println("Our first employee is " + employeeArray[0]);
    IO.println("Our company has " + employeeArray.length + " employees");
    
    // method java.util.Arrays.toString(someArray) produces a String
    // representation of someArray
    IO.println("All employees: " + java.util.Arrays.toString(employeeArray));
}
