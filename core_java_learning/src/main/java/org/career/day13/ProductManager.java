package org.career.day13;

class Product {
    int pid;
    String name;
    float salary;

    public Product(int pid,String name)
    {
        this.pid=pid;
        this.name=name;
        this.salary=50000;

    }

    public Product(int pid,String name,float salary)
    {
        this.pid=pid;
        this.name=name;
        this.salary=salary;

    }

    public  void showDetails()
    {
        System.out.println(String.format("%s,%s,%s",pid,name,salary));
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Product product=new Product(100,"sai",100000);
        product.showDetails();
        Product product1=new Product(101,"ram",200000);
        product1.showDetails();
        Product product2=new Product(500,"meghana");
        product2.showDetails();

    }
}
