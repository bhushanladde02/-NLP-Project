
public class Key_Equator
{
    public String keyequate(String input[])
    {
        int j=0,i=0,k=0,toreturn=0;
        String value="";
        boolean flag=false,flag1=false;
        String[] high1=new String[100];
        String[] low1=new String[100];
        high1[0]="heigher"; high1[1]="greater"; high1[2]="larger"; high1[3]="more"; high1[4]="bigger"; high1[5]="superior";
        low1[0]="lower"; low1[1]="less"; low1[2]="smaller";low1[3]="shorter";low1[4]="inferior";low1[5]="fewer";
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
                    break;
                }
            }
        }

        for(i=0;i<j;i++)
        {  // flag=false;
            for(k=0;k<5;k++)
            {
                if(input[i].equals(low1[k]))
                {
                    flag1=true;
                    break;
                }
            }
        }
        if(flag==true)
        {
            return "greater";
        }
        else
        {
            return "lower";
        }
    }
}