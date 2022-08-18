import java.io.*;
class Composite
{
    int arr[][]=new int[20][20];
    int m,n;
    Composite(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    int isComposite(int p)
    {
        int count=0;
        for(int i=2;i<=p;i++)
        {
            
            if(p%i==0)
            {
                count++;
            }
        }
        if(count>=2)
        {
            count=0;
            return(1);
            
        }
        else
        {
            count=0;
            return 0;
        }
        
        
    }
    void fill()
    {
    int k=4;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x=isComposite(k);
                if(x==1)
                {
                    //System.out.println(k);
                    arr[j][i]=k;
                    
                }
                else
                {    
                    j--;
                }
                k++;

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
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter m");
        int a=Integer.parseInt(buffy.readLine());
        System.out.println("Enter n");
        int b=Integer.parseInt(buffy.readLine());
        Composite obj=new Composite(a,b);
        obj.fill();
        obj.display();
    }
}    
            
        
