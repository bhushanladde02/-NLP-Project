
import java.io.*;
public class position_Trigger
{
    public static void main(String[] args )
    {
        String input[]=new String[100];
        try
        {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the three strings ");
          for(int i=0;i<3;i++)
          {
              input[i]=br.readLine();
          }
          Position_Checker pc = new Position_Checker();
          pc.positionckeck(input);
        }catch(Exception e){}
    }
}