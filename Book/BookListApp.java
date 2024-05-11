 import java.util.Scanner;
public class BookListApp
{
    //main method
    public static void menu(){
        System.out.println("\tMENU");
        System.out.println("---------------------------------");
        System.out.println("|    A   |       Add Book        |");
        System.out.println("|    T   |  Search Book (Title)  |");
        System.out.println("|    S   | Search Book (Subject) |");
        System.out.println("|    D   |      Display Books    |");
        System.out.println("|    R   |      Delete (Title)   |");
        System.out.println("|    Q   |     Update Quantity   |");
        System.out.println("|    P   |      Update Price     |");
        System.out.println("|    E   |          Exit         |");
        System.out.println("----------------------------------"  );
        System.out.println("\tEnter choice (A/T/S/D/R/Q/P/E) : ");
    }
    
    public static void addRecord (ArrayList list){
        
            Scanner in = new Scanner (System.in);
            Scanner inline = new Scanner (System.in);
        
            System.out.println("Add new record ? (Y/N) : ");
            String cont = in.next();
            if(cont.equalsIgnoreCase("Y"))
            {
                while(true){
                    System.out.println("Enter the following BOOK info  ");
                    System.out.println("\tTitle:");
                    String t = inline.nextLine().toUpperCase();
                    System.out.println("\tSubject: ");
                    String s   = inline.nextLine().toUpperCase();
                    System.out.println("\tPrice : RM ");
                    double p = in.nextDouble();
                    System.out.println("\tQuantity : ");
                    int q = in.nextInt();
                
                    Book book = new Book ( t, s , p , q ); //insantiate book object
                    list.add(book); // add book into ArrayList
                
                    System.out.println("\n More data ? ? (Y/N) : ");
                     String m = in.next();
                    if(m.equalsIgnoreCase("N"))
                        break;
            }
        }
    }
    
    public static Book searchByTitle(ArrayList list){
        Scanner in = new Scanner(System.in);
        System.out.println("\tEnter title : ");
        String t = in.nextLine();
        int indexFound = -1;
        Book bookFound = null;
        for(int x=0; x<list.size(); x++){
            Book b = (Book)list.get(x);
            if(t.equalsIgnoreCase(b.getTitle())){
                indexFound = x;
                break;
            }
        }
        bookFound = (Book) list.get(indexFound);
        return bookFound;
    }
        
    public static Book searchBySubject(ArrayList list){
        Scanner in = new Scanner(System.in);
        System.out.println("\tEnter subject : ");
        String s = in.nextLine();
        int indexFound = -1;
        Book bookFound = null;
        for(int i=0; i<list.size(); i++){
            Book b = (Book) list.get(i);
            if(s.equalsIgnoreCase(b.getSubject())){
                indexFound = i;
                break;
            }
        }
        bookFound = (Book)list.get(indexFound);
        return bookFound;
    }
    
    public static void displayAll(ArrayList list){
       for(int i=0; i<list.size(); i++){
           Book b = (Book) list.get(i);
           System.out.println(b.toString());
       }
       System.out.println();
    }
    
    public static Book deleteByTitle(ArrayList list){
        int indexFound = -1;
        Book bookFound = null;
        
        Scanner in = new Scanner(System.in);
        System.out.println("\tEnter title:");
        String t = in.nextLine();
        for(int x=0; x<list.size(); x++){
            Book b = (Book) list.get(x);
            if (t.equalsIgnoreCase(b.getTitle())){
                indexFound = x;
                break;
            }
        }
        bookFound = (Book) list.remove(indexFound); //remove book from the list
        return bookFound; //return the book that has been deleted from the list
    }
    
    public static void updateQuantity(ArrayList list){
        Scanner in = new Scanner (System.in);
        System.out.println("\tEnter title: ");
        String t = in.nextLine();
        int indexFound = -1;
        boolean isFound = false;
        for(int x=0; x<list.size(); x++){
            Book b = (Book) list.get(x);
            if(t.equalsIgnoreCase(b.getTitle())){
                indexFound = x;
                break;
            }
        }
        if (isFound){
            System.out.println("\nAdd new quantity : ");
            Scanner inInteger = new Scanner(System.in);
            int q = inInteger.nextInt();
            Book b = (Book) list.get(indexFound);
            b.updateQuantity(q);
        }
        else{
            System.out.println("No record found ! Update quantity process is aborted !" );
            System.out.println("Press [ENTER] to continue...");
            String cont = in.nextLine();
        }
    }
    
    public static void updatePrice(ArrayList list){
        Scanner in = new Scanner (System.in);
        System.out.println("\tEnter title: ");
        String t = in.nextLine();
        int indexFound = -1;
        boolean isFound = false;
        
        for(int x=0; x<list.size(); x++) {
            Book b = (Book)list.get(x);
            if (t.equalsIgnoreCase(b.getTitle())){
                indexFound = x;
                break;
            }
        }
        if (isFound){
            Scanner inPrice = new Scanner (System.in);
            System.out.println("\tEnter new price: RM:");
            double p = inPrice.nextDouble();
            Book b = (Book) list.get(indexFound);
            b.setPrice(p);
        }
        else{
            System.out.println("No record found ! Update quantity process is aborted !" );
            System.out.println("Press [ENTER] to continue...");
            String cont = in.nextLine();
        }
    }
    
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        ArrayList bookList = new ArrayList();
        
        while(true){
            menu();
            String choice = in.next();
            
            if (choice.equalsIgnoreCase("A")){
                addRecord(bookList);
            }
            else if (choice.equalsIgnoreCase("T")){
                Book b = searchByTitle(bookList);
                if (b == null) {
                    System.out.println("No record found!");
                }
                else {
                    System.out.println(b.toString());
                }
            }
            else if (choice.equalsIgnoreCase("S")){
                Book b = searchBySubject(bookList);
                if (b == null) {
                    System.out.println("No record found!");
                }
                else {
                    System.out.println(b.toString());
                }
                break;
            }
            else if (choice.equalsIgnoreCase("D")){
                displayAll(bookList);
            }
            else if (choice.equalsIgnoreCase("R")){
                deleteByTitle(bookList);
            }
            else if (choice.equalsIgnoreCase("Q")){
                updateQuantity(bookList);
            }
            else if (choice.equalsIgnoreCase("P")){
                updatePrice(bookList);
            }
            else{
                System.out.println("Invalid Key ! Enter choice once again");
                Scanner n = new Scanner(System.in);
                String nx = n.nextLine();
                System.out.println("\f");
            }
                
        }
        System.out.println("Bye");
    }
}

