package Null.Company;

import java.util.*;

public class Company {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(String name, String role) {
        employeeList.add(new StdEmployee(name, role));
    }

    public String getEmployees() {
        StringBuilder sb = new StringBuilder();

        for (Employee employee : employeeList) {
            sb.append("Name: " + employee.name() + " Role: " + employee.role()).append("\n");
        }

        return sb.toString();
    }

    public Employee lastIn() {
        if (employeeList.size() == 0) {
            return new NullEmployee();
        } else {
            return employeeList.get(employeeList.size()-1);
        }
    }
}
