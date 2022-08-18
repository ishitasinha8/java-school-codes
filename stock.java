import java.io.*;
class stock
{
    String name;
    int qty;
    double p;
    double ttl;
    double disc;
    double net;
    stock(String n,int q,double pr)
    {
        name=n;
        qty=q;
        p=pr;
    }
    public void calculation()
    {
        ttl=p*qty;
        if (ttl>15000)
        {
            disc=ttl/4;
            net=ttl-disc;
        }
        else
        net=ttl;
    }
    public void print()
    {
        System.out.println(net);
    }
    public static void main(String args[])
    {
        stock obj=new stock();
        obj.calculation();
        obj.print();
}
}

    
    
    