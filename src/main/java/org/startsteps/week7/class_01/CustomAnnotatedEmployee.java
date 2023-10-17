package org.startsteps.week7.class_01;

@Company
public class CustomAnnotatedEmployee {

    private int id;
    private String name;

    public CustomAnnotatedEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class CustomAnnotatedManager extends CustomAnnotatedEmployee {
    public CustomAnnotatedManager(int id, String name){
        super(id, name);
    }
}
