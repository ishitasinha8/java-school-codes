import java.io.*;
class MatRev
{
    int m,n,newnum;
    int arr[][];
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillArray()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter numbers");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(buffy.readLine());
            }
        }
    }
    int reverse(int x)
    {
        int y=x;
        int l=0;
        while(y>0)
        {
            y=y/10;
            l++;
        }
        int a;
        //int i=0;
        int newnum=0;
        while(x>0)
        {
            a=x%10;
            newnum=newnum+(int)(a*Math.pow(10,l-1));
            l--;
            x=x/10;
        }
        return(newnum);
    }
    void revMat(MatRev P)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=reverse(arr[i][j]);
               
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])throws IOException
    {
        
        MatRev obj=new MatRev(3,3);
        obj.fillArray();
        obj.revMat(obj);
        obj.display();
    }
}