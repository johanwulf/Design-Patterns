package Null;
import Null.Company.*;

public class UnionReports {
    public static void main(String[] args) {
        Company emptyCompany = new Company();
        Employee latestEmployee = emptyCompany.lastIn();
        System.out.println(latestEmployee.role() + " " + latestEmployee.name());

        Company filledCompany = new Company();
        filledCompany.addEmployee("Roger Pontare", "VD");
        latestEmployee = filledCompany.lastIn();
        System.out.println(latestEmployee.role() + " " + latestEmployee.name());
    }
}
