import java.util.*;
class symmetricmatrix_scanner
{
    int M; int A[][]=new int[10][10];
    
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT: M = ");
        try
        {
            M=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e.getMessage());
            System.exit(0);
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
                
            }
            //System.out.println();
        }
    }
    public void check()
    {
        System.out.println("OUTPUT");
        System.out.println("Original Matrix");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");   
            }
            System.out.println();  
        }
        int a=0;
        int left=0,right=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]==A[j][i])
                {
                    a++;
                }
                if(i==j)
                {
                    left=left+A[i][j];
                }
                if((i+j)==(M-1))
                {
                    right=right+A[i][j];
                }
            }
        }
        if(a==(M*M))
        {
            System.out.println("The given matrix is Symmetric");
        }
        else
        {
            System.out.println("The given matrix is not Symmetric");
        }
        System.out.println("Sum of left diagonal= "+left);
        System.out.println("Sum of right diagonal= "+right);
    }
    public static void main(String args[])
    {
        symmetricmatrix_scanner obj=new symmetricmatrix_scanner();
        obj.accept();
        obj.check();
    }
}