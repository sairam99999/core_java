package org.career.day13;


class Employee{

    private int empno;
    private String name;
    private double salary;
    private String email;
    private String mobile;



    public Employee(int empno,String name, double salary)
    {
        this(empno,name,salary,"n/a");
        System.out.println("1");
    }
    public Employee(int empno,String name,double salary,String email)
    {
        this(empno,name,salary,email,"n/a");
        System.out.println("2");
    }

    public Employee(int empno,String name,double salary,String email,String mobile){
        this.empno=empno;
        this.name=name;
        this.salary=salary;
        this.email=email;
        this.mobile=mobile;
        System.out.println("3");

    }

}





public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee=new Employee(1000,"sairam",4554.25,"sai@gmail.com");

        
    }
}
