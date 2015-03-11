
 import rita.wordnet.*;

import java.sql.*;
import java.util.*;

 public class Dict_Search
{
      Connection con=null;
      ArrayList columns =new ArrayList();
      String columns1[] = new String[100];
      int column_index=0,numberOfColumns;

     public Dict_Search()
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
            int i=0;
            Statement stm=con.createStatement();
            ResultSet rs =stm.executeQuery("select * from table3");

                if (rs == null)
                {
                       return ;
                }

            ResultSetMetaData rsMetaData = rs.getMetaData();
             numberOfColumns = rsMetaData.getColumnCount();

            // get the column names; column indexes start from 1
            for (i = 1; i < numberOfColumns + 1; i++)
            {
                String columnName = rsMetaData.getColumnName(i);
                // Get the name of the column's table name
                String tableName = rsMetaData.getTableName(i);
                // System.out.println("column name=" + columnName + " table=" + tableName + "");
                columns.add(columnName);
                columns1[i-1]=columnName;
                column_index++;

            }
    }
     catch(Exception e)
        {

        }
  }

    public String dictsearch (String input) //throws Exception
    {
          boolean flag=false;
          String name="";
       try
       {
           int j=0,i=0,k=0,index=0,index1;
           String column_name;
        
        RiWordnet wordnet = new RiWordnet();
	String poas =wordnet.getBestPos(input);
        String [] similar= wordnet.getAllSynonyms(input,poas);
        
       
            /*while(str!=null)
            {
                System.out.println(similar[i]);
                i++;
            }*/
        try
        {
            /*while(similar!=null)
            {
                index++;
                System.out.println(similar[index]);
            }*/
        }
        catch(Exception e){}
        /*for(i=0;i<5;i++)
        {
            System.out.println(similar[i]);
        }*/
            System.out.println(" The index value is  "+index);
            getColumnNames();
           try
           {
               System.out.println("The total columns are  "+numberOfColumns);
             while(j<numberOfColumns)
            {
                System.out.print(columns1[j]+",");
                j++;
            }
           }
           catch(Exception e){}

            for(k=0;k<index;k++)
            {
                for(j=0;j<numberOfColumns;j++)
                {

                    if(similar[k].equals(columns1[j]))
                    {
                        System.out.println("The similar is "+similar[k]+"& column name is "+columns1[j]);
                        flag=true;
                        name=columns1[j];
                        break;
                    }
                }
            }


        }
        catch(Exception e) {}
      
       if(flag==true)
            {
                return name;
            }
            else
            {
                return "notfound";
            }
       
       }
}
