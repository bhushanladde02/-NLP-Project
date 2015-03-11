
import java.io.*;
public class Keyword_Trigger
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
          Keyword_Checker kc = new Keyword_Checker();
          int returned=kc.keywordcheck(input);
          System.out.println("The position of than is "+returned);
        }catch(Exception e){}
    }
}
