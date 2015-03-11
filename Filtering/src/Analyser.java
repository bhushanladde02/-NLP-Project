
import rita.wordnet.*;
import java.io.*;
public class Analyser
{
    String[] ret_str=new String[100];
    public String[] analyze (String[] str1,int n)
    {
       try
       {
           int i,k=0;
           //String[] str1=new String[100];
           
            boolean ans=false;
            // String name1="",keyword="";
            RiWordnet wordnet = new RiWordnet();
          //  Dictjdbc jd =new Dictjdbc();
           
               
                for(i=0;i<n;i++)
                {
                 
                    ans=wordnet.isNoun(str1[i]);
                    if(ans==true)
                    {
                        ret_str[k]=str1[i];
                        k++;
                    }
                    
                }
         /*   System.out.println("The o/p is");
                for(i=0;i<k;i++)
                {
                    System.out.println(ret_str[i]);
                }
            */
            
        }
        catch(Exception e)
        {
        }
        return ret_str;
   }
}