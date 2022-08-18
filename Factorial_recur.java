import java.io.*;
class Factorial_recur
{
    int m,n,z,b,j,l; String x;
    public long accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        x=buffy.readLine();
        n=Integer.parseInt(x);
        return(n);
        //l=x.length();
    }
        
    public long Fact(long n)
    {
        if (n<2)
            return (1);
        return (n*Fact(n-1));
    }
        
            
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        Factorial_recur obj=new Factorial_recur();
        long e=obj.accept();
        long d=obj.Fact(e);
        System.out.println("Factorial = "+d);
    }
}
        
    
    
        