import java.io.*;
class samplepaper19question2
{
    String x;int l,p;
    String words[]=new String[20];
    BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws IOException
    {
        

        System.out.print("Input: ");
        x=buffy.readLine();
        l=x.length();
        if(!(x.endsWith("."))||(x.endsWith("!"))||(x.endsWith("?")))
        {
            System.out.println("OUTPUT : Invalid input");
            System.exit(0);
        }
        p=0;
        int j=0;
        int blank=0;
        x=x.substring(0,l-1);
        
        x=x+' ';
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                if(blank==0)
                {
                    words[p]=x.substring(j,i);
                    p++;
                    blank++;
                    j=i+1;
                }
                else 
                    j=i+1;
                
            }
            else
            {
                blank=0;
                
            }
            
        }
//        for(int i=0;i<j;i++)
//        {
//            System.out.println(words[i]+"/");
//        }
    }
    public void delete()throws IOException
    {
        System.out.print("Word to be deleted: ");
        x=buffy.readLine();
        System.out.print("Word position in the sentence: ");
        int pos=Integer.parseInt(buffy.readLine());
        System.out.print("OUTPUT: ");
        for(int i=0;i<p;i++)
        {
            
            if(i==(pos-1))
            {
                i++;
            }
            System.out.print(words[i]+" ");
        }
    }
    public static void main(String args[])throws IOException
    {
        samplepaper19question2 obj=new samplepaper19question2();
        obj.accept();
        obj.delete();
    }
}