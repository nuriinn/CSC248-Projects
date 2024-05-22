public class Medicine
{
    private int medType;
    private String medCode;
    private int qty;
    protected Patient patient;
    
    public Medicine(int medType, String medCode, int qty,
    String patientName, int patientAge, String patientID, String patientPhoneNumber){
        this. medCode = medCode;
        this.medType = medType;
        this.qty = qty;
        this.patient = new Patient (patientName, patientAge, patientID, patientPhoneNumber);
    }
    
    public int getMedType() {return medType;}
    public String getMedCode() {return medCode;}
    public int getQty(){return qty;}
    public Patient getPatient() {return patient;}
    
    public void setMedType(int getMedType) {this.medType = medType;}
    public void setMedCode(String medCode) {this. medCode = medCode;}
    public void setQty(int qty) {this.qty = qty;}
    
    public String toString(){
        return("\nMedicine Code: "+medCode+ "\nMedicine Type: "+medType+ "\nQuantity:"+qty);
    }
    
    public double calculatePrice(){
        double price = 0.00;
        
        if (medCode.equalsIgnoreCase("OM500")) 
            price = 15.00;
        else if (medCode.equalsIgnoreCase("OM230")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OM300")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OM100")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OC333")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OC890")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OC901")) 
            price = 15.00;
        
        else if (medCode.equalsIgnoreCase("OC450")) 
            price = 15.00;
        
        double totPrice = price * qty;
        return totPrice;
    }
    
}