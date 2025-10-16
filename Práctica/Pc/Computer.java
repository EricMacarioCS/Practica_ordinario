package Pc;
public abstract class Computer{
    private String model;
    private String manufacturer;
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem){
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;

    }
    public abstract String getComputerType();
    abstract int calculatePortabilityScore();

    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }
    

}
