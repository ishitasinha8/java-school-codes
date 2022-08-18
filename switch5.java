import java.io.*;
class switch5
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("a. a/4 + a/8 + a/12 upto n terms");
    System.out.println ("b. 1/2 + 2/3 + 3/4 upto n terms");
    System.out.println ("enter your choice");
    char ch=(char)buffy.read();
    switch (ch)
    {
        case 'a':
        {
            BufferedReader buff=new BufferedReader (new InputStreamReader(System.in));
            System.out.println("enter a value for a");
            String Z=buff.readLine();
            float z=Float.parseFloat(Z);
            System.out.println("enter the number of terms");
            String N=buff.readLine();
            int n=Integer.parseInt(N);
            float S=0;
            int c=0;
            for(int i=4;c<n;i=i+4)
            {
                S=S+(z/i);
                c++;
            }
            System.out.println("S = "+S);
        }
        break;
        case 'b':
        {
            
            BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
            System.out.println("enter the number of terms");
            String M=buf.readLine();
            float m=Float.parseFloat(M);
            float T=0;
            float d=0;
            for(float j=1;d<m;j++)
            {
                T=T + j/(j+1);
                d++;
            }
            System.out.println("S = "+T);
        }
        break;
    }
}
}
        
            
            
            
            