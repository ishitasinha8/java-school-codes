import java.io.*;
class samplepaper20q3
{
    String x;int l;
    String words[]=new String[20];
    //String rev[]=new String[20];
    BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws IOException
    {
        System.out.println("Input: ");
        x=buffy.readLine();
        l=x.length();
//        System.out.println(l);
//        System.out.println(x.charAt(l-1));
        if(!((x.charAt(l-1))=='.')||((x.charAt(l-1))=='!')||((x.charAt(l-1))=='?'))
        {
            System.out.println("ERROR");
            System.exit(0);
        }
    }
    public void palin()
    {
        x=x.substring(0,l-1);
        x=x+' ';
        int count=0;
        int i=0,j=0,p=0;
        System.out.println(x);
        for(i=0;i<l;i++)
        {
            char c=x.charAt(i);
            //System.out.println(c);
            if(c==' ')
            {
                words[j]=x.substring(p,i);
                System.out.println("words "+words[j]);
                p=i+1;
                j++;
            }
      }
        String nw2="";
        System.out.println("OUTPUT : ");
        for(int m=0;m<j;m++)
        {
            int l2=(words[m]).length();
            //System.out.println("a "+words[m]+" "+l2);
            for(int k=(l2-1);k>=0;k--)
            {
                char c=(words[m]).charAt(k);
                //System.out.println("c "+c+" k "+k);
                nw2=nw2+c;
                //System.out.println("nw2 "+nw2);
            }
            if(nw2.equals(words[m]))
            {
                System.out.println("p "+words[m]);
                count++;
            }
            nw2="";
        }
        System.out.println("No. of palindrome words="+count);
    }
    public static void main(String args[])throws IOException
    {
        samplepaper20q3 obj=new samplepaper20q3();
        obj.accept();
        obj.palin();
    }
}