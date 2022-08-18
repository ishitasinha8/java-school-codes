import java.io.*;


public class PrimeAdam {
    int m,n,k=0;
    int P[]= new int[100];
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT: m = ");
        try
        {     
            m=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        System.out.print("INPUT: n = ");
        try
        {
            n=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        if(m>n)
        {
            System.out.println("OUTPUT : Invalid Input");
            System.exit(0);
        }
    }
    public void primenum()
    {
        int x,y,count=0;
        long sqp;
        double revp=0;
        for(int i=5;i<n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                P[k]=i;
                //System.out.println(P[k]);
                k++;count=0;
            }
            else count=0;
        }
        for(int i=0;i<k;i++)
        {
            sqp=P[i]*P[i];
            int a=P[i];
            if (a>9)
            {
                while(a!=0)
                {
                    double z=a/(Math.pow(10,i+1));
                    revp=revp+z*(Math.pow(10,i+1));
                    a=a/10;
                    System.out.println(" "+revp);
                }
            }
        }
    }
  
    public static void main(String args[])throws IOException
    {
        PrimeAdam obj=new PrimeAdam();
        obj.accept();
        obj.primenum();
    }
}

