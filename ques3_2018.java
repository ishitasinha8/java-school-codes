import java.io.*;
class ques3_2018
{
    int N,len;
    String A[]=new String [50];
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
            System.out.println("Exception "+e.getMessage());
            System.exit(0);
        }
        if(N<=2||N>=9)
        {
            System.out.println("INVALID INPUT ");
            System.exit(0);
        }
        len=0;
        int m;
        for(int i=0;i<N;i++)
        {
            System.out.print("Team "+(i+1)+": ");
            A[i]=buffy.readLine();
            //System.out.println();
            int l=A[i].length();
            if(l>len)
            {
                len=l;
            }
            
        }
        for(int i=0;i<N;i++)
        {
            if(A[i].length()<len)
            {
                m=len-A[i].length();
                for(int a=0;a<m;a++)
                {
                    A[i]=A[i]+" ";
                    //System.out.println(A[i]);
                }
            }
        }
        
    }
    public void show()
    {
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(A[j].charAt(i)+" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String Args[])throws IOException
    {
        ques3_2018 obj=new ques3_2018();
        obj.accept();
        obj.show();
    }
    
}