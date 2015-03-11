/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
import java.io.*;
public class Duplicate_Trigger
{
    public static void main(String arg[])
    {

        String[] fin1 = new String[100];
        String[] fin2 = new String[100];
        try
        {

        int i;
         System.out.println("Enter the first array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<3;i++)
        {
            fin1[i]=br.readLine();
        }
         System.out.println("Enter the second array");
         for(i=0;i<3;i++)
        {
            fin2[i]=br.readLine();
        }
        Duplicate_Eliminate de = new Duplicate_Eliminate();
         de.duplicate(fin1, fin2);
    }
        catch(Exception e){}
}
}