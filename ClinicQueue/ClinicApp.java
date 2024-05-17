public class ClinicApp{
    public static void main(String [] args){
        /*Copy patient details in patientList into three different Queue list named as room1 room2
        and room3 Queue list according to critical type as in the following table:
        (Note: Please remain the original order of patientList).*/  
        Queue patientList = new Queue();
        
        Queue room1 = new Queue();
        Queue room2 = new Queue();
        Queue room3 = new Queue();
        
        while(!patientList.isEmpty()){
          Clinic patient = (Clinic) patientList.dequeue();
          
          if(patient.getCriticalType() == 1){
              room1.enqueue(patient);
          }
           else if(patient.getCriticalType() == 2){
              room2.enqueue(patient);
          }
          else if(patient.getCriticalType() == 3){
              room3.enqueue(patient);
          }
        }
        
        /* ) Write a program segment to display all patients with flu from patientList. (Please
        preserve the original order of the list.)*/
        System.out.println("\nDISPLAY ALL PATIENTS WITH FLU");
        while(!patientList.isEmpty()){
            Clinic patient =(Clinic) patientList.dequeue();
            if(patient.getSicknessType().equalsIgnoreCase("flu")){
                System.out.println(patient.toString());
            }
        }
    } 
}

