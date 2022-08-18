import java.io.*;
class Disarium
{
    int num,size,num1,num2,q,a,sum=0;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countdigit()
    {
        num1=num;
        while(num1>0)
        {
            num1=num1/10;
            size++;
        }
    }
    int sumofdigits(int n,int p)
    {
        
        return((int)Math.pow(n,p));
    }
    void check()
    {
        q=size;
        num2=num;
        while(num2>0)
        {
            a=num2%10;
            sum=sum+sumofdigits(a,q);
            q--;
            num2/=10;
        }
        if(sum==num)
        {
            System.out.println("It is a disarium number");
        }
        else
            System.out.println("It is not a disarium number");
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int aa=Integer.parseInt(buffy.readLine());
        Disarium obj=new Disarium(aa);
        obj.countdigit();
        obj.check();
    }
    
}