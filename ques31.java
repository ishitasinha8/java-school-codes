import java.io.*;
class ques31
{
    int dec;
    String hexa;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Decimal number");
        dec=Integer.parseInt(buffy.readLine());
    }
    public void hexa()
    {
        int i=0;
        int rem[]=new int[10];
        char rem2[]=new char[10];
        while(dec!=0)
        {
            
            rem[i]=dec%16;
            //System.out.println(rem[i]);
            if(rem[i]>=10)
            {
                rem2[i]=(char)(rem[i]+55);
                //System.out.println(rem2[i]);
                rem[i]=0;
            }
            i++;
            dec/=16;
            //System.out.println(dec);
        }
        for(int j=(i-1);j>=0;j--)
        {
            if(rem[j]!=0)
            {
                System.out.print(rem[j]);
                
            }
            System.out.print(rem2[j]);
        }
        System.out.println();
    }
    public static void main(String args[])throws IOException
    {
        ques31 obj=new ques31();
        obj.accept();
        obj.hexa();
    }
}