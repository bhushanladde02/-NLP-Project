import java.io.*;


public class Dict_Trigger
{
    public static void main(String srgs[])
    {
        String returned,input;
        Dict_Search ds = new Dict_Search();
        try
        {
            System.out.println("Enter the word ->");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            returned=ds.dictsearch(input);
            System.out.println("The returned value is  "+returned);
        }
        catch(Exception e){}

    }


}
