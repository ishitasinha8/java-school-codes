import java.io.*;
class Special2
{
    int n;
    int newfact=1;
    int fact=1;int i=1;
    Special2()
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
        if(x>=1)
        {
            fact=fact*x;
            if(x==1)
            {
                
                newfact=fact;
                fact=1;
            }
            
            factorial(--x);
            
            
            
        }
       
        return(newfact);
    }
    boolean isSpecial()
    {
        int p=n;
        int abc=0;
        while(p!=0)
        {
            int a=p%10;
//            System.out.println("a = "+a);
            abc=abc+factorial(a);
//            System.out.println("abc1 = "+abc);
            p/=10;
        }
        //System.out.println("abc = "+abc);
        if(abc==n)
        {
            return(true);
        }
        else 
            return(false);
    }
    void display()
    {
        if(isSpecial()==true)
        {
            System.out.println("SPECIAL");
            
        }
        else
            System.out.println("NOT SPECIAL");
    }
    public static void main(String args[])throws IOException
    {
        Special2 obj=new Special2();
//        obj.factorial(5);
        obj.read();
        obj.display();
        
    }
}