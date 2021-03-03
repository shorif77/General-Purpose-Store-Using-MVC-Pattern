
package aoopassignment;

import static aoopassignment.View.sc;
import java.sql.SQLException;
import java.util.Scanner;
import org.omg.CORBA.PUBLIC_MEMBER;


public class User {
    private String name;
    private String password;
    private String email;
    
    private View view = new View();
    
    private Scanner sc = new Scanner(System.in);

    private Database database = new Database();
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean userLogin(){
        boolean check = false;
           String name,email, password;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        

        System.out.println("Enter your email: ");
        email = sc.nextLine();
        System.out.println("Enter your password: ");
        password = sc.nextLine();
        
        view.nameInputMsg();
        if(database.userLoginCheckDB(email)==true)check=true;
        
        return check;
    }
    
       public void userSignUp(){
        String nm, pass, email2;

        System.out.println("Enter your name: ");
        nm = sc.nextLine();
        System.out.println("Enter your password: ");
        pass = sc.nextLine();
        System.out.println("Enter your email: ");
        email2 = sc.nextLine();
        database.userSignUpDB(nm, pass, email2);
    }
       
            
       public void GETPRODUCT() {
           
           String  ID;
           int QUANTITY  ;
           int PRICE = 0 ;

        System.out.println("Enter your Product ID: ");
        ID = sc.nextLine();
        System.out.println("Enter your product Quentity: ");
       QUANTITY = sc.nextInt();
       System.out.println("Enter The PRICE of single product: ");
       PRICE = sc.nextInt();
       PRICE = QUANTITY*PRICE;
       
        database.GETPRODUCT(ID, QUANTITY, PRICE);
             
              }
       
         public void Show(){
     
            database.get(password);
       }
          
       public void totalaccount(){
     
            database.totalamount(password);
       }
       
       public void delete(){
           database.delete(password);
       }
       
       
  
       }
       
       
       
        
       
       

