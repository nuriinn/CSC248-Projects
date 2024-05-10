
public class MyBinarySearchAL
{
    //binarySearch() method
    public static int binarySearch(ArrayList list, int key){
        int low = 0, high = list.size()-1;
        while(high >= low){
            int mid = (low + high) / 2;
            if (key < (Integer) list.get(mid))
                high = mid - 1;
            else if (key == (Integer) list.get(mid))
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    } 
    
    //bubleSort() method
    public static void bubbleSort(ArrayList list) {
        for (int i=0; i<list.size(); i++){ 
            for(int j=0; j<list.size(); j++){
                int n1 = (Integer)list.get(j);
                int n2 = (Integer) list.get(j+1);
                if (n1 > n2 ) {
                    list.set(j, n2);
                    list.set(j+1, n1);
                }
            }
        }
    }
    
    //print() method
    public static void print(ArrayList list){
        for (int i=0; i<list.size(); i++){
            int v = (Integer)list.get(i);
            System.out.println(v + " ");
        }
        System.out.println();
    }
    
    //main() method
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        //insert Integer object into Arraylist
        list.add(2);
        list.add(9);
        list.add(5); 
        list.add(4);
        list.add(8);
        list.add(1);
        
        System.out.println("Original List: ");
        print(list);
        
        bubbleSort(list); //
        System.out.println("List after BS:");
        print(list);
        
        int key = 7;
        int index = binarySearch(list, key);
        if (index != -1)
            System.out.println(key+ "is found at index" +index);
        else 
            System.out.println(key+ "is not in list");
    }
}
