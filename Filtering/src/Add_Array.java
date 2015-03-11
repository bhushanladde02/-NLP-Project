/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
import java.io.*;
public class Add_Array
{
    public String[] addarray(String fin1[],String fin2[])
    {
        String addedarray[]=new String[100];
        boolean flag=false;
        try
        {
          

        int i=0,j=0,cnt1=0,cnt2=0,l=0,n=0,m=0;

     /*   System.out.println("Enter the first array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<4;i++)
        {
            fin1[i]=br.readLine();
        }

         System.out.println("Enter the second array");
         for(i=0;i<4;i++)
        {
            fin2[i]=br.readLine();
        }*/
                  
                           i=0;
                           j=0;
          while(fin1[i]!=null)
          {
              i++;
          }
          while(fin2[j]!=null)
          {
              j++;
          }
                           for(cnt1=0;cnt1<i;cnt1++)
                           {    flag=false;
                               for(cnt2=0;cnt2<j;cnt2++)
                               {
                                   if(fin1[cnt1].equals(fin2[cnt2]))
                                   {
                                       flag=true;
                                       break;
                                   }
                               }
                           }
                           
           for(n=0;n<i;n++ )
           {
               addedarray[n]=fin1[n];
               
           }
           for(m=0;m<j;m++)
           {
               addedarray[n]=fin2[m];
               n++;

           }
             for(l=0;l<n;l++)
             {
                 System.out.println(addedarray[l]);
             }
    }catch(Exception e){}

            if(flag==false)
            {
                return addedarray;
            }
            else
            {
                return fin1;
            }
}
}