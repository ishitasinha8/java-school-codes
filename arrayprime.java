import java.io.*;
class arrayprime
{
    int A[]=new int[20];         int B[]=new int[20];
    int pos, num;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an array");
        for(int i=0;i<10;i++)
        {
            String z=buffy.readLine();
            A[i]=Integer.parseInt(z);
        }
        System.out.println("Enter the new number");
        String y=buffy.readLine();
        num=Integer.parseInt(y);
        System.out.println("Enter the position");
        String x=buffy.readLine();
        pos=Integer.parseInt(x);
    }
    public void calculate()
    {
        int sum=0;
        for(int i=0;i<10;i++)
        {
            for(int j=1;j<A[i];j++)
            {
                if(A[i]%j==0)
                {
                    sum++;
                }
            }
            if(sum==1)
            {
                System.out.println(A[i]+" is a prime number");
            }
            else
            {
            System.out.println(A[i]+" is not a prime number");
            }
            sum=0;
        }
    }
    public void insert()
    {
        for(int i=0;i<11;i++)
        {
            if(i<=(pos-2))
            {
                B[i]=A[i];
            }
            else if(i==(pos-1))
            {
                B[i]=num;
            }            
            else if(i>(pos-1))
            {
                B[i]=A[i-1];
            }
        }
    }
    public void print()
    {
        for(int i=0;i<11;i++)
        {
            System.out.println(B[i]);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        arrayprime obj=new arrayprime();
        obj.accept();
        //obj.calculate();
        obj.insert();
        obj.print();
    }
}
        