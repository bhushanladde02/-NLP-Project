import java.io.*;
public class Upper_Case
{
    public static void main(String arg[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the String");
            String str=br.readLine();
            String str1=str.toUpperCase();
            System.out.println("The string is "+str1);
        }catch(Exception e){}
    }



}
