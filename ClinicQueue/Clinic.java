public class Clinic {
    private String ID;
    private String sicknessType; //flu, fever, allergies,diarrhea, etc.
    private int criticalType; //1 - Non-Critical, 2- Semi Critical,3 - Critical
    
    public Clinic(String ID, String sicknessType, int criticalType){
        this.ID = ID;
        this.sicknessType = sicknessType;
        this.criticalType = criticalType;
    }
    public String getID() {return ID;}
    public String getSicknessType() {return sicknessType;}
    public int getCriticalType() {return criticalType;}
}



