/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
//import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class Tokenizer
{
	public String[] token(String str1)
	{
             String[] fin_tokens = new String[100];
            try
            {
               int j=0,tokcnt=0;
               ArrayList ar=new ArrayList();
              
               StringTokenizer st = new StringTokenizer(str1);
                 while (st.hasMoreTokens())
                    {
         		ar.add(st.nextToken());
         		 j++;
                    }
        		tokcnt=j;
                	System.out.println(tokcnt);
                      //  System.out.println("tokens are generated.\n");
                       System.out.println("Tokens are as follows:\n");

                    for(int k=0;k<tokcnt;k++)
                    {
                        System.out.print("Token["+k+"]"+":");
                        System.out.println(ar.get(k).toString());
                        
                    }
                    for(int i=0;i<tokcnt;i++)
                    {
                        fin_tokens[i]=ar.get(i).toString();
                    }
                        System.out.println("The final tokens are ");
                    for(int i=0;i<tokcnt;i++)
                    {
                        //fin_tokens[i]=ar.get(i).toString();
                        System.out.println(fin_tokens[i]);
                    }
                        
            }
            catch(Exception e)
            {
	    }

             return fin_tokens;
	}

      /*  public static void main(String arg[])
        {
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str1;
                str1=br.readLine();
                Tokenizer tk = new Tokenizer();
                tk.token(str1);
            }
            catch(Exception e){}
        }*/
}
