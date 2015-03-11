
import java.io.*;
public class check_trigger
{
    public static void main(String arg[])
    {
        String str;
        int returned=0;
       try  {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           str=br.readLine();
           check_numeric cn = new check_numeric();
            returned=cn.checknumeric(str);
            
            
    }catch(Exception e){}
        System.out.println("The value is  " +(returned));

}
}