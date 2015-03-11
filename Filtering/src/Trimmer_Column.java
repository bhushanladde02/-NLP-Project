
public class Trimmer_Column
{
     String submatch[]=new String[100];
    public String[] trim(String[] input)
    {
        String str,str1;
        int len,i=0,j=0;
        System.out.println("Got here ");
      //  Row_Analyzer row = new Row_Analyzer();
        Datasearch ds = new Datasearch();
        try{
        while(input[i]!=null)
        {

            str=input[i];


         len=str.length();
         //System.out.println("The substring is ");

         str1=str.substring(0, len-1);

         int returned=ds.getColumnNames1(str1);
         if(returned!=33)
         {
             submatch[j]=str1;
             j++;
         }
            i++;
      }}catch(Exception e){}


        i=0;
        try{
        while(input[i]!=null)
        {

            str=input[i];

         len=str.length();
         //System.out.println("The substring is ");

         str1=str.substring(0, len-2);
         int returned=ds.getColumnNames1(str1);
         if(returned!=33)
         {
             submatch[j]=str1;
             j++;
         }

         i++;
        }
        }catch(Exception e){}
        return submatch;
        }

}

