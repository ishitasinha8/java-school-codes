import java.io.*;
class Special
{
    int n,m=1;int a; int sum=0,factorialnum=1;
    Special()
    {
        n=0;
    }
    void read()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        n=Integer.parseInt(buffy.readLine());
        
    }
    int factorial(int x)
    {
        if(x>0)
        {
            factorialnum=factorialnum*x;
            
            if(x==1)
            {
                a=factorialnum;
                factorialnum=1;
            }
            factorial(--x);
        }

        return(a);
        
    }
    boolean isSpecial()
    {
        int num=n;int afact;
        while(num>0)
        {
            a=num%10;
            afact=factorial(a); 
           
            sum=sum+afact; 
            //System.out.println(sum);
            num=num/10;
            afact=0;
        }
        
        if(sum==n)
        {
            return(true);
        }
        else
            return false;
    }
    void display()
    {
        if(isSpecial()==true)
        {
            System.out.println("Special number");
            
        }
        else System.out.println("Not a Special number");
    }
    public static void main(String args[])throws IOException
    {
        Special obj=new Special();
        obj.read();
        obj.display();
        
    }
}