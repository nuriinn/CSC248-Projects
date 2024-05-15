import java.util.*;
public class QueueBookApp
{
    public static void enterRecord(Queue bookList){
        Scanner inLine = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        
        System.out.println();
        System.out.println("Enter book's title: ");
        String title = inLine.nextLine();
        System.out.println("Enter book's price : ");
        double price = in.nextDouble();
        
        Book book = new Book(title, price);
        bookList.enqueue(book);
        
        System.out.println("More record (Y/N) : ");
        String c = in.next();
        if(c.charAt(0) == 'Y' || c.charAt(0) == 'y')
            enterRecord(bookList);
    }
    
    public static void displayRecord(Queue bookList){
        Queue tempQ = new Queue();
        System.out.println("\nDISPLAY ALL RECORDS");
        Book data = (Book) bookList.dequeue();
        System.out.println("Book title \t Price (RM))");
        while(data!=null){
            System.out.println(data.toString());
            tempQ.enqueue(data);
            data = (Book) bookList.dequeue();
        }
        
        //in Queue we will remove data permanently so tempQ is where we store it for a while since we dont want to delete it yet
        while(!tempQ.isEmpty()){
            bookList.enqueue(tempQ.dequeue());
        }
        // effient way to write:
        //bookList = tempQ
    } 
    
    public static void searchRecord(Queue bookList){
        Queue temp = new Queue();
        Scanner inLine = new Scanner (System.in);
        System.out.println("Enter keyword: ");
        String keyword = inLine.nextLine();
        int count = 0; 
        System.out.println();
        
        while(! bookList.isEmpty()){
            Book data = (Book) bookList.dequeue();
            String title = data.getTitle();
            int sizeKeyword = keyword.length();
            
            String word = "(?i).*" +keyword+ ".*";
            
            if(title.matches(word)){
                System.out.println(data.toString());
                count++;
            }
            temp.enqueue(data);
        }
        
        System.out.print(count);
        if(count > 1)
            System.out.print( "records");
        else 
            System.out.println( "record");
        System.out.println( "matched.");
        
        while(!temp.isEmpty()){
            bookList.enqueue(temp.dequeue());
        }
    }
    
    public static void main (String [] args){
        Queue bookList = new Queue();
        Scanner in = new Scanner (System.in);
        
        boolean isCont = false;
        while (isCont){
            System.out.println("===================================================");
            System.out.println("\n\tMENU");
            System.out.println("---------------------------------------------");
            System.out.println("[N] ENTER NEW RECORD ");
            System.out.println("[P] DISPLAY ALL RECORDS ");
            System.out.println("[S] SEARCH RECORD ");
            System.out.println("[X] EXIT ");
            System.out.println("===================================================");
            
            System.out.print("Enter choice: ");
            String opt = in.next();
            
            if(opt.charAt(0) == 'N' || opt.charAt(0) == 'n'){  // FOR CHAR !!(opt.toUpperCase.charAt(0) == 'N')
                enterRecord(bookList);
            }
            else if (opt.charAt(0) == 'P' || opt.charAt(0) == 'p'){
                displayRecord(bookList);
            }
            else if (opt.charAt(0) == 'S' || opt.charAt(0) == 's'){
                searchRecord(bookList);
            }
            else if (opt.charAt(0) == 'X' || opt.charAt(0) == 'x'){
                isCont = true;
            }
            else{
                System.out.println("Invalid Key !");
                isCont = false;
            }
        }
        System.out.println("END OF PROGRAM ");
    }
}
