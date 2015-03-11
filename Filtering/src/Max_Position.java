
public class Max_Position
{
    public String maxpos(String input[],String str)
    {
          int j=0,i=0,k=0,toreturn=0,pos=0;
        String reqcolumn=null;
        boolean flag=false,flag1=false;
        String[] max=new String[100];
        String[] min=new String[100];
        String[] column=new String[100];
        String[] submatch=new String[100];
        max[0]="maximum";max[1]="highest";max[2]="top";max[3]="best";max[4]="peak";max[5]="peak";max[6]="biggest";
        min[0]="minumum";min[1]="lowest";min[2]="least";min[3]="worst";
        Datasearch ds = new Datasearch();
        Trimmer tr = new Trimmer();
        if(str.equals("max"))
        {
                try{

                while(input[j]!=null)
                {
                    j++;
                }}catch(Exception e){}

                for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<6;k++)
                    {
                        if(input[i].equals(max[k]))
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
                for(i=0;i<=1;i++)
                {
                    toreturn=ds.getColumnNames1(column[i]);
                    if(toreturn!=33)
                    {
                        flag1=true;
                        reqcolumn=column[i];
                        break;
                    }
                }


                if(flag1==true)
                {
                    //System.out.println("the required column is "+reqcolumn);
                    return reqcolumn;

                }
                else
                {
                    return "111";
                }
            }
        else
        {
            try{

                while(input[j]!=null)
                {
                    j++;
                }}catch(Exception e){}

                for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<3;k++)
                    {
                        if(input[i].equals(min[k]))
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
                for(i=0;i<=1;i++)
                {
                    toreturn=ds.getColumnNames1(column[i]);
                    if(toreturn!=33)
                    {
                        flag1=true;
                        reqcolumn=column[i];
                        break;
                    }
                }


                if(flag1==true)
                {
                    //System.out.println("the required column is "+reqcolumn);
                    return reqcolumn;

                }
                else
                {
                    return "111";
                }
        }

       }
   }

