import java.util.Scanner;
public class BookAppLL
{
    static Scanner in = new Scanner(System.in);
    static Scanner inDouble = new Scanner(System.in);
    
    public static void main(String [] args){
        LinkedList bookLL = new LinkedList ();
    }
    
    //Q1 -  Insert the data in LinkedList object named bookLL. (Do not use I/O method).
    public static void retrieveData(LinkedList list){
        
        list.addLast(new Book("DiscreteMAthematics" , 50.00 , "MATH"));
        list.addLast(new Book("Computer Organisation" , 90.00 , "CS"));
        list.addLast(new Book("Problem Solving using C++" , 110.00 , "CS"));
        list.addLast(new Book("Database Management" , 87.00 , "IS"));
        list.addLast(new Book("Operating System" , 50.00 , "CS"));
        list.addLast(new Book("Financial Accounting" , 45.00 , "ACC"));
        list.addLast(new Book("Data Structures" , 130.00 , "CS"));
        list.addLast(new Book("Organisational Behaviours" , 60.00 , "MKT"));
        list.addLast(new Book("Information System Development" , 89.00 , "IS"));
        list.addLast(new Book("Mobile Computing" , 89.00 , "IT"));
        list.addLast(new Book("Object Oriented Programming" , 100.00 , "CS"));
        list.addLast(new Book("Multimedia Computing" , 50.00 , "IT"));
        list.addLast(new Book("Calculus" , 60.00 , "MATH"));
        list.addLast(new Book("Linear Algebra" , 65.00 , "MATH"));
        
    }
    
    //print method
    public static void printAll(LinkedList list){
        System.out.println("\nList of book:");
        Book book = (Book) list.getFirst();
        while (book != null){
            System.out.println(book.toString());
            book = (Book) list.getNext();
        }
    }
    
    //Q2 -  Update the price of book by subject by giving discount (%) based on the user input. Display the price before 
    //and after the discount.
    public static void updatePriceBySubject(LinkedList list) {
        System.out.println("\n Question 2" );
        System.out.println("Enter subject code: ");
        String s = in.next();
        System.out.println("Enter the discount (e.g 10) : ");
        double d = in.nextDouble();
        
        Book book = (Book) list.getFirst();
        while(book != null) {
            if (book.getSubject().equalsIgnoreCase(s)) {
                System.out.println(book.getTitle() + "," + book.getSubject());
                System.out.println("\tPrice before: RM " +book.getPrice());
                double newPrice = book.getPrice() * (1-d/100);
                book.setPrice(newPrice);
                System.out.println("\tPrice after: RM " +book.getPrice());
            }
            book = (Book) list.getNext();
        }
    }
    
    //Q3 -  Calculate and the total price for book under specific subject entered by the user.
    public static void calcTotalPriceBySubject(LinkedList list) {
         System.out.println("\nQ3");
         
         double totalPrice = 0.00;
         System.out.println("Enter subject code:");
         String s = in.next();
         Book book = (Book) list.getFirst();
         while(book != null){
             if(book.getSubject().equalsIgnoreCase(s)) {
                 totalPrice = totalPrice + book.getPrice();
             }
             book = (Book) list.getNext();
         }
         System.out.println("Total price for "+s+ ",RM: " +totalPrice);
    }
    
    //Q4 - Display the information of the most expensive and the cheapest book under subject entered by the user.
    public static void displayMaxAndMinBySubject(LinkedList list) {
        System.out.println("\nQ4");
        
        System.out.println("Enter subject code: ");
        String s = in.next();
        
        Book book = (Book) list.getFirst();
        while(book != null) {
            if (book.getSubject().equalsIgnoreCase(s)) {
                break;
            }
            book = (Book) list.getNext();
        }
        
        Book mostExpensive = book;
        double expPrice = book.getPrice();
        Book cheapest = book;
        double chePrice = book.getPrice();
        
        while(book != null) {
            if (book.getSubject().equalsIgnoreCase(s)){
                if(book.getPrice() > expPrice){
                    mostExpensive = book;
                    expPrice = book.getPrice();
                }
                if(book.getPrice() < expPrice){
                    cheapest = book;
                    chePrice = book.getPrice();
                }
            }
            book = (Book) list.getNext();
        }
        System.out.println("The most expensive book : ");
        System.out.println(mostExpensive.toString());
        System.out.println("The cheapest book : ");
        System.out.println(cheapest.toString());
        
    }
    
    //Q5 - Display the information of book based on the subject entered by the user
    public static void displayInfoBySubject(LinkedList list) {
        System.out.println("\nQ5");
        
        System.out.println("Enter by subject: ");
        String s = in.next();

            Book book = (Book) list.getFirst();
            while(book != null){
                if (book.getSubject().equalsIgnoreCase(s)) {
                System.out.println(book.toString());
            }
        }
    }
    
    //Q6 -  Display the information of book based on the title entered by the user.
       public static void displayInfoByTitle(LinkedList list) {
        System.out.println("\nQ5");
        
        System.out.println("Enter by title: ");
        String s = in.next();

            Book book = (Book) list.getFirst();
            while(book != null){
                if (book.getTitle().equalsIgnoreCase(s)) {
                System.out.println(book.toString());
            }
        }
    }
    
    //Q7 -  Display the first and the last book in the database
    public static void displayFirstAndLastBooks(LinkedList list) {
        System.out.println("\nQuestion 7");
        
        if (list.isEmpty()) {
            System.out.println("First book in the database:");
            System.out.println(list.getFirst().toString());

            System.out.println("Last book in the database:");
            System.out.println(list.getLast().toString());
        } else {
            System.out.println("The database is empty.");
        
        }
    }
}
