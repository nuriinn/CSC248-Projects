public class Book
{
    private String title;
    private String subject;
    private double price;
    private int quantity;
    
    //normal constructor
    public Book(String title, String subject, double price, int quantity){
        this.title=title;
        this.subject=subject;
        this.price=price;
        this.quantity=quantity;
        
    }
    
    //mutator
    public void setTitle(String title) {this.title=title;}
    public void setSubject(String subject) {this.subject=subject;}
    public void setPrice(double price) {this.price=price;}
    public void setQuantity(int quantity) {this.quantity=quantity;}
    
    //accessor
    public String getTitle() {return title;}
    public String getSubject() {return subject;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    
    //printer
    public String toString(){
        return("Title"+title+"\nSubject:"+subject+"\nPrice:"+price+"\nQuantity:"+quantity);
    }
    
    //processor - calculate tot price for each title
    public double calTotPrice(){
        double totPrice=0;
        totPrice = price * quantity;
        return totPrice;
    }
    
    public void updateQuantity(int q){
        this.quantity = this.quantity + q;
    }
}
