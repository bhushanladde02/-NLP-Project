
import java.io.*;
public class Trim_Trigger
{
    public static void main(String[] arg)
    {
        String str[]=new String[100];
        String returned[]=new String[100];
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the 3 strings ");
            for(int i=0;i<3;i++)
            {
                str[i]=br.readLine();
            }
            Trimmer tr = new Trimmer();
            returned=tr.trim(str);
            System.out.println("The matched strings are ");
            int j=0;

            while(returned[j]!=null)
            {
                System.out.println(returned[j]);
                j++;
            }
        }
        catch(Exception e){}
    }
}
