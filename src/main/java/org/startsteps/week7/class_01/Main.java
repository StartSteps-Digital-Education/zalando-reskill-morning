package org.startsteps.week7.class_01;

import java.lang.annotation.Annotation;

public class Main {

    @SuppressWarnings({"removal"})
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getName());

        SecondChildClass secondChildClass = new SecondChildClass();
        System.out.println(secondChildClass.getName());

        DeprecatedDemo deprecatedDemo = new DeprecatedDemo();
        deprecatedDemo.testLegacyFunction();

        Print print = (testString, secondParam) -> {
            System.out.println("The text is: " + testString + " The second param is: " + secondParam);
        };

        print.printString("test", "Second Param");

        CustomAnnotatedManager employee = new CustomAnnotatedManager(1, "John Doe");
        employee.getEmployeeDetails();

        Annotation companyAnnotation = employee.getClass().getAnnotation(Company.class);
        Company company = (Company) companyAnnotation;

        System.out.println("Company Name: " + company.name());
        System.out.println("Company City: " + company.city());


        RepetableCompany[] repetableCompanies = RepeatableAnnotadedEmployee.class
                .getAnnotationsByType(RepetableCompany.class);

        for (RepetableCompany repeatableCompany: repetableCompanies) {
            System.out.println("Name: " + repeatableCompany.name());
            System.out.println("City: " + repeatableCompany.city());
        }
    }

}
