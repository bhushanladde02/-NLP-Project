
public class Max_Equater
{
    public String maxequater(String input[])
    {
        String max[]=new String[100];
        String min[]=new String[100];
        int j=0,i=0,k=0;
        boolean flag=false,flag1=false;
        max[0]="maximum";max[1]="highest";max[2]="top";max[3]="best";max[4]="peak";max[5]="peak";max[6]="biggest";
        min[0]="minumum";min[1]="lowest";min[2]="least";min[3]="worst";
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
                    break;
                }
            }
        }

        for(i=0;i<j;i++)
        {  // flag=false;
            for(k=0;k<3;k++)
            {
                if(input[i].equals(min[k]))
                {
                    flag1=true;
                    break;
                }
            }
        }

        if(flag==true)
        {
            return "max";

        }
        else if(flag1==true)
        {
            return "min";
        }
        else
        {
            return null;
        }
    }
}
