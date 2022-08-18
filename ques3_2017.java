import java.io.*;
class ques3_2017
{
    String x;int l;
    BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws IOException
    {
        System.out.println("Input: ");
        x=buffy.readLine();
        l=x.length();
//        System.out.println(l);
//        System.out.println(x.charAt(l-1));
        if(l<=3||l>100)
        {
            System.out.println("output: invalid length");
            System.exit(0);
        }
    }
    public void encrypt()
    {
        
        String nw="";
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            int ascii=(int)c;
            if((ascii>=65)&&(ascii<=90))
            {
                if(ascii<=77)
                {
                    ascii=ascii+13;
                    nw=nw+(char)ascii;
                    System.out.println("a "+nw);
                }
                else
                {
                    ascii=ascii-13;
                    nw=nw+(char)ascii;
                    System.out.println("b "+nw);
                }
            }
            else if((ascii>=97)&&(ascii<=122))
            {
                if(ascii<=109)
                {
                    ascii=ascii+13;
                    nw=nw+(char)ascii;
                    System.out.println("c "+nw);
                }
                else
                {
                    ascii=ascii-13;
                    nw=nw+(char)ascii;
                    System.out.println("d "+nw);
                }
            }
            else
            {
                nw=nw+c;
                System.out.println("e "+nw);
            }
            
        }
        //System.out.println("OUTPUT = "+nw);
    }
    public static void main(String args[])throws IOException
     {
         ques3_2017 obj=new ques3_2017();
         obj.accept();
         obj.encrypt();
         
     }
}