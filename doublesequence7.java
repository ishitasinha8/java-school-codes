import java.io.*;
class doublesequence7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence in lower case having repeted letter words");
        String x = buffy.readLine();
        int l = x.length();
        int a = 0;
		String sequence= "";
		String k = x.toUpperCase();
        for(int i=0; i<l-1; i++)
        {
            char c=x.charAt(i);
            char d=k.charAt(i);
            char e=k.charAt(i+1);
            if(d==e)a++;
		}
		System.out.println("New upper case String = "+k);
		System.out.println("frequency of repeating letters = " +a);
	}
}
				