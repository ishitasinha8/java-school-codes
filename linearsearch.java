import java.io.*;
class linearsearch
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String A[] = new String[13];
        for(int i=0; i<13; i++)
        {
            System.out.println("Enter a name");
            A[i] = buffy.readLine();
        }
            System.out.println("enter a name to search");
            String n = buffy.readLine();
            int flag = 0;
            int p = 0;
        for(int i=0; i<13; i++)
        {
            if (n.equals(A[i]))
            {
                flag = 1;
                p=i+1;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("found");
            System.out.println("Position of name = "+p);
        }
        else
        System.out.println("Not found");
    }
}

