
package aoopassignment;


public class Controller {

    View view = new View();
    User user = new User();
    Product product = new Product();

    public void run() {
        int choice = view.firstPage();

        switch (choice) {
            case 1:
                if (user.userLogin() == true) {
                    view.loginSuccessMsg();
                    this.optionPage();
                } else {
                    view.loginUnsuccessfulMsg();
                }
                break;
            case 2:
                user.userSignUp();
                view.signUpSuccessMsg();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                return;
        }
        this.run();
    }

    public void optionPage() {
        int choice = view.viewOptions();
            Product product = new Product();

        switch (choice) {
            case 1:
                this.categoryPage();
                break;
            case 2:
                this.Show();
                user.totalaccount();
                view.Comfirm();
                break;
            case 3:this.delete();
                System.exit(0);
                break;
            default:
                return;
        }
        this.optionPage();
    }
    
     public void Show() {
         user.Show();
      
         

     }
     public void delete(){
         view.delete();
     }
        
        

    public void categoryPage() {
        int choice = view.showCategories();

        switch (choice) {
            case 1: this.groceryPage();
                break;
            case 2:this.ElectronicsPage();
                break;
            case 3:this.SportsPage();
                break;
            case 4: this.CosmeticsPage();
                break;
            case 5:this.MiscellaneousPage();
                break;
            case 6:
                this.optionPage();
                break;
            default:
                return;
        }
        this.categoryPage();

    }
    
    public void groceryPage(){
        int choice = view.showGroceryItems();
        
        switch (choice) {
            case 1: 
                product.showProducts("SOYBEAN_OIL");
                view.orderMsg();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
           
            case 5:
                this.categoryPage();
                break;
            default:
                return;
        }
        this.groceryPage();

    
    }
    
    
     public void ElectronicsPage(){
        int choice = view.showElectronicsItems();
        
        switch (choice) {
            case 1: 
                product.showProducts("Light_bulbs");
                view.orderMsg();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
           
            case 5:
                  this.categoryPage();
                break;
            default:
                return;
        }
        //this.ElectronicsPage();

    

}
     
     public void SportsPage(){
        int choice = view.showSportsItems();
        
        switch (choice) {
            case 1: 
                product.showProducts("Bat");
                view.orderMsg();
                break;
            case 2:
                product.showProducts("Ball");
                view.orderMsg();
                break;
               
            case 3:
                product.showProducts("Stamp");
                view.orderMsg();
                break;
                
            case 4:
                product.showProducts("Football");
                view.orderMsg();
                break;
            case 5:
                 this.categoryPage();
                break;
            default:
                return;
        }
        
     
   
       
}
      public void CosmeticsPage(){
        int choice = view.showCosmeticsItem();
        
        switch (choice) {
            case 1: 
                product.showProducts("Eyeliner");
                view.orderMsg();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
           
            case 5:
                  this.categoryPage();
                break;
            default:
                return;
     
        }
      
      }
     
     
       

      public void MiscellaneousPage(){
        int choice = view.MiscellaneousItem();
        
        switch (choice) {
            case 1: 
                product.showProducts("Laptop");
                view.orderMsg();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
           
            case 5:
                 this.categoryPage();
                break;
            default:
                return;
     
           }
}
  
}