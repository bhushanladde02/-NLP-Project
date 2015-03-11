
import java.sql.*;
import java.util.*;
import java.lang.String.*;
import java.io.*;

public class Datasearch
{
    Connection con=null;
    ArrayList columns =new ArrayList();
    ArrayList ar1=new ArrayList();
    static int index=0;
    static int count = 0,iplength=0,final_index=0,final_index1=0;
    int i=0,checkerbit=0,dustcount=0,column=0,errorflag=0;
     String input[] = new String[100];
     String input1[] = new String[100];
     String[] dustbin=new String[100];
      String[] column_str=new String[100];
      String[] concated= new String [100];
      String[] ret_columns= new String [100];
      String[] finalcolumns= new String [100];
      String[] beforeinput =new String[100];
      String[] final_str2=new String[100];
      String[] final_str3=new String[100];
      String[] final_str4=new String[100];
      String[] foundarr=new String[100];
      String[] foundarr1=new String[100];
      String[] resultmat=new String[100];
      String errorstring=null,answerfound=null,answernotfound=null;


   // ArrayList arr=new ArrayList();

    public Datasearch()
    {
        OpenDatabase();
        getColumnNames();
    }
    public void dispose()
    {
        CloseDatabase();
    }
    public void CloseDatabase()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
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
            int numberOfColumns = rsMetaData.getColumnCount();

            // get the column names; column indexes start from 1
            for (i = 1; i < numberOfColumns + 1; i++)
            {
                String columnName = rsMetaData.getColumnName(i);
                // Get the name of the column's table name
                String tableName = rsMetaData.getTableName(i);
                // System.out.println("column name=" + columnName + " table=" + tableName + "");
                columns.add(columnName);
            }

            //System.out.println("The column names are");
     }
     catch(Exception e)
        {

        }
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

    public int getColumnNames1(String column_name)
    {
    try
    {
            boolean flag=false;
            boolean flag1=false;
            Statement stm=con.createStatement();
            ResultSet rs =stm.executeQuery("select * from table3");

                if (rs == null)
                {
                      flag=true;
                }

            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();

            // get the column names; column indexes start from 1
            for (i = 1; i < numberOfColumns + 1; i++)
            {
                if(column_name.equals(rsMetaData.getColumnName(i)))
                {
                    flag1=true;
                    break;
                }
                // Get the name of the column's table name
                //String tableName = rsMetaData.getTableName(i);
                // System.out.println("column name=" + columnName + " table=" + tableName + "");
               // columns.add(columnName);
            }
            if(flag1==true)
            {
                return i;
            }
            else
            {
                return 33;
            }




            //System.out.println("The column names are");
     }
     catch(Exception e)
        {

        }
     return i;
  }

    public int analyze(String input)
    {
        boolean flag2=false;
        try
        {
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from table3");
            while(rs.next())
            {   
                for(i=1;i<columns.size()+1;i++)
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
    public void starter(String Input_Data)
    {

        ArrayList arr1 = new ArrayList();
        int ip=-1,col_num,fin=0,flagbit=0,con1=0;
        String str2,inputdata1;
        String[] final_str=new String[100];
        String[] final_str1=new String[100];
        
        
        String[] trimmed=new String[100];
        String[] rowinput=new String[100];
        String[] trimmedc=new String[100];
       // String[] concated=new String[100];
        String afterconcat;
       // String[] column_str=new String[100];
        Add_Array ar = new Add_Array();
        ReadEmail re = new ReadEmail();
       // String Input_Data;

        try
        {
          // Input_Data= re.processEmail();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Concat cat = new Concat();
         //  System.out.println("enter the string::");
         //  Input_Data=br.readLine();
           // Input_Data=inputdata1.toUpperCase();
            Tokenizer tk = new Tokenizer();
            beforeinput=tk.token(Input_Data);
           /* try{
            afterconcat=cat.con(input);
            
            if(!afterconcat.equals(null))
            {
                concated[con1]=afterconcat;
                con1++;
            }
            }catch(Exception e){}
            System.out.println("The concated array found is");
            for(int k=0;k<con1;k++)
            {
                System.out.println(concated[k]);
            }*/
            Trimmer tr = new Trimmer();
            trimmed= tr.trim(beforeinput);
            rowinput=ar.addarray(beforeinput,trimmed);

            Trimmer_Column tc = new Trimmer_Column();
            trimmedc=tc.trim(rowinput);
            input=ar.addarray(rowinput,trimmedc);

              while(input[iplength]!=null)
            {
                iplength++;
            }

            System.out.println("--------------------------------------------------------") ;

            System.out.println("The input length is  "+iplength);

            try{
            afterconcat=cat.con(input,iplength);

            if(!afterconcat.equals(null))
            {
                concated[con1]=afterconcat;
                con1++;
            }
            }catch(Exception e){}

            System.out.println("--------------------------------------------------------") ;

            System.out.println("The concated array found is");
            for(int k=0;k<con1;k++)
            {
                System.out.println(concated[k]);
            }

            System.out.println("--------------------------------------------------------") ;

            System.out.println("The string returned from tokenizer is");
            for(i=0;i<iplength;i++)
            {
            //    input[i]=br.readLine();
                System.out.println(input[i]);
            }
            
           //Analyser an = new Analyser();
            int k=0;
           for(int l=0;l<iplength;l++)
           {
                flagbit=0;
                flagbit=analyze(input[l]);
                System.out.println("--------------------------------------------------------") ;
                System.out.println("The flag bit value is  "+flagbit);
                if(flagbit==1)
                {
                    input1[k]=input[l];
                    k++;
                }
                else
                {
                    final_str[fin]=input[l];
                    fin++;
                }
           }

            int j=0;
           while(input1[j]!=null)
           {
               j++;
           }
           System.out.println("--------------------------------------------------------") ;
           System.out.println("Analyzer output is ->  ");
           for(i=0;i<j;i++)
           {
               System.out.println(input1[i]);
               final_index++;
           }
            for(int l=0;l<iplength;l++)
            {
                col_num= getColumnNames1(input[l]);
                if(col_num!=33)
                {
                    column_str[column]=input[l];
                    column++;
            System.out.println("--------------------------------------------------------") ;
                }
              /*  else
                {
                    final_str[fin]=input[l];
                    fin++;
                } */
            }
           System.out.println("The dust string is ->");
           for(i=0;i<fin;i++)
           {
               System.out.println(final_str[i]);
           }

           System.out.println("--------------------------------------------------------") ;

            System.out.println("The column string is ->");
           for(i=0;i<column;i++)
           {
               System.out.println(column_str[i]);
           }

            k=0;
            Dict_Search ds = new Dict_Search();
            for(j=0;j<iplength;j++)
            {
                String returned = ds.dictsearch(input[j]);
                if(!returned.equals("notfound"))
                {
                    ret_columns[k]=returned;
                    k++;
                }
            }
            
            System.out.println("--------------------------------------------------------") ;
            System.out.println("The returned similar words are ");

            for(j=0;j<k;j++)
            {
                System.out.println(ret_columns[j]);
            }
           
            
            finalcolumns=ar.addarray(column_str,ret_columns);


            int dust=0;
            while(final_str[dust]!=null)
                {   //System.out.println("The dust string is  "+final_str[dustindex]);
                    

                    dust++;
                }
                column=0;
            for(int l=0;l<dust;l++)
            {
                col_num= getColumnNames1(final_str[l]);
                if(col_num==33)
                {
                    dustbin[column]=final_str[l];
                    column++;

                }
              /*  else
                {
                    final_str[fin]=input[l];
                    fin++;
                } */
            }

                System.out.println("--------------------------------------------------------") ;

                    k=0;
            System.out.println("The dustbin array is ");
            for(k=0;k<column;k++)
            {
                System.out.println(dustbin[k]);
            }
            dustcount=column;
            k=0;
                    
            /*while(input1[k]!=null)
            {
                final_str1[k]=input1[k];
                k++;
            }
                    
            j=0;
            while(finalcolumns[j]!=null)
            {
                final_str1[k]=finalcolumns[j];
                k++;
                j++;
            }*/
            final_str1=ar.addarray(input1, finalcolumns);
            System.out.println("The final columns are ");
            System.out.println("--------------------------------------------------------") ;
            for(int l=0;l<j;l++)
            {
                System.out.println(finalcolumns[l]);
            }

            System.out.println("--------------------------------------------------------") ;

              System.out.println("The final string is ->");
           for(i=0;i<k;i++)
           {
               System.out.println(final_str1[i]);
               
           }
              //Add_Array ar = new Add_Array();
               k=0;
              final_str2=ar.addarray(input1, concated);
              while(final_str2[k]!=null)
            {
                
                k++;
                
            }
            final_index1=k;
              System.out.println("--------------------------------------------------------") ;

              System.out.println("The output must be......");
              for(j=0;j<k;j++)
              {
                  System.out.println(final_str2[j]);
              }
              Add_Array adar = new Add_Array();
            foundarr= adar.addarray(column_str,concated);
            foundarr1= adar.addarray(foundarr,input1);
            while(arr1.isEmpty())
            {
                ip++;
            str2=final_str2[ip];
            arr1=SearchWords(str2);
            }
            matform(final_str2,arr1);
        }
        catch(Exception e){}
    }

    public ArrayList SearchWords(String str)
    {
          String returned_value="";
          int returned_value1=0;
          String column_value=null;
          ArrayList ar=new ArrayList();
          Keyword_Checker kc = new Keyword_Checker();
          Position_Checker pc = new Position_Checker();
          Max_Equater me = new Max_Equater();
          Max_Position mp = new Max_Position();
          ResultSet rs = null;
          int rsindex=0;
            try
            {   Statement stm=con.createStatement();
                Key_Equator ke = new Key_Equator();
                String maxcheck=me.maxequater(beforeinput);
            //    String maxcolumn=mp.maxpos(beforeinput);
                String comparer=ke.keyequate(beforeinput);
                returned_value=kc.keywordcheck(beforeinput,comparer);
                returned_value1=Integer.parseInt(returned_value);
                if(!returned_value.equals("111"))
                {
                    column_value = pc.positioncheck(beforeinput,comparer);
                    System.out.println("The column value is "+column_value);

                    if(column_value!=null)
                    {
                    // rs=stm.executeQuery("select * from table3");
                        if(comparer.equals("greater"))
                           {
                            exclude ex = new exclude();
                            int p=0;
                            while(final_str2[p]!=null)
                            {
                              final_str4[p]=final_str2[p];
                              p++;
                            }



                            final_str2= ex.ex(final_str4,returned_value);
                            
                             rs=stm.executeQuery("select * FROM table3 WHERE "+column_value+">"+returned_value1);
                            
                             while(rs.next())
                              {
                               System.out.println("The rs index is "+rsindex++);
                                for(i=1;i<columns.size()+1;i++)
                                  {
                                    String str1= rs.getString(i);
                                     ar.add(str1);
                                  }
                               }

                              
                          return ar;
                           }
                         else if(comparer.equals("lower"))
                           {
                             exclude ex = new exclude();
                            int p=0;
                            while(final_str2[p]!=null)
                            {
                              final_str4[p]=final_str2[p];
                              p++;
                            }



                            final_str2= ex.ex(final_str4,returned_value);
                           
                              rs=stm.executeQuery("select * FROM table3 WHERE "+column_value+"<"+returned_value1);
                            
                                   while(rs.next())
                                     {
                                  System.out.println("The rs index is "+rsindex++);
                                     for(i=1;i<columns.size()+1;i++)
                                        {
                                       String str1= rs.getString(i);
                                       ar.add(str1);
                                        }
                                     }
                             return ar;
                            }
                    }
                }
                   /*  else if(!maxcheck.equals("111"))
                    {
                        maxcolumn=mp.maxpos(beforeinput,maxcheck);
                      if(maxcolumn.equals("max"))
                        {
                        rs=stm.executeQuery("SELECT *,MAX("+maxcolumn+") FROM table3");
                        }
                      else
                        {
                        rs=stm.executeQuery("SELECT *,MIN("+maxcolumn+") FROM table3");
                        }

                        while(rs.next())
                     {
                     System.out.println("The rs index is "+rsindex++);
                        for(i=1;i<columns.size()+1;i++)
                        {
                            String str1= rs.getString(i);
                            ar.add(str1);
                        }
                     }
                     return ar;
                    }
                     else
                    /* while(rs.next())
                     {
                     System.out.println("The rs index is "+rsindex++);
                        for(i=1;i<columns.size()+1;i++)
                        {
                            String str1= rs.getString(i);
                            ar.add(str1);
                        }
                     }
                     return ar;*/
                
                else
                
                    //rs=stm.executeQuery("select * FROM table3 WHERE "+column_value+">"+returned_value1);
                    rs=stm.executeQuery("select * from table3");
                
                // String lstr="";
                    
                 while(rs.next())
                  {
                    
                        for(i=1;i<columns.size()+1;i++)
                        {
                            String str1= rs.getString(i);
                            ar.add(str1);
                        }
                       boolean flag=false;

                        for(int j=0;j<columns.size();j++)
                        {
                            if(((String)ar.get(j)).equals(str)==true)
                            {
                                flag=true;
                            }
                        }

                      if(flag==true)
                      {
                        ar1.addAll(ar);
                      }

                        ar.clear();
                }
             }

            catch(Exception e)
            {
            }
         // System.out.println("The array for greater than is  "+ar1);
          if(ar1.isEmpty())
          {
              System.out.println("**** ERROR ****");
              System.out.println(" DATA NOT FOUND IN THE DATABASE ");
              errorstring="**** ERROR :-  DATA NOT FOUND IN THE DATABASE";
              resultmat[0]=errorstring;
              return null;
          }
          else
          {
                  return ar1;
          }


     }

    public void Temp_Hold(ArrayList temp)
    {
        //return temp;
        Column_Search(temp);
    }

    public void matform(String str[],ArrayList arr)
    {

        int n = columns.size();
        int m=arr.size()/n;
        int k=0,arrsize=0;
        String comp,tempo;
        boolean flag=false,flag1=false;
        ArrayList ar = new ArrayList();
        ArrayList ar2 = new ArrayList();
        ArrayList ar3 = new ArrayList();
       ArrayList ar4 = new ArrayList();
       ArrayList ar5 = new ArrayList();
       int just=0;
        int cnt=1;


        comp=str[index];
        if(comp!=null)
        { just=1;

        System.out.println("comparison string "+comp);
        System.out.println("index value "+index);

        System.out.println("The array "+cnt+" is "+arr);
        cnt++;
        System.out.println("in the matrix method");
        String [][] mat=new String[m][n];
        try
        {
            for(i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=(String) arr.get(k);
                    k++;
                }
            }

            for(i=0;i<m;i++)
            {
                System.out.print("\t");
                for(int j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
             

            for(i=0;i<m;i++)
            {
                   for(int j=0;j<n;j++)
                    {
                      comp = mat[i][j];
                         ar.add(comp);

                    }
                     flag=false;
                       for(int j=0;j<n;j++)
                      {
                           if(((String)ar.get(j)).equals(str[index])==true)
                         {
                             flag=true;
                             flag1=true;
                         }
                      }

                   if(flag==true)
                      {
                        ar2.addAll(ar);
                      
                      }


                        ar.clear();
                        ar3.addAll(ar2);
                        ar2.clear();
                      
                 
            }
            if(flag1==false)
            {
                System.out.println("The result is not found for "+str[index]);
            }
            index++;
            //System.out.println(ar2);
            count++;
           // if(ar3.size()>(n+1))
            /*if(ar3.isEmpty())
            {
              //  System.out.println("condition");
                ar3.addAll(arr);
            }*/
                System.out.println("array size= "+ar3.size());

            //if(ar3.size()>n)
                if(count<final_index1)

            {
                System.out.println("in if condition");
                
                
                matform(str,ar3);
                //return ar3;
            }
            else
            {
                    System.out.println("The final array is "+ar3);
                    Temp_Hold(ar3);
                  //  return ar3;
                    //arrsize=ar3.size();
            }
               

            }
        catch(Exception e)
        {

        }
        }
        if(just==0)
        {
            Temp_Hold(arr);
        }
        //System.out.println("The final array is"+ar3);
       // System.out.println("I am returning the array  "+ar3);
      //  System.out.println("Statement printed");
       // return ar3;
       /* for(i=0;i<arrsize;i++)
        {
            tempo=(String)ar3.get(i);
          //  System.out.print(tempo);
            ar4.add(tempo);
        }
        System.out.println(ar4);
        if(!ar4.isEmpty())
            return ar4;
        else
            return ar4;
        * */

    }

    public void Column_Search(ArrayList touple)
    {
        int n = columns.size();
        int m=touple.size()/n;
        int k=0,col_num1=0,col_num=33;
        String hold="";
        int y=0,whoflag=0;
        System.out.println("I got the arraylist as  "+touple);

        String [][] matrix=new String[m][n];

        for(i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=(String) touple.get(k);
                    k++;
                }
            }
        
        if(touple.isEmpty())
        {
            System.out.println(" ***** NO RESULT FOUND *****  ");
        }
        else
        {

        System.out.println("In this column search method the matrix is");
        System.out.println("-------------------------------------------------)");
        System.out.println("  ******* THE FINAL OUTPUT *******   ");
        System.out.println("-------------------------------------------------)");
        for(i=0;i<m;i++)
            {
                System.out.print("\t");
                for(int j=0;j<n;j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Total result -> "+m);
                //System.out.println("The third input is" +input[2]);
              System.out.println("the first column is "+finalcolumns[0]);
              k=0;
                    while(beforeinput[k]!=null)
                    {
                        if(beforeinput[k].equals("who"))
                        {
                            whoflag=1;
                            break;
                        }
                        k++;
                    }
              column=column+2;
                for(int l=0;l<column;l++)
                {
                    hold=finalcolumns[l];
                    if(whoflag==1)
                    {
                        hold="name";
                    }
                   
                    col_num=getColumnNames1(hold);
                    
                    if(col_num!=33)
                    {   // System.out.println("The column index is  "+col_num);
                      col_num1=col_num;
                      //break;
                    }
                            
                 //if(col_num1!=0)
                 
              //  System.out.println("The column index is  "+col_num1);

                for(int j=0;j<m;j++)
                {
                    if(hold!=null )
                    {
                     System.out.println(" The final result for "+hold+" is -> " +matrix[j][col_num1-1]);
                     //resultmat[y]=matrix[j][col_num1-1];
                     
                        resultmat[y]="  "+hold+" is -> " +matrix[j][col_num1-1]+"\n";
                     
                     y++;


                    }
                }
               
            }
        }
        System.out.println("The above Result is not found for -> ");
        System.out.print(" [ ");
        String tempans=null;
        for(int j=0;j<dustcount;j++)
        {
            System.out.print(dustbin[j]+",");
            answernotfound=dustbin[j]+","+tempans;
            tempans=answernotfound;
        }
         System.out.print(" ] ");

         System.out.println(" \n The above Result is found for -> ");
        System.out.print(" [ ");
        k=0; tempans=null;
        while(foundarr1[k]!=null)
        {
            System.out.print(foundarr1[k]+",");
            answerfound=foundarr1[k]+","+tempans;
            tempans=answerfound;
            k++;
        }
       
         System.out.println(" ] ");
    } 
}