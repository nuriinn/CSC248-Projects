public class MyNodeLLApp
{
    public static void main(String[]args){
        Node first, last;
        first = last = null;
        
        //create new node
        //1st data
        Node newNode = new Node("mu");
        first = newNode;
        last = first;
        
        //2nd data
        last.next = new Node("di");
        last = last.next;
        
        //3rd data
        last.next = new Node("sini");
        last = last.next;
        
        //add new data as 1st data
        newNode = new Node("wu");
        newNode.next = first;
        first = newNode;
        
        //add new data as 2nd data
        newNode = new Node("jud");
        newNode.next = first.next;
        first.next = newNode;
        
        print(first);
        System.out.println("\nFirst: "+first.element);
        System.out.println("\nLast: "+last.element);
        
        //delete
        
        //remove 2nd 
        first.next = first.next.next;
        
        //remove 1st
        first = first.next;
        
        //remove last
        Node current = first;
        while(current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;

        
        print(first);
        System.out.println("\nFirst: "+first.element);
        System.out.println("\nLast: "+last.element);
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
