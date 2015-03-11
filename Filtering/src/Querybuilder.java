
import java.io.*;
import java.util.ArrayList;

public class Querybuilder {

    public static void main(String args[]) throws Exception {
        try {
            String str1 = "";
            int i, ip = -1;
            //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList arr = new ArrayList();
            ArrayList touple = new ArrayList();
            //  ArrayList touple1 = new ArrayList();

            // String [][] touple=new String[100][100];
           /* String input[] = new String[100];

            System.out.println("enter the string::");
            for(i=0;i<4;i++)
            {
            input[i]=br.readLine();
            }
            String str2 = br.readLine();
            
            //System.out.println(f1.columns);
            while(arr.isEmpty())
            {
            ip++;
            str2=input[ip];
            arr=f2.SearchWords(str2);
            }
             */

            Datasearch f2 = new Datasearch();
            f2.starter();
            // System.out.println(f2.SearchWords(str2));
            // System.out.println("enter the second string::");
            //String str3 = br.readLine();
            // touple=f2.matform(input,arr);
            // System.out.println("In main method the array is  "+touple);

            //f2.Column_Search(touple1);
            // System.out.println("The final array is  ");

        } catch (Exception e) {
            //    System.out.println(e);
        }

    }
}
