import java.sql.*;
public class Max_Calculate
{

    static Connection con=null;
     public int maxcal(String colname) throws SQLException
        {
            //String colname="age";
            try
            {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:try1");
            }
            catch(ClassNotFoundException e)
            {
                System.out.println("Error : "+e);
            }
            catch(SQLException e)
            {
                System.out.println("Error : "+e);
            }
               
        int i=0;
        String arr[]=new String[100];
         Integer arr1[]=new Integer[100];
         Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select "+colname+" from table3");
                                                  
                 while(rs.next())
                  {
                    arr[i]=rs.getString(colname);
                   // System.out.println(arr[i]+" ");
                    i++;
                  }

        int hold=0;i=0;
        while(arr[i]!=null)
        {
            arr1[i]=Integer.parseInt(arr[i]);
            i++;

        }
        for(i=0;arr[i]!=null;i++)
        {
            if(arr1[i]>hold)
            {
                hold=arr1[i];
            }
        }
      //  System.out.println("The maxumum value is "+hold);
        return hold;
       
     }

}

