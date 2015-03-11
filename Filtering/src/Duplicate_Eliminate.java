/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
public class Duplicate_Eliminate
{
    public void duplicate(String arr1[],String arr2[]) throws Exception
    {
        int i=0,j=0,count=0;
         String added[] = new String[100];
         String elim[] = new String[100];

         while(arr1[i]!=null)
         {
             added[i]=arr1[i];
             i++;
         }
         while(arr2[i]!=null)
         {
             added[i]=arr2[j];
             i++;
             j++;
         }
    count=i;
    int count1=j;
    System.out.println("The added array is ");
    for(j=0;j<count;j++)
    {
        System.out.println(added[j]);
    }
    j=0;
    int k=0;
    for(i=0;i<count;i++)
    {   boolean flag=false;
        while(elim[j]!=null)
        {
            if(!added[i].equals(elim[j]))
            {
                flag=true;
            }
            j++;
        }
        if(flag==false)
        {
            elim[k]=added[i];
            k++;
        }

    }
    System.out.println("The union array is ");
            for(i=0;i<k;i++)
            {
                System.out.println(elim[i]);
            }
    }
}
