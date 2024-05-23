public class OintmentMed extends Medicine
{
    private String skinCondition;
    private String applicationMethod;
    private String sideEffect;
    
    //constructor
    public OintmentMed(int medType, String medCode, int qty,
    String patientName, int patientAge, String patientID, String patientPhoneNumber, String skinCondition, String applicationMethod, String sideEffect)
    {
        super(medType,medCode, qty, patientName, patientAge, patientID, patientPhoneNumber);
        this.skinCondition = skinCondition;
        this.applicationMethod = applicationMethod;
        this.sideEffect = sideEffect;
    }
    
    //getter
    public String getSkinCondition() {return skinCondition; }
    public String getApplicationMethod() {return applicationMethod; }
    public String getSideEffect() { return sideEffect; }
    
    //setter
    public void setSkinCondition(String skinCondition) { this.skinCondition = skinCondition; }
    public void setApplicationMethod(String applicationMethod) { this.applicationMethod = applicationMethod; }
    public void setSideEffect(String sideEffect) { this.sideEffect = sideEffect; }
    
    public void skinCondition (){
        //do if-else here
    }
    
    public void applicationMethod(){
        //do if-else here
    }
    
    public void sideEfect(){
        //do if-else here
    }
    //printer
    public String toString() {
        return (super.toString() + 
                "\nSkin Condition :  " + this.skinCondition +
                "\nApplication Method :  " + this.applicationMethod +
                "\nSide Effect :    " + this.sideEffect);
    }
}

