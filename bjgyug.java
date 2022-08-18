import java.io.*;
class bjgyug
{
    public static void main(String args[])
    {
        /*int a=5;
        a++;
        System.out.println(a);
        a/=(a++)-(--a)+(a--)-(++a);
        /*int b=2;
        String x="CABLE";
        String y="CADET";
        int c=x.compareTo(y);
        a*=++a+a--+a+(++a);
        b+=b--+--b+(++b);*/
        //System.out.println("the king said\"Begin at the beginning !\"to me");
        int ctr=0;
        for(int i=1;i<=5;i++)
        for(int j=1;j<=5;j+=2)
        ++ctr;
                System.out.println(ctr);
    }
}