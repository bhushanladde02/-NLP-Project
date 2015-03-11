
public class exclude
{
    public String[] ex(String input[],String key)
    {
        int i=0,k=0;
        String[] final1=new String[100];

        while(input[i]!=null)
        {
            if(!input[i].equals(key))
            {
                final1[k]=input[i];
                k++;
            }
            i++;
        }
        return final1;

    }

 }
