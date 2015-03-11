

public class Trimmer
{
     String submatch[]=new String[100];
    public String[] trim(String[] input)
    {
        String str,str1;
        int len,i=0,j=0,numeric=0;
        System.out.println("Got here ");
        Row_Analyzer row = new Row_Analyzer();
        check_numeric cn = new check_numeric();
        try{
        while(input[i]!=null)
        {   
            try{
            numeric=cn.checknumeric(input[i]);
            }catch(Exception e){}
            if(numeric==0)
            {
                str=input[i];
        
        
                len=str.length();
         //System.out.println("The substring is ");

                    str1=str.substring(0, len-1);
                    int returned=row.rowanalyze(str1);
                    if(returned==1)
                    {
                        submatch[j]=str1;
                         j++;
                    }
                        
            }
            i++;
        }
        }catch(Exception e){}


                i=0;numeric=0;
                try{
                while(input[i]!=null)
                {
                    try{
                    numeric=cn.checknumeric(input[i]);
                    }catch(Exception e){}

                    if(numeric==0)
                    {
                    str=input[i];

                    len=str.length();
                //System.out.println("The substring is ");

                    str1=str.substring(0, len-2);
                    int returned=row.rowanalyze(str1);
                    if(returned==1)
                    {
                        submatch[j]=str1;
                        j++;
                    }

                     
                    }
                   
                   i++;
                    }
                }catch(Exception e){}
                     return submatch;
    }
}