import java.io.*;
class samplepapermatrix
{
    //samplepaper10question2
    int M;int A[][]=new int[10][10]; int a,diagsum;
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
        if((M<3)||(M>10))
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
        System.out.println("ORIGINAL MATRIX ");
    }
    public void innersort()
    {
        int B[]=new int[100];a = 0;
        for(int i=1;i<M-1;i++)
        {
            for(int j=1;j<M-1;j++)
            {
                B[a]=A[i][j];
                a++;
            }
        }
        int temp=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(B[j]<B[i])
                {
                    temp=B[j];
                    B[j]=B[i];
                    B[i]=temp;
                }
            }
        }
        a=0;
        for(int i=1;i<M-1;i++)
        {
            for(int j=1;j<M-1;j++)
            {
                A[i][j]=B[a];
                a++;
            }
        }
        System.out.println("REARRANGED MATRIX");
    }
    public void diagonalsum()
    {
        System.out.println("diagonal elements");
        diagsum=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if((i==j)||(i+j==(M-1)))
                    {
                        diagsum=diagsum+A[i][j];
                        System.out.print(A[i][j]+" ");
                    }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("DIAGONAL SUM ="+diagsum);
    }
    public void display()
    {
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])throws IOException
    {
        samplepapermatrix obj=new samplepapermatrix();
        obj.accept();
        obj.display();
        obj.innersort();
        obj.display();
        obj.diagonalsum();
        
    }
}