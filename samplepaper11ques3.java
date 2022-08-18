import java.io.*;
class samplepaper11ques3
{
    String x;int l;String word[]=new String[20];int j;int vowel,consonant;
    public void accept() throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence in uppercase ending with . ?");

        x=buffy.readLine();
        l=x.length();
        if((x.charAt(l-1)=='.')||(x.charAt(l-1)=='?'))
        {
           System.out.println("INPUT: "+x);
        }
        else
        {
            System.out.println("Enter sentence properly");
            System.exit(0);
        }
        
    }
    public void wordsarray()
    {
        int p=0;
        x=x.substring(0,l-1);
        x=x+' ';
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                word[j]=x.substring(p,i);
                p=i+1;
                j++;
            }
        }
        
    }
    public void uppercase()
    {
        for(int i=0;i<j;i++)
        {
            char c=word[i].charAt(0);
            if(Character.isLowerCase(c))
            {
                char c2=Character.toUpperCase(c);
                word[i]=c2+word[i].substring(1,word[i].length());
            }
        }
    }
    public void vowelconsonants()
    {
        vowel=0;
        consonant=0;
        System.out.println("Word        Vowel        Consonant");
        try
        {
        for(int i=0;i<j;i++)
        {
            int l2=word[i].length();
            for(int k=0;k<l2;k++)
            {
                char c=word[i].charAt(k);
                if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
                {
                    vowel++;
                }
                else consonant++;
            }
            System.out.println(word[i]+"          "+vowel+"          "+consonant);
            vowel=0;consonant=0;
        }
        }
        catch(Exception d){System.out.println(d.getMessage());}
    }
    public static void main(String args[])throws IOException
    {
        samplepaper11ques3 obj=new samplepaper11ques3();
        obj.accept();
        obj.wordsarray();
        obj.uppercase();
        obj.vowelconsonants();
    }       
}