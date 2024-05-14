public class Book
{  
     //data members
     private String title;
     private double price; //200.00, 150.00, etc.
     private String subject; //CS, MATH, etc.
 
     //normal constructor
     public Book(String t, double p, String s) {
     this.title = t;
     this.price = p;
     this.subject = s;
     }
 
     //mutator@setter@storer
     public void setTitle(String t) { this.title = t; }
    public void setPrice(double p) { this.price = p; }
    public void setSubject(String s) { this.subject = s; }
 
     //accessor@getter@retriever
    public String getTitle() { return this.title; }
     public double getPrice() { return this.price; }
    public String getSubject() { return this.subject; }
 
     //printer
     public String toString() {
     return (""+ this.getSubject() +this.getTitle()+this.getPrice());
     } 
}
