public class MyInsertionSortAL
{
    
    public static void main(String [] args){
        
        //declare and insantite ArrayList to store Integer object
        ArrayList list = new ArrayList();
        
        //insert Integer object into Arraylist
        list.add(2);
        list.add(9);
        list.add(5); 
        list.add(4);
        list.add(8);
        list.add(1);
        
        //display before IS algorithm
        System.out.println("\nBefore IS:");
        System.out.println("\t");
        for(int i=0; i<list.size(); i++){
            int n= (Integer) list.get(i);
            System.out.println(n + "");
        }
        
        //perform insertion sort ascending order
        for(int i=0; i<list.size(); i++){
            int currentElement = (Integer)list.get(i);
            int index;
            for(index = i-1; index >= 0 && (Integer)list.get(index) > currentElement; index--){
                list.set(index+1,list.get(index));
            }
            list.set(index+1, currentElement);
        }
        
        
        //display after IS algorithm
        System.out.println("\n After IS (Ascending)");
        System.out.println("\t");
        for(int i=0; i<list.size(); i++){
            int n = (Integer) list.get(i);
            System.out.println(n+ " ");
        }
    } //end of main
} //end of application

