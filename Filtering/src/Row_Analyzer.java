
import java.sql.*;
import java.util.*;
public class Row_Analyzer
{
    Connection con=null;
    ArrayList columns=new ArrayList();
    int numberOfColumns;
    public Row_Analyzer()
    {
        OpenDatabase();
        getColumnNames();
    }
    public void OpenDatabase()
        {
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
        }

    public void getColumnNames( )
    {
    try
    {
            Statement stm=con.createStatement();
            ResultSet rs =stm.executeQuery("select * from table3");

                if (rs == null)
                {
                       return ;
                }

            ResultSetMetaData rsMetaData = rs.getMetaData();
             numberOfColumns = rsMetaData.getColumnCount();


     }
    catch(Exception e){}
    }


    public int rowanalyze(String input)
    {
        boolean flag2=false;
        try
        {
          //  System.out.println("Row Analyze "+numberOfColumns);
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from table3");
            while(rs.next())
            {
                for(int i=1;i<numberOfColumns+1;i++)
                {
                    String str1= rs.getString(i);
                    if(str1.equals(input))
                    {
                         flag2=true;

                    }

                }
            }

        }
        catch(Exception e){}
        if(flag2==true)
        {
            return 1;

        }
        else
            return 0;
    }
}
