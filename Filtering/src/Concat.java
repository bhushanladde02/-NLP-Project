/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */

import java.lang.String.*;
public class Concat
{
    public String con(String str[],int n)
    {
        //String str[]= new String[100];
        String mix[]= new String[100];
        String submatch[]= new String[100];
        boolean flag=false;
        int returned=0;
        String toanalyze="";
        Trimmer tr = new Trimmer();
        try
        {

            Datasearch ds = new Datasearch();
            
            int k=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                  mix[k]=str[i].concat(str[j]);
                  k++;
                }
            }
            System.out.println("The all combinations are");
            for(int i=0;i<k;i++)
            {
                System.out.println(mix[i]);
            }
            for(int i=0;i<k;i++)
            {
                toanalyze = mix[i];
                returned = ds.analyze(toanalyze);
                if(returned==1)
                {
                    System.out.println("The matched string is "+toanalyze);
                    flag=true;
                    break;
                }

            }

            if(flag==false)
            {
                toanalyze=null;
                submatch=tr.trim(mix);
                toanalyze=submatch[0];
                System.out.println("The matched string1 is "+toanalyze);
                flag=true;
            }
        }
        catch(Exception e){}
        if(flag==true)
        {
            return toanalyze;
        }
        else
        {
            return null;
        }
    }
}
