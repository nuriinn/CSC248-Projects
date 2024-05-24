public class Patient
{
    private String patientName;
    private int patientAge;
    private String patientID;
    private String patientPhoneNumber;
    
    public Patient(String patientName, int patientAge, String patientID, String patientPhoneNumber){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientID = patientID;
        this.patientPhoneNumber = patientPhoneNumber;
    }
    
    public String getPatientName(){return patientName;}
    public int getPatientAge(){return patientAge;}
    public String getPatientID(){return patientID;}
    public String getPatientPhoneNumber(){return patientPhoneNumber;}
    
    public void setPatientName(String patientName) {this.patientName = patientName;}
    public void setPatientAge(int patientAge){this.patientAge = patientAge;}
    public void setPatientID(String patientID){this.patientID = patientID;}
    public void setPatientPhoneNumber(String patientPhoneNumber){this.patientPhoneNumber = patientPhoneNumber;}
    
    public String toString(){
        return("\nPatient Name: "+patientName+ "\nPatient Age: " +patientAge+ "\nPatient ID: "+patientID+ "\nPatient phone number: "+patientPhoneNumber);
    }

}

