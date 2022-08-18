import java.io.*;
class a8
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[10];
        System.out.println("Enter 10 numbers in ascending order");
        for(int i=0; i<10; i++)
        {
            String a = buffy.readLine();
            A[i]= Integer.parseInt(a);
        }
        System.out.println("Enter a number to search");
        String x = buffy.readLine();
        int n = Integer.parseInt(x);
        int flag = 0;
        int lb=0;
        int ub=9;
        int p=0;
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if (A[p]>n)
            ub=p-1;
            if(A[p]<n)
            lb=p+1;
            if (A[p]==n)
            flag=1;
            break;
        }
        if (flag==1)
        {
            System.out.println("Search element found");
            System.out.println("Position of number = "+(p+1));
        }
        else
        System.out.println("Search element not found");
    }
}

