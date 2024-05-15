import java.text.DecimalFormat;
public class Book
{
   private String title;
   private double price;
   
   public Book(){}
   public Book (String title, double price){
       this.title= title;
       this.price = price;
   }
   
   public String getTitle() {return this.title= title;}
   public Double GetPrice() {return this.price = price;}
   
   public void setTitle(String title) {this.title= title;}
   public void setPrice(double price) {this.price = price;}
   
   public String toString(){
       DecimalFormat df = new DecimalFormat("0.00");
       String str = null;
       str = this.title + "\t" + df.format(this.price);
       return str;
   }
}