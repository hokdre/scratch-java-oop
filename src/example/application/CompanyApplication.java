package example.application;

import example.model.Company;

// we can import all static field
// import static example.model.*;

public class CompanyApplication {
    // 1. inner class
    Company company = new Company();

    // non static
    Company.Employe employ = company.new Employe();

    // static class
    Company.EmployeStatic s = new Company.EmployeStatic();
}
