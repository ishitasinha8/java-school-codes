import java.io.*;
class ques1_2017
{
    int N;int x;
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
        if(N>1000)
        {
            System.out.println("OUTPUT : NUMBER OUT OF RANGE");
            System.exit(0);
        }
        x=N;
    }
     public void calc()
     {
         int count48 = 0,count24 = 0,count12 = 0,count6 = 0,countP = 0,rem = 0;
         System.out.println("OUTPUT: ");
         while(N!=0)
         {
             if(N>=48)
             {
                 count48=N/48;
                 N=N%48;
                 System.out.println("                   48 * "+count48+" = "+(count48*48));
             }
             if(N>=24&&N<48)
             {
                 count24=N/24;
                 N=N%24;
                 System.out.println("                   24 * "+count24+" = "+(count24*24));
             }
             if(N>=12&&N<24)
             {
                 count12=N/12;
                 N=N%12;
                 System.out.println("                   12 * "+count12+" = "+(count12*12));
             }
             if(N>=6&&N<12)
             {
                 count6=N/6;
                 N=N%6;
                 rem=N;
                 System.out.println("                    6 * "+count6+" = "+(count6*6));
             }
             if(N<6)
             {
                 if(rem==0)
                 {
                     System.out.println("Remaining boxes   = 0");
                 }
                 else
                 
                 {
                     countP++;
                     System.out.println("Remaining boxes   "+rem+" * "+count12+" = "+(countP*rem));
                     
                 }
                 
                 
                 N=0;
                 
             }
         }
         
         System.out.println("Total number of boxes = "+x);
         System.out.println("Total number of cartons = "+(count48+count24+count12+count6+countP));
     }
     public static void main(String args[])throws IOException
     {
         ques1_2017 obj=new ques1_2017();
         obj.accept();
         obj.calc();
         
     }
}