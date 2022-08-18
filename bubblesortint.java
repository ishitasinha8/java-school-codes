import java.io.*;
class bubblesortint
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int m[] = new int[5];
        System.out.println("enter the numbers");
        int l = m.length;
        
        for (int i=0; i<5; i++)
        {
            String x = buffy.readLine();
            m[i] = Integer.parseInt(x);
        }
        int t=0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4-i; j++)
            {
                if(m[j]>(m[j+1]))
                {
                    t = m[j];
                    m[j] = m[j+1];
                    m[j+1] = t;
                }
            }
        }
        System.out.println("numbers are sorted in ascending order");
        for (int i=0; i<5; i++)
        {
            System.out.println(m[i]);
        }
        System.out.println(l+ "is the number of elements in the array");
    }
}

