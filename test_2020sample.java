import java.io.*;
class test_2020sample
{
    int sum=0,p=4;
    void test(int count)
    {
        if(count==0)
        System.out.println("count 00 ");
        else
        {
            System.out.println("BYE"+count);
            test(--count);
            System.out.println("abc "+count);
        }
    }
    void recur(int n)
    {
        if(n>1)
        {
            System.out.print(n+" ");
            if(n%2!=0)
            {
                n=3*n+1;
                System.out.print(n+" ");
            }
            recur(n/2);
        }
    }
    int Mystery(int num,int x, int y)
    {
        if(num<10)
        {
            return num; 
            //System.out.println(num);
        }
        else
        {
            int z=num%10; 
            //System.out.println("int z=num%10; "+z);
            if(z%2==0)
            {
                return(z*x)+ Mystery(num/10,x,y); 
                //System.out.println("return(z*x)+ Mystery(num/10,x,y); "+z*x);
            }
            else
            {
                return(z*y)+ Mystery(num/10,x,y);
                //System.out.println("return(z*y)+ Mystery(num/10,x,y); "+z*x);
            }
        }
    }
    int sum_pow(int i)
    {
        if(i>0)
        {
            sum=sum+(int)Math.pow((i%10),p);
            sum_pow(i/10);
        }
            return(sum);
    }
    public static void main(String args[])throws IOException
    {
        test_2020sample obj=new test_2020sample();
        //obj.test(4);
        //obj.recur(10);
        //obj.Mystery(43629,3,4);
        int a=obj.sum_pow(1634);
        System.out.println(a);
        
    }
}