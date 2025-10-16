public class Desktop extends Computer{
    private double caseHeight;

    public Desktop (String model, String manufacturer, String operatingSystem){
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    getComputerType(){
        return "computadora de escritorio";
    }
    
    
}
