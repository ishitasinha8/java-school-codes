import java.io.*;
class samplepaper20q1
{
    String isbn;int l;
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input code: ");
        try
        {
            isbn=buffy.readLine();
        }
        catch(Exception e)
        {
            System.out.println("Output: Invalid Input");
            System.exit(0);
        }
        
        l=isbn.length();
        if(l!=10)
        {
            System.out.println("Output: Invalid Input");
            System.exit(0);   
        }
    }
    public void calc()
    {
        int sum=0;int j=10;
        for(int i=0;i<l;i++)
        {
            
            char c=isbn.charAt(i);
            if((i==9)&&(isbn.charAt(i)=='X'))
            {
                sum=sum+10*1;
            }
            else if(i<9)
            {
                int num=(int)c-48;
                
                sum=sum+num*j;
                j--;
            }
            
        }
        System.out.println("Output: "+sum);
        if(sum%11==0)
        {
            System.out.println("Leaves no remainder: Valid ISBN Code");
        }
        else
            System.out.println("Leaves remainder: Invalid ISBN Code");
    }
    public static void main(String args[])throws IOException
    {
        samplepaper20q1 obj=new samplepaper20q1();
        obj.accept();
        obj.calc();
    }
}