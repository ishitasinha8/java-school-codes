import java.io.*;
class ques1_2018 
{
    int N;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT: N = ");
        try
        {
            N=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        if((N<9)||(N>50))
        {
            System.out.println("OUTPUT : NUMBER OUT OF RANGE");
            System.exit(0);
        }
        else if(N%2!=0)
        {
            System.out.println("OUTPUT : NUMBER IS ODD");
            System.exit(0);
        }
    }
    public void primepair()
    {
        System.out.println("OUTPUT: PRIME PAIRS ARE: ");
        int x,y;
        int count,count2;
        for(int i=3;i<N;i++)
        {
            count=0;
            count2=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                x=i;
                y=N-x;
                if(y>=x)
                {
                    for(int k=2;k<=y;k++)
                    {
                        if(y%k==0)
                        {
                            count2++;
                        }
                    }
                    if(count2==1)
                    {
                        System.out.println("                         "+x+", "+y);
                    }
                }
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        ques1_2018 obj=new ques1_2018();
        obj.accept();
        obj.primepair();
    }
}
