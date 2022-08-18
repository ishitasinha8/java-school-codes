import java.util.*;
class samplepaper20question2
{
    int M;int A[][]=new int[20][20];
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: M= ");
        try
        {
            M=sc.nextInt();

        }
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        System.exit(0);
            
        }
        if(M<=2||M>=20)
        {
            System.out.println("Output: SIze out of Matrix");
        }
        try
        {
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<M;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }
        }
        catch(Exception d)
        {
            System.exit(0);
        }
    }
    public void mirror()
    {
        int B[][]=new int[20][20];
        int k=M-1;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                
                B[i][j]=A[i][k];
                k--;
            }
            k=M-1;
        }
        System.out.println("Output: Original Matrix");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                
               System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Image Matrix");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                
               System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        samplepaper20question2 obj=new samplepaper20question2();
        obj.accept();
        obj.mirror();
    }
}