import java.io.*;
class samplepaper19magicnumber
{
    //samplepaper19question1
    int m,n;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number M and N where M less than N");
        try
        {
            m=Integer.parseInt(buffy.readLine());
            n=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Exception " +e.getMessage());
            System.exit(0);
        }
        if(m>n)
        {
            System.out.println("Enter M less than N");
            System.exit(0);
        }
    }
    public void composite()
    {
        int count=0;
        System.out.println("The composite magic integers are: ");
        try
        {
            for(int i=m;i<=n;i++)
            {
                int mm=i;
                int sum=0;
                int sum2=0;
                count=0;
                for(int j=1;j<i;j++)
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                if(count>=2)
                {
                    while(mm!=0)
                    {
                        sum=sum+(mm%10);
                        mm/=10;
                        if((sum==1)&&(mm==0))
                            {
                                System.out.print(i+", ");
                            }
                        else if(sum>9)
                        {
                            while(sum!=0)
                            {
                                sum2=sum2+(sum%10);
                                sum/=10;
                                if((sum2==1)&&(sum==0))
                                {
                                    System.out.print(i+", ");
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e.getMessage());
        }
    }
    public static void main(String args[])throws IOException
    {
        samplepaper19magicnumber obj=new samplepaper19magicnumber();
        obj.accept();
        obj.composite();
    }
}