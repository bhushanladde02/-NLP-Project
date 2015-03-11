
public class equalto
{
    public int equal(String beforeinput[])
    {
        int i=0,value=0;
        try{
        while(beforeinput[i]!=null)
        {
            if(beforeinput[i].equals("equal"))
            {
                if(beforeinput[i+1].equals("to"))
                {
                   check_numeric ck = new check_numeric();
                   value=ck.checknumeric(beforeinput[i+2]);

                }
            }
            i++;
        }}catch(Exception e){}
        return value;
    }

    public int colcheckgreater(String beforeinput[])
    {
        String[] high1=new String[100];
         high1[0]="heigher"; high1[1]="greater"; high1[2]="larger"; high1[3]="more"; high1[4]="bigger"; high1[5]="superior";
        int i=0,j=0,k=0,pos=0;
        boolean flag=false;
        for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<5;k++)
                    {
                        if(beforeinput[i].equals(high1[k]))
                        {
                            flag=true;
                            pos=i;
                            break;
                        }
                    }
                }
        if(flag==true)
            return 1;
        else
            return 0;
    }

    public int colchecklower(String beforeinput[])
    {
        String[] low1=new String[100];
        low1[0]="lower"; low1[1]="less"; low1[2]="smaller";low1[3]="shorter";low1[4]="inferior";low1[5]="fewer";

        int i=0,j=0,k=0,pos=0;
        boolean flag=false;
        for(i=0;i<j;i++)
                {  // flag=false;
                    for(k=0;k<5;k++)
                    {
                        if(beforeinput[i].equals(low1[k]))
                        {
                            flag=true;
                            pos=i;
                            break;
                        }
                    }
                }
        String colname=beforeinput[pos-1];
        if(flag==true)
             return 1;
        else
             return 0;
    }
}
