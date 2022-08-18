import java.io.*;
class doubled
{
    int A[][]=new int[3][7];
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an array");
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter row "+i);
            for(int j=0;j<7;j++)
            {
                String x=buffy.readLine();
                A[i][j]=Integer.parseInt(x);
            }
        }
    }
    public void bubblesort()
    {
        int temp;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<7;j++)
            {
                for(int k=0;k<6;k++)
                {
                    if(A[i][k]>A[i][k+1])
                    {
                        temp=A[i][k];
                        A[i][k]=A[i][k+1];
                        A[i][k+1]=temp;
                    }
                }
            }
        }
    }
    public void print()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        doubled obj=new doubled();
        obj.accept();
        obj.bubblesort();
        obj.print();
    }
}
