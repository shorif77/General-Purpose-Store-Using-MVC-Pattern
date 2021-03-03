/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoopassignment;

import static java.awt.Event.DELETE;
import static java.lang.System.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *7
 * @author bappy
 */
public class Database {
    
    Scanner sc = new Scanner(System.in);
    
  

    public static String url = "jdbc:derby://localhost:1527/AssDatabase";
    public static String password = "12345";

    Connection myconObj = null;
    Statement mystatObj = null;
    ResultSet myresObj = null;
    private String user;

    public boolean userLoginCheckDB(String email) {
        boolean chk = false;

        String query = "Select * from UserInformation Where " + "Email = " + "\'" + email + "\'";

        try {
            String user = null;

            myconObj = DriverManager.getConnection(url, user, password);
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);

            if (myresObj.next()) {
                chk = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chk;
    }
    
 
    

    public void userSignUpDB(String name, String pass, String email) {
        String query = "insert into UserInformation(Name, Password, Email)values(?,?,?)";

        try {
            String user = null;
            myconObj = DriverManager.getConnection(url, user, password);
            PreparedStatement st = myconObj.prepareStatement(query);

            st.setString(1, name);
            st.setString(2, pass);
            st.setString(3, email);

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void showProductsFromDB(String tableName ){
        
         String query = "Select * from "+tableName;
         
         
         int i=1;
         try {
             

            myconObj = DriverManager.getConnection(url, user, password);
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);
             System.out.println("--------------------------------------------");
            while(myresObj.next()){
                
              String id = myresObj.getString(1);
               String name = myresObj.getString(2);
               int price = myresObj.getInt(3);
               
         
                System.out.println(id+". "+name+"\t\t"+price+" tk");
                
                
                i++;
            }
            System.out.println("--------------------------------------------");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
         
    }
    
        public void GETPRODUCT(  String ID, int QUANTITY,int PRICE)  {
            
        String query = "insert into SELECTEDPRODUCT(  ID,QUANTITY,PRICE)values(?,?,?)";
        
        try {
            String user = null;
            myconObj = DriverManager.getConnection(url, user, password);
            PreparedStatement st = myconObj.prepareStatement(query);
             

            st.setString(1, ID);
         //  st.setString(2, NAME);
            st.setInt(2, QUANTITY);
            st.setInt(3, PRICE);
          
          st.executeUpdate();
        
           }
          
         catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
        
     
       public void get(String SELECTEDPRODUCT ){
        
         String query = "SELECT * FROM SELECTEDPRODUCT ";
         
         
         int i=1;
         try {
             

            myconObj = DriverManager.getConnection(url, user, password);
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);
             System.out.println("--------------------------------------------");
            while(myresObj.next()){
                
                String ID = myresObj.getString(1);
                //String NAME = myresObj.getString(2);
                 int QUANTITY = myresObj.getInt(2) ;
                int     PRICE = myresObj.getInt(3);
            
               
           
               
         System.out.println(ID+"\t\t"+ " \t\t"+QUANTITY+"\t\t"+PRICE+" tk");
               
                
                
                i++;
            }
            System.out.println("--------------------------------------------");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
         
    }
       
       public void totalamount(String SELECTEDPRODUCT) {
           
              int PRICE = 0;
         
               int j=1;
            try {
                String query2 = "Select SUM(PRICE) from SELECTEDPRODUCT";

            myconObj = DriverManager.getConnection(url, user, password);
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query2);
             
            while(myresObj.next()){
                
               PRICE = myresObj.getInt(1);  
                j++;
                System.out.println("PRICE:\t\t\t\t\t"+PRICE);
                
                                
                   if(PRICE> 100 && PRICE<500 ){
                    double DISCOUNT= (5*PRICE)/100;
                   System.out.println("DISCOUNT:5% \t\t\t"+DISCOUNT);
                   System.out.println("--------------------------------------------");
                   System.out.println("TOTAL PRICE:\t\t\t"+(PRICE-DISCOUNT));
                  }
                   
                   else if(PRICE>500 && PRICE<1000 ){
                    double DISCOUNT= (10*PRICE)/100;
                    System.out.println("DISCOUNT:10%\t\t\t"+DISCOUNT);
                    System.out.println("--------------------------------------------");
                    System.out.println("TOTAL PRICE:\t\t\t"+(PRICE-DISCOUNT));
                   }
                    else if(PRICE> 1000 && PRICE<2000 ){
                    double DISCOUNT= (15*PRICE)/100;
                    System.out.println("DISCOUNT:15%\t\t\t"+DISCOUNT);
                    System.out.println("--------------------------------------------");
                    System.out.println("TOTAL PRICE:\t\t\t"+(PRICE-DISCOUNT));
                    }
                    else if(PRICE> 2000 && PRICE<10000 ){
                    double DISCOUNT= (20*PRICE)/100;
                    System.out.println("DISCOUNT:20%\t\t\t"+DISCOUNT);
                    System.out.println("--------------------------------------------");
                    System.out.println("TOTAL PRICE:\t\t\t"+(PRICE-DISCOUNT));
                    }
                
                
            }
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
         
    }
         
               public void delete(String SELECTEDPRODUCT ) {
        
         String query = "DELETE FROM SELECTEDPRODUCT ";
         
         
         int i=1;
         try {
             

            myconObj = DriverManager.getConnection(url, user, password);
           PreparedStatement st = myconObj.prepareStatement(query);
            st.executeUpdate();
               
                i++;
            
            System.out.println("--------------------------------------------");
            }
            catch (SQLException e) {
            e.printStackTrace();
        }
         
    }
       
} 
        
       
    


