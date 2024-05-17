import java.util.*;
public class MyQueueApp0
{
    public static void main (String args[] ){
        Scanner in = new Scanner (System.in);
        Queue strQ = new Queue();
        
        while(true){
            System.out.println("Enter any char / String (-1 to stop): ");
            String str = in.nextLine();
            if(!str.equals("-1")){
                strQ.enqueue(str);
            }
            else{
                break;
            }
        }
        
        System.out.println("You've entered: ");
        System.out.println(strQ);
        
        Scanner n = new Scanner(System.in);
        while(!strQ.isEmpty()){
            String str = (String) strQ.dequeue();
            System.out.println("Remove: " +str);
            System.out.println("Press [ENTER] to continue: ");
            String x = n.nextLine();
        }
        
        System.out.println("state of Queue: " +strQ);
    }
    
}
