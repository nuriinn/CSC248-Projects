import java.util.*;
public class MyArrListTut1 {
    public static void main(String[] args) {
        // (1) Declare and create instance of ArrayList named numberList to store Integer objects
        ArrayList numberList = new ArrayList();
        
        /* (2) Display the size of element of numberList, and a value returned by isEmpty() method. The output should
        be 0 and true. Explain why the value returned by isEmpty() method is true */
        System.out.println("The size of element in list: ");
        System.out.println(numberList.size());
        System.out.println("Empty list ? " +numberList.isEmpty());
        
        /* (3) Insert 4, 3 and 2 consecutively into numberList using add(element) method and display the size of the
        list. The output should be 3 */
        numberList.add(4);
        numberList.add(3);
        numberList.add(2);
        System.out.println("The size of elements in list: " + numberList.size());
        
        /* (4) Print the element(s) of numberList using get(index) method. You may utilize a for control structure to
        iterate the retrieving process of the elements. The output produced should be { 4 3 2 } */
        for(int x=0; x<numberList.size(); x++){
            int num = (int) numberList.get(x);
            System.out.println(num +"");
        }
        
        /* (5) Insert 7 and 5 consecutively into numberList using add(index, element) method. Place 7 and 5 as the
        first and second element respectively.  */
        numberList.add(0,7);
        numberList.add(1,5);
        
        /* (6) Print the element(s) of numberList using get(index) method. You may utilize a for control structure to
        iterate the retrieving process of the elements. The output produced should be { 7 5 4 3 2 }. */
        for(int i=0; i<numberList.size();i++){
           int num = (int) numberList.get(i);
           System.out.println("The size of element in list: "+num);
        }
        
        /* (7) What is the size of numberList and state the index location of element 4, 3 and 2 respectively?*/
        // INCOMPLETE !!
        for(int i=0; i<4; i++){
            int currentElement = (Integer)numberList.get(i);
            int index;
            for(index = i-1; index >= 0 && (Integer)numberList.get(index) > currentElement; index--){
                numberList.set(index+1,numberList.get(index));
            }
        }
        
        /* (8) Insert 1 into numberList and place it as the last element of the list. State the index location of element 1*/
        numberList.add(1);
        System.out.println("index location of 1 : "+numberList.indexOf(1));
        
        /* (9) Insert 8 and 9 consecutively into numberList. Place 8 as the predecessor of 1 and 9 as the predecessor of 8
        respectively into numberList*/
        numberList.add(5, 8);
        numberList.add(5, 9);
        
        /* (10) Print the element(s) of numberList using get(index) method. You may utilize a for control structure to
        iterate the retrieving process of the elements. The output produced should be { 7 5 4 3 2 9 8 1 }*/
        for(int x=0; x<numberList.size(); x++){
           int num = (int) numberList.get(x);
           System.out.println("The size of element in list: "+num);
        }
        
        /* (11) Insert 7 into numberList and place it as the successor of element 3 (or predecessor of element 2) in the list.
        State the index location of 7 using indexOf(element) and lastIndexOf(element). */
        numberList.add(4,7);
        System.out.println("\nIndex location of 7 : " +numberList.indexOf(7));
        System.out.println("\nIndex location of 7 : " +numberList.lastIndexOf(7));
        
        /* (12) Print the element(s) of numberList using toString() method. The output produced should be in the
        following formats: [7, 5, 4, 3, 7, 2, 9, 8, 1] */  
        System.out.println("The elements of numberList : "+numberList.toString());
        
        /* (13) By using remove(element) method, remove element at index location 4. Then use
        lastIndexOf(element) method to check the last index of element 7 */
        int r = (int) numberList.remove(4);
        System.out.println(r+" is removed from the last");
        System.out.println(numberList.lastIndexOf(7));
       
        /* (14)  Replace the 2nd element with 11 using appropriate method and print all the elements of numberList using
        appropriate method. The output produced should be { 7 11 4 3 2 9 8 1 }.*/
        numberList.set(1,11);
        for(int x=0; x<numberList.size(); x++){
            int num = (int) numberList.get(x);
            System.out.println(num+"");
        }
        
        /* (15) Display the size of element of numberList and a value returned by isEmpty() method. The output should
        be 8 and false. Explain why the value returned by isEmpty() method is false. */
        System.out.println("The size of element in list: ");
        System.out.println(numberList.size());
        System.out.println("Empty list ? " +numberList.isEmpty());
        
        /* (16) Sort and display the element of numberList in ascending order using Bubble Sort Algorithm. The
        output produced should be { 1 2 3 4 7 8 9 11 }. */
        //perform bubble sort ascending order
        for(int i=0; i<numberList.size()-1; i++){
            for(int j=0; j<numberList.size()-(i+1); j++){
                int n1 =(Integer) numberList.get(j);  //(integer) is an object here !!
                int n2 = (Integer)numberList.get(j+1);
                if(n1 > n2) {
                    numberList.set(j, n2);
                    numberList.set(j+1, n1);
                }
            }
        }
        
        //display after BS algorithm
        System.out.println("\n After Bubble Sort");
        System.out.println("\t");
        for(int i=0; i<numberList.size(); i++){
            int n = (Integer) numberList.get(i);
            System.out.println(n+ " ");
        }
        
        /* (17) Examine/check/test and display all prime numbers from numberList */
        System.out.print("Prime numbers in the list: ");
        for(int i=0; i<numberList.size(); i++) {
            int num = (Integer) numberList.get(i);
            if(num != 1){
                if ((num == 2 || num == 3 )){
                    System.out.print(num + " ");
                }
                 if ((num%2 != 0 || num%3 != 0)) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        
        /* (18) Examine/check/test and display all even numbers from numberList. */
          System.out.print("Even numbers in the list: ");
        for(int i=0; i<numberList.size(); i++) {
            int num = (Integer) numberList.get(i);
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        /* (19) Examine/check/test and display all odd numbers from numberList. */
        System.out.print("Odd numbers in the list: ");
        for(int i=0; i<numberList.size(); i++) {
            int num = (Integer) numberList.get(i);
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        /* (20) Examine/check/test and display all numbers that are divisible by 3 from numberList. The output produced
        should be { 3 9 } */
        System.out.print("Numbers divisible by 3 in the list: ");
        for(int i=0; i<numberList.size(); i++) {
            int num = (Integer) numberList.get(i);
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
