import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PharmacyLinkedListApp
{
    static Scanner in = new Scanner(System.in);
    
    /*** -------------------------------      main     ------------------------------------------***/
    public static void main(String[] args) {
        LinkedList patientList = new LinkedList();  
        LinkedList medList = new LinkedList();
        Scanner in = new Scanner(System.in);
        
        boolean isCont = false;
        while (!isCont) {
            System.out.println("\n============================================");
            System.out.println("\t\tMENU");
            System.out.println("============================================");
            System.out.println("[I] |   INSERT PATIENT INFORMATION");
            System.out.println("[R] |   REMOVE PATIENT INFORMATION");
            System.out.println("[S] |   SEARCH RECORD INFORMATION");
            System.out.println("[U] |   UPDATE MEDICINE (PRICE & QUANTITY)");
            System.out.println("[C] |   CALCULATE TOTAL PRICE");
            System.out.println("[D] |   DISPLAY PATIENT INFORMATION");
            System.out.println("[X] |   EXIT");
            System.out.println("============================================");
            
            System.out.print("Enter choice :    ");
            String opt = in.next();
            
            if (opt.toUpperCase().charAt(0) == 'I'){
                insertPatient(patientList);
            }
            else if (opt.toUpperCase().charAt(0) == 'R'){
                removeChoice(patientList, medList);
            }
            else if (opt.toUpperCase().charAt(0) == 'S'){
                searchChoice(patientList, medList);
            }
            else if (opt.toUpperCase().charAt(0) == 'U'){
                updateMed(medList);
            }
            else if(opt.toUpperCase().charAt(0) == 'C') {
                calcPrice(medList);
            }
            else if(opt.toUpperCase().charAt(0) == 'D') {
                displayDetails(patientList, medList);
            }
            else if (opt.toUpperCase().charAt(0) == 'X') {
                isCont = true;
            }
            else {
                System.out.println("INVALID KEY !");
                isCont = false;
            }
        }
        System.out.println("\n=====================END OF PROGRAM=====================");
    }
   
    
    /*** -------------------------------      insertion     ------------------------------------------***/
    public static void insertPatient(LinkedList patientList)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n===========================================================");
        System.out.println("\t NEW PATIENT INFORMATION");
        System.out.println("===========================================================");
        System.out.print("\nEnter patient name: ");
        String patientName = in.next();
        System.out.print("Enter patient age: ");
        int patientAge = in.nextInt();
        System.out.print("Enter patient ID: ");
        String patientID = in.next();
        System.out.print("Enter patient phone number: ");
        String patientPhoneNumber = in.next();
        
        Patient p = new Patient (patientName, patientAge, patientID, patientPhoneNumber);
        patientList.addLast(p);
        
        System.out.println("\nAdd more record? (Y/N): ");
        String c = in.next();
        
        if(c.charAt(0) == 'Y' || c.charAt(0) == 'y')
        {
            insertPatient(patientList);
        }
    }
    
    
    /*** -------------------------------      removal     ------------------------------------------***/
    public static void removeChoice (LinkedList patientList, LinkedList medList)
    {
      Scanner in = new Scanner (System.in);
      
      System.out.println("\n==========================================================");
      System.out.println("\t DELETE RECORD");
      System.out.println("==========================================================");
      System.out.println("\t [1] Patient");
      System.out.println("\t [2] Medicine");
      System.out.println("\nEnter record to delete: ");
      int choice = in.nextInt();
      
      if (choice == 1)
      {
        System.out.println("Enter Patient ID to remove: ");
        String id = in.next();
        removePatient(patientList, id);
      }
      else if (choice == 2)
      {
        System.out.println("Enter Medicine Code to remove: ");
        String code = in.nextLine();
        removeMedicine(medList, code);
      }
      else
      {
        System.out.println("Invalid choice.");
      }
    }

    public static void removePatient(LinkedList patientList, String patientID)
    {
        int indexFound = -1;
        LinkedList temp = new LinkedList();  
        
        while (!patientList.isEmpty())
        {
            Patient p = (Patient) patientList.removeFirst();
            
            if (p.getPatientID().equalsIgnoreCase(patientID))
            {
                indexFound = 1;
                break;
            }
            else
            {
                temp.addLast(p);
            }
        }
        
        while (!temp.isEmpty())
        {
            patientList.addLast(temp.removeFirst());
        }
        
        if (indexFound != -1) {
            System.out.println("Patient removed.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void removeMedicine(LinkedList medList, String medCode)
    {
        int indexFound = -1;
        LinkedList temp = new LinkedList();  
        
        while (!medList.isEmpty())
        {
            Medicine m = (Medicine) medList.removeFirst();
            
            if (m.getMedCode().equalsIgnoreCase(medCode)) {
                indexFound = 1;
                break;
            }
            else
            {
                temp.addLast(m);
            }
        }
        
        while (!temp.isEmpty())
        {
            medList.addLast(temp.removeFirst());
        }
        
        if (indexFound != -1)
        {
            System.out.println("Medicine removed.");
        }
        else
        {
            System.out.println("Medicine not found.");
        }
    }
    
  
    /*** -------------------------------      searching     ------------------------------------------***/
    public static void searchChoice(LinkedList patientList, LinkedList medList)
    {
      Scanner in = new Scanner (System.in);
      
      System.out.println("\n==============================================================");
      System.out.println("\t SEARCH RECORD");
      System.out.println("==============================================================");
      System.out.println("\t [1] Patient");
      System.out.println("\t [2] Medicine");
      System.out.println("\nEnter record to search: ");
      int choice = in.nextInt();
      
      if (choice == 1)
      {
          System.out.println("Enter Patient ID to search: ");
          String id = in.next();
          searchPatient(patientList,id);
      }
      else if (choice == 2)
      {
          System.out.println("Enter Medicine Code to search: ");
          String code = in.nextLine();
          searchMedicine(medList,code);
      }
      else
      {
          System.out.println("Invalid choice.");
      }
    }
    
    public static void searchPatient(LinkedList patientList, String patientID)
    {
        int count = 0;
        
        Patient p = (Patient) patientList.getFirst();
        String id = p.getPatientID();
        
        while (p != null)
        {
             if (p.getPatientID().equalsIgnoreCase(id))
             {
                 System.out.println("\n" + p.toString());
                 count++;
             }
             p = (Patient) patientList.getNext();
        }
        
        System.out.println(count);
        if(count > 1)
          System.out.print( "patients");
        else
          System.out.print( "patient");
        System.out.println( "matched.");
    }
    
    public static void searchMedicine(LinkedList medList, String medCode)
    {
        int count = 0;
        
        Medicine m = (Medicine) medList.getFirst();
        String code = m.getMedCode();
        
        while (m != null)
        {
             if (m.getMedCode().equalsIgnoreCase(code))
             {
                 System.out.println("\n" + m.toString());
                 count++;
             }
             m = (Medicine) medList.getNext();
        }
        
        System.out.println(count);
        if(count > 1)
          System.out.print( "medicines");
        else
          System.out.print( "medicine");
        System.out.println( "matched.");
    }
    
    
    /*** -------------------------------      update     ------------------------------------------***/
    public static void updateMed(LinkedList medList) {
        System.out.println("\n==============================================================");
        System.out.println("\t\tUPDATE MEDICINE ");
        System.out.println("==============================================================");
        System.out.print("\nEnter medicine code :    ");
        String medCode = in.nextLine();
        System.out.print("Enter the new price : RM ");
        double newPrice = in.nextDouble();
        System.out.print("Enter the new quantity : ");
        int newQty = in.nextInt();
                
        Medicine medicine = (Medicine) medList.getFirst();
        while (medicine != null) {
            if (medicine.getMedCode().equalsIgnoreCase(medCode)) {
                //medicine.setMedPrice(newPrice);
                //System.out.println("\tPrice after update    : RM " + medicine.getMedPrice());
                medicine.setQty(newQty);
                System.out.println("\tQuantity after update : " + medicine.getQty());
                System.out.println("\nMEDICINE UPDATE SUCESSFULLY !");
            }
            medicine = (Medicine) medList.getNext();
        }
        System.out.println("\nMEDICINE NOT FOUND");
    }//end of updateMedPrice()

    /*** -------------------------------      calculation     ------------------------------------------***/
    public static void calcPrice(LinkedList medList) {
        System.out.println("\n===============================================");
        System.out.println("\tPAYMENT ");
        System.out.println("===============================================");
        System.out.print("Enter medicine quantity :   ");
        int medQty = in.nextInt();
        System.out.print("Enter medicine price    : RM ");
        double medPrice = in.nextDouble();
        
        Medicine med = (Medicine) medList.getFirst();
        while (med != null) {
            //double totPrice = med.calculatePrice();
            
            System.out.println("\f");
            System.out.println("===============================================");
            System.out.println("\t RECEIPT ");
            System.out.println("===============================================");
            System.out.println("Medicine Code        : "+ med.getMedCode());
            System.out.println("Medicine Type        : "+ med.getMedType());
            System.out.println("Medicine Quantity    : "+ med.getQty());
            //System.out.println("Medicine Total Price : RM " + totPrice);
            System.out.println("===============================================");
        }
        in.close(); //Close the scanner to avoid resource leaks
    }// end of calcMed()
    
    /*** -------------------------------      display     ------------------------------------------***/
    public static void displayDetails(LinkedList patientList, LinkedList medList) {
        System.out.println("\n==============================================================");
        System.out.println("\t DISPLAY RECORDS ");
        System.out.println("==============================================================");
        System.out.print("Enter [1] Patient and [2] Medicine: ");
        int key = in.nextInt();
        
        Patient patient = (Patient) patientList.getFirst();    
        while(patient != null) {
            if (key == 1) {
                System.out.println(patient.toString());
            }
            patient = (Patient) patientList.getNext();
        }
        
        /***** might need to change using buffered reader **/
        Medicine medicine = (Medicine) medList.getFirst();
        System.out.println();
        if (key == 2) {
            try {
                FileReader fr = new FileReader("medicineList.txt");
                BufferedReader br = new BufferedReader(fr);
                
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                
                br.close(); // Close the BufferedReader to realse resources
            } catch (IOException e) {
                e.printStackTrace(); // Handle any IOException that might occur
            }
        }
    }// end of displayDetails()
}
