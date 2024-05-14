public class MyNodeAppT3
{
    public static void main (String [] args) {
        // initialise head/ tail to null
        Node head,tail;
        head = tail = null;
        
        //question 2 
        Node newNode = new Node(3);
        head = newNode;
        tail = head;
        
        //quesrion 3 
        tail.next= new Node(5);
        tail = tail.next;
        
        //question 4 
        newNode = new Node(8);
        newNode.next = head;
        head = newNode;
        
        //question 5
        newNode = new Node(9);
        newNode.next = head.next;
        head.next = newNode;
        
        //question 6 
        newNode = new Node(1);
        newNode.next = head.next;
        head.next = newNode;
        
        //question 7
        newNode = new Node(4);
        newNode.next = head;
        head = newNode;
        
        //question 8 
        newNode = new Node(7);
        newNode.next = head.next.next;
        head.next.next = newNode;
        
        //question 9 
        head.next = head.next.next;
        
        //question 10 
        head = head.next;
        
        //question 11
        Node current = head;
        while(current.next != tail) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        
        print(head);
        System.out.print("\nFirst: "+head.element);
        System.out.print("\nLast: "+tail.element);
    }
    
     public static void print(Node node){
        Node current = node;
        while(current!= null){
            System.out.print("[" +current.element+"]");
            
            if(current.next!= null){
                System.out.print("-->");
            }
            current=current.next;
        }
        System.out.println();
    }
}
