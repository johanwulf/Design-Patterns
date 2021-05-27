package Null.Company;

public class StdEmployee implements Employee{
    private String role;
    private String name;

    public StdEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String role() {
        return role;
    }

    public String name() {
        return name;
    }
}
