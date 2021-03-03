
package aoopassignment;

import java.sql.SQLException;
import java.util.Scanner;


public class View {
    
     Product product = new Product();

    int choice;
    public static Scanner sc = new Scanner(System.in);

    public int firstPage() {
        System.out.println("\t\t****Welcome JGPS****");
        System.out.println("Select anyone from below:");
        System.out.println("1. Login\n"
                + "2. Sign Up\n"
                + "3. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        return choice;
      }

    public int viewOptions() {
        System.out.println("Select anyone from below:");
        System.out.println("1. Go to categories and select products\n"
                + "2. Order selected products\n"
                + "3. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;

    }
   
    public int showCategories() {
        System.out.println("Select any category ");
        System.out.println("1. Grocery Items\n"
                + "2. Electronics Items\n"
                + "3. Sports Items\n"
                + "4. Cosmetics\n"
                + "5. Miscellaneous\n"
                + "6. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
    }
    
    
    public int showGroceryItems(){
        
        System.out.println("Select any Grocery item:");
        System.out.println("1. Soybean Oil\n"
                + "2. Fish\n"
                + "3. Meat\n"
                + "4. Bakery\n"
                + "5. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
    }
    
    
       public int showElectronicsItems(){
        
        System.out.println("Select any Electronics item:");
        System.out.println("1. Light bulbs\n"
                + "2. Switch\n"
                + "3. fan\n"
                + "4. Ligth\n"
                + "5. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
    }
    
        
        
               public int showSportsItems(){
        
        System.out.println("Select any Sports item:");
        System.out.println("1. Cricket Bat\n"
                + "2. Ball\n"
                + "3. Stamps\n"
                + "4. Football\n"
                + "5. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
    }
               
               public int showCosmeticsItem(){
        
                   System.out.println("Select any Cosmetics item:");
        System.out.println("1. Eyeliner \n"
                + "2. brushes\n"
                + "3. nail polish\n"
                + "4. Fother make-up equipments\n"
                + "5. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
                   
               }
               
               public int MiscellaneousItem(){
        
                   System.out.println("Select any Miscellaneous item:");
        System.out.println("1. Laptop \n"
                + "2. Mobile\n"
                + "3. Computer\n"
                + "4. Others\n"
                + "5. Return to previous menu\n");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        return choice;
                   
               }
        
    

    public void loginSuccessMsg() {
        System.out.println("Login Successful!!!");
    }

    public void loginUnsuccessfulMsg() {
        System.out.println("Login Failed.!!!"
                + "You need to sign up first!!!");
    }

    public void signUpSuccessMsg() {
        System.out.println("Sign up successfull, you can login now!!");
    }
    
    public void orderMsg() {
        System.out.println("Select to order the product!!");
           User user = new User();
            user.GETPRODUCT();
           // user.totalaccount();
          
        
    }
    
    public void nameInputMsg(){
        
       
    }
    
     public void delete(){
          User user = new User();
         user.delete();
     }
     
    
    public void Comfirm(){
        
        System.out.println("Press 1 to confirm your order ");
         sc.nextLine();
          System.out.println("Press 0 to deselect items  ");
           sc.nextLine();
           
           
           
         String bkash, transaction,  address;
        System.out.println("Enter your bkash number: ");
        bkash = sc.nextLine();
       sc.nextLine();
        System.out.println("Enter your transaction: ");
       transaction = sc.nextLine();
        System.out.println("Enter your address: ");
         address= sc.nextLine();
        }
             
                
                
                
            }
        
    


