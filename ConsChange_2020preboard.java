import java.io.*;
class ConsChange_2020preboard
{
    String word;
    int len;
    String vow="",cons="",shift,change;
    ConsChange_2020preboard()
    {
        word="";
        len=0;
    }
    void readword()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word in lowercase");
        word=buffy.readLine();
        word=word.toLowerCase();
    }
    void shiftcons()
    {
        len=word.length();
        for(int i=0;i<len;i++)
        {
            char c=word.charAt(i);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
            {
                vow=vow+c;
            }
            else
            {
                cons=cons+c;
            }
        }
        shift=cons+vow;
    }
    void changeword()
    {
        cons=cons.toUpperCase();
        change=cons+vow;
    }
    void show()
    {
        System.out.println("original word ="+word);
        System.out.println("shifted word ="+shift);
        System.out.println("changed word ="+change);
    }
    public static void main(String args[])throws IOException
    {
        
        ConsChange_2020preboard obj=new ConsChange_2020preboard();
        obj.readword();
        obj.shiftcons();
        obj.changeword();
        obj.show();
    }
}