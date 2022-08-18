 import java.io.*;
 import java.util.*;
  
class ELOYEE
{
    String name;
    String address;
    long phone;
    int salary;
    int tax;
    /*ELOYEE()
    {
        System.out.println("default constructor");
    }*/
    ELOYEE(String n,String a,long p,int s)
    {
        name=n;
        address=a;
        phone=p;
        salary=s;
       // tax=t;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,phone,salary,address");
        name=sc.next();
        phone=sc.nextLong();
        salary=sc.nextInt();
        address=sc.nextLine();
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(address);
        System.out.println(tax);
    }
    public void compute()
    {
        if(salary>175000)
        {
            tax=((5*(salary-175000))/100);
        }
    }
}

//import java.io.*;
//import java.util.*;  
class one
{
    public static void main(String args[])
    {
        ELOYEE obj=new ELOYEE();
        obj.accept();
        obj.compute();
        obj.display();
    }
}

    