public class MyBubbleSortAL
{
    public static void main(String [] args){
        
        //declare and insantite ArrayList to store Integer object
        ArrayList list = new ArrayList();
        
        //insert Integer object in+ to Arraylist
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(1);
        
        //display before BS algorithm
        System.out.println("\nBefore BS:");
        System.out.println("\t");
        for(int i=0; i<list.size(); i++){
            int n= (Integer) list.get(i);
            System.out.println(n + "");
        }
        
        //perform bubble sort ascending order
        for(int i=0; i<list.size()-1; i++){
            for(int j=0; j<list.size()-(i+1); j++){
                int n1 =(Integer) list.get(j);  //(integer) is an object here !!
                int n2 = (Integer)list.get(j+1);
                if(n1 > n2) {
                    list.set(j, n2);
                    list.set(j+1, n1);
                }
            }
        }
        
        //display after BS algorithm
        System.out.println("\n After BS (Ascending)");
        System.out.println("\t");
        for(int i=0; i<list.size(); i++){
            int n = (Integer) list.get(i);
            System.out.println(n+ " ");
        }
    } //end of main
} //end of application

