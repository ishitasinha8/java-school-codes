import java.io.*;
class frequency6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence having repeated words");
        String x1 = buffy.readLine();
        int l1 = x1.length();
        System.out.println("Enter the word to search in the sentence");
        String x2 = buffy.readLine();
       	int a = 0;
		String word= "";
        for(int i=0; i<l1; i++)
        {
            char c=x1.charAt(i);
            if(c!=' ')
			    word=word+c;
			else if (c==' ')
			{
			    if (word.equals(x2))
				a++;		
				word="";
			}
			if (i==(l1-1))
			{
			    if (word.equals(x2))a++;
				System.out.print("Number of repeation of ");
			    System.out.print(x2);
				System.out.println(" = " +a);
			}

		}
	}
}
				