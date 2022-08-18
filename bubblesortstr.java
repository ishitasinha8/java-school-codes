import java.io.*;
class bubblesortstr
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String m[] = new String[5];
        System.out.println("enter the numbers");
        int l = m.length;
        
        for (int i=0; i<5; i++)
        {
            m[i] = buffy.readLine();
          //  m[i] = Integer.parseInt(x);
        }
        String t="";
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4-i; j++)
            {
                if(m[j].compareTo(m[j+1])>0)
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

