public class Medication extends Medicine
{
    private String medForm;
    private int medDosage;
    private String dosageTiming;
    
    //constructor
    public Medication (int medType, String medCode, int qty,
    String patientName, int patientAge, String patientID, String patientPhoneNumber, String medForm, int medDosage, String dosageTiming)
    {
        super(medType,medCode, qty, patientName, patientAge, patientID, patientPhoneNumber);
        this.medForm = medForm;
        this.medDosage = medDosage;
        this.dosageTiming = dosageTiming;
    }
    
    //setter
    public void setMedform (String medForm) {this.medForm = medForm;}
    public void setMedDosage (int medDosage) {this.medDosage = medDosage;}
    public void setDosageTiming (String dosageTiming) {this.dosageTiming = dosageTiming;}
    
    //getter
    public String getMedForm () {return this.medForm;}
    public int getMedDosage (){return this.medDosage;}
    public String getDosageTiming () {return this.dosageTiming;}
    
    public String medForm (){
        // do if-else here 
        //tablets
        //liquid
        
        if(medForm == "T"){
            return "tablets";
        }
        else if(medForm == "L" ){
            return "liquid";
        }
        else {
            return "unknown";
        }
    }
    
    //public int medDosage(){
        // only for liquid so need to do if-else for the type
        // do if-else here
        // how many ml 
       // if(medForm.equals("L")){
         //   if(medDosage == 1){
                
           // }
        //}
        
    //}
    
    public String dosageTiming(){
        // do if-else here
        // 2x a day
        //after eat
        if(dosageTiming.equals("A"))
            return "1x a day";
        else if (dosageTiming.equals("B"))
            return "2x a day";
        else if (dosageTiming.equals("C"))
            return "3x a day";
        else 
            return "unknown";
        }
    
    //printer
    public String toString ()
    {
        return (super.toString()
        + "\nMedication form: " + this.medForm
        + "\nMedication Dosage: " + this.medDosage
        + "\nDosage timing: " + this.dosageTiming);
    }
}
