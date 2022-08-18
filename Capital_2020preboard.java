import java.io.*;
class Capital
{
    String sent;
    int freq,l;
    String nw;
    
    Capital()
    {
        sent="";
        freq=0;
    }
    void input()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        sent=buffy.readLine();
        sent=sent+" ";
        l=sent.length();
    }
    boolean isCap(String w)
    {
        
        if(Character.isUpperCase(w.charAt(0)))
        {
            freq++;
            return(true);
            
        }
        else
            return false;
    }
    void display()
    {
        System.out.println(sent);
        
        int p=0;
        boolean flag;
        
        for(int i=0;i<l;i++)
        {
            char c=sent.charAt(i);
            if(c==' ')
            {
                nw=sent.substring(p,i);
                p=i+1;
                flag=isCap(nw);
                if(flag==true)
                {
                    System.out.println(nw);
                }
            }
            
        }
        System.out.println("Frequency of capital letter words="+freq);
        
    }
    public static void main(String args[])throws IOException
    {
        
        Capital obj=new Capital();
        obj.input();
        obj.display();
    }
}