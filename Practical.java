import java.io.*;
class midtermquestion3
{
    //samplepaper2020question2
    String x;int l,j;
    String words[]=new String[20];
    public void accept() throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence in uppercase ending with . , ? !");

            x=buffy.readLine();
        l=x.length();
        if((x.charAt(l-1)=='.')||(x.charAt(l-1)==',')||(x.charAt(l-1)=='?')||(x.charAt(l-1)=='!'))
        {
           System.out.println("INPUT: "+x);
        }
        else
        {
            System.out.println("Enter sentence properly");
            System.exit(0);
        }
        
    }
    public void wordread()
    {
        int i=0,p=0;
        j=0;
        x=x.substring(0,l-1);
        x=x+' ';
        for(i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                words[j]=x.substring(p,i);
                j++;
                p=i+1;
            }
            
        }

    }
    public void ascii()
    {
        int sum=0;
        System.out.println("OUTPUT:");
        for(int i=0;i<j;i++)
        {
            int l2=words[i].length();
            for(int k=0;k<l2;k++)
            {
                int num=(int)words[i].charAt(k);
                sum=sum+num;              
            }
            System.out.println(words[i] +"="+sum);
            sum=0;
        }
    }
    public void sort()
    {
        String temp="";
        for(int i=0;i<j-1;i++)
        {
            for(int k=i+1;k<j;k++)
            {
                if(words[i].compareTo(words[k])>0)
                {
                    temp=words[i];
                    words[i]=words[k];
                    words[k]=temp;
                }
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(words[i]+" ");
        }
    }
    public static void main(String args[])throws IOException
    {
        midtermquestion3 obj=new midtermquestion3();
        obj.accept();
        obj.wordread();
        obj.ascii();
        obj.sort();
    }
}
