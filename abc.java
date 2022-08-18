import java.io.*;
class abc
{
    int uc=0;
    int lc=0;
    int d=0;
    int sp=0;
    public void characters(String x)
    {
        int l=x.length();
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(Character.isUpperCase(c))
            {
                uc++;

            }            
            else if(Character.isLowerCase(c))
            {
                lc++;

            }              
            else if(Character.isDigit(c))
            {
                d++;

            }  
            else
            {
                sp++;
            
            }}
            System.out.println(uc+","+lc+","+d+","+sp);
        }
    

    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string");
        String y=buffy.readLine();
        abc obj=new abc();
        obj.characters(y);  
        
    }
}
        