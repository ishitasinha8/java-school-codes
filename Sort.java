import java.io.*;
class Sort
{
    String str;
    int len;
    char letter[]=new char[20];

    Sort()
    {
        str="";
        len=0;
    }
    void readword()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word");
        str=buffy.readLine();
        len=str.length();
    }
    void arrange()
    {
        for(int i=0;i<len;i++)
        {
            char c=str.charAt(i);
            letter[i]=c;
        }
        char temp;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if(((int)letter[j])>((int)letter[j+1]))
                {
                    temp=letter[j+1];
                    letter[j+1]=letter[j];
                    letter[j]=temp;
                }
            }
        }
    }
    void display()
    {
        System.out.println(str);
        for(int i=0;i<len;i++)
        {
            System.out.print(letter[i]);
        }
    }
    public static void main(String args[])throws IOException
    {
        Sort obj=new Sort();
        obj.readword();
        obj.arrange();
        obj.display();
    }
}