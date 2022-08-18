import java.io.*;
class ArmNum_2019
{
    int l,n,sum;
    ArmNum_2019(int nn)
    {
        n=nn;
        int a=n;
        while(a>0)
        {
            a=a/10;
            l++;
        }
    }
    int sum_pow(int i)
    {
        if(i>0)
        {
            sum=sum+(int)Math.pow(n%10,l);
            sum_pow(n/10);
        }
        return(sum);
    }
    void isArmstrong()
    {
        if(sum_pow(n)==n)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
    }
    public static void main(String args[])
    {
        
        ArmNum_2019 obj=new ArmNum_2019(371);
        obj.isArmstrong();
    }
}
    