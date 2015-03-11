
public class Position_Checker
{
    public String positioncheck(String[] input,String comparer)
    {
        int j=0,i=0,k=0,toreturn=0,pos=0,retflag=0,retflag1=0;
        String reqcolumn=null;
        boolean flag=false,flag1=false;
        String[] high1=new String[100];
        String[] low1=new String[100];
        String[] column=new String[100];
        String[] submatch=new String[100];
        String[] ret=new String[100];
        String[] ret1=new String[100];

        high1[0]="heigher"; high1[1]="greater"; high1[2]="larger"; high1[3]="more"; high1[4]="bigger"; high1[5]="superior";
        low1[0]="lower"; low1[1]="less"; low1[2]="smaller";low1[3]="shorter";low1[4]="inferior";low1[5]="fewer";
        Datasearch ds = new Datasearch();
        Trimmer tr = new Trimmer();
        if(comparer.equals("greater"))
        {
                try{
            
                while(input[j]!=null)
                {
                    j++;
                }}catch(Exception e){}

                for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<5;k++)
                    {
                        if(input[i].equals(high1[k]))
                        {
                            flag=true;
                            pos=i;
                            break;
                        }
                    }
                }
                System.out.println("The position of greater is "+pos);
                column[0]=input[pos-1];
                column[1]=input[pos+1];
                Trimmer_Column trim = new Trimmer_Column();
                ret=trim.trim(column);
                if(ret[0]!=null)
                {
                    retflag=1;
                }
                
                for(i=0;i<=1;i++)
                {
                    if(ret[0]==null)
                    {
                    toreturn=ds.getColumnNames1(column[i]);
                     if(toreturn!=33)
                         {
                          flag1=true;
                          reqcolumn=column[i];
                          break;
                         }
                    }
                    else if(ret[0]!=null)
                    {
                        reqcolumn=ret[0];
                    }
                }

             /*   if(flag1==false)
                {
                    submatch=tr.trim(column);
                    reqcolumn=submatch[0];
                    flag1=true;
                }
                if(flag1==true)
                { */
                    //System.out.println("the required column is "+reqcolumn);
                    return reqcolumn;

                
            }

        else
        {
                try{
                j=0;
                while(input[j]!=null)
                {
                    j++;
                }}catch(Exception e){}

                for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<5;k++)
                    {
                        if(input[i].equals(low1[k]))
                        {
                            flag=true;
                            pos=i;
                            break;
                        }
                    }
                }
                System.out.println("The position of greater is "+pos);
                column[0]=input[pos-1];
                column[1]=input[pos+1];
                Trimmer_Column trim = new Trimmer_Column();
                 ret1=trim.trim(column);
                if(ret1[0]!=null)
                {
                    retflag1=1;
                }
                for(i=0;i<=1;i++)
                {
                    if(ret1[0]==null)
                    {
                    toreturn=ds.getColumnNames1(column[i]);
                     if(toreturn!=33)
                         {
                          flag1=true;
                          reqcolumn=column[i];
                          break;
                         }
                    }
                    else if(ret1[0]!=null)
                    {
                        reqcolumn=ret1[0];
                    }
                }

             /*   if(flag1==false)
                {
                    submatch=tr.trim(column);
                    reqcolumn=submatch[0];
                    flag1=true;
                }
                if(flag1==true)
                { */
                    //System.out.println("the required column is "+reqcolumn);
                    return reqcolumn;


        }
        }
}