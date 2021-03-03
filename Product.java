
package aoopassignment;

/**
 *
 * @author bappy
 */
public class Product {
    private String item;
    private int price;

    private Database database = new Database();
    
    public void setName(String item) {
        this.item = item;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return item;
    }

    public int getPrice() {
        return price;
    }
    
    
    public void showProducts(String SELECTEDPRODUCT){
        database.showProductsFromDB(SELECTEDPRODUCT);
        
    }
//    public void TOTALORDER(String SELECTEDPRODUCT){
//        database.orderProducts(SELECTEDPRODUCT);
//        
//    }
//    
//    
//    
//    public void totalamount(){
//        
//        database.totalamount();
//    }
    

    

    
}
