import java.io.*;
class samplepaper11ques1
{
    int M,N;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER M bw 100 and 10000");
        try
        {
            M=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Exception M "+e.getMessage());
        }
        System.out.println("ENTER N less than 100");
        try
        {
            N=Integer.parseInt(buffy.readLine());
        }
        catch(Exception d)
        {
            System.out.println("Exception N "+d.getMessage());
        }
        if((M<100)||(M>10000)||(N>100))
        {
            System.out.println("Enter properly");
            System.exit(0);
        }
            
    }
    public void number()
    {
        int num=M;
        int num2=M;
        int sum=0;
        int count=0;
        while(num>0)
        {
            sum=sum+(num%10);
            //System.out.println("sum "+sum);
            num/=10;
            count++;
            if (sum==N)
            {
                System.out.println("the reqd num="+num2);
                System.out.println("total digits="+count);
                break;
            }
            if(num==0)
            {
                num2++;
                num=num2;
                sum=0;
                count=0;
            }
            
        }
        
        
    }
    public static void main(String args[])throws IOException
    {
        samplepaper11ques1 obj=new samplepaper11ques1();
        obj.accept();
        obj.number();
    }
        
}