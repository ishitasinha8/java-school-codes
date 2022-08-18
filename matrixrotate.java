import java.io.*;
class matrixrotate
{
    //samplepaper11question2
    int M;int A[][]=new int[10][10];

    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter order of matrix between 3 and 10");
        try
        {
            M=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e.getMessage());
            System.exit(0);
        }
        if((M<2)||(M>10))
        {
            System.exit(0);
        } 
        System.out.println("Enter "+(M*M)+" Numbers");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=Integer.parseInt(buffy.readLine());
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
               
            }
            System.out.println();
        }
    }
    public void rotate()
    {
        int B[][]=new int[10][10];int k=M-1;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                B[i][j]=A[k][i];
                k--;
            }
            k=M-1;
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(B[i][j]+" ");
               
            }
            System.out.println();
        }
    }
    public static void main(String args[])throws IOException
    {
        matrixrotate obj=new matrixrotate();
        obj.accept();
        obj.rotate();
    }
}