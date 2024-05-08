 import java.util.Scanner;
public class StudentApp
{
   public static void main (String[] args){
       
       //accept 5 students and stored into ArrayList
       ArrayList theList = new ArrayList();
       
       for(int x=0; x<5; x++){
           Scanner inputNum = new Scanner(System.in);
           Scanner inputText = new Scanner(System.in);
           
            System.out.print("Enter student ID : ");
            String id = inputText.next();
            System.out.print("Student name : ");
            String name = inputText.next();
            System.out.print("Student program : ");
            String program = inputText.next();
            System.out.print("Enter part : ");
            int part = inputNum.nextInt();
            System.out.print("Enter CGPA : ");
            double cgpa = inputNum.nextDouble();
            Student student = new Student(id,name,program,part,cgpa);
            theList.add(student);
       }
       
       //display theList
       for(int i=0; i<theList.size();i++){
           Student student = (Student) theList.get(i);
           System.out.println(student.toString());
       }
       
       //find and display the best student
       int part4=0, scorer=0, index=0;
       double cgpa = 0.0;
       for(int i=0; i<theList.size(); i++){
           Student student = (Student) theList.get(i);
           if (student.getCgpa() > cgpa){
               cgpa = student.getCgpa();
               index=i;
           }
           //count and display the student in part 4
           if(student.getPart() == 4)
               part4++;
               
           //count and display the num of students (cgpa is 3.00 and above)
           if(student.getCgpa() >= 3.00)
               scorer++;
       }
       System.out.println("The best student is ");
       Student student = (Student) theList.get(index);
       System.out.println(student.toString());
       System.out.println("No. of part 4 students : "+part4);
       System.out.println("No. of student with CGPA 3.00 and above : "+scorer);
   }
}

