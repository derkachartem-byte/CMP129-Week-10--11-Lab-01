public class Laptop implements Device{
    private String brand;
    private String model;
    private String processorType;
    public Laptop(String brand, String model, String processorType){
        this.brand = brand; 
        this.model = model;
        this.processorType = processorType;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getProcessorType(){
        return processorType;
    }
    public void setProcessorType(String processorType){
        this.processorType = processorType;
    }
    @Override
    public void turnOn(){
        System.out.println("The " + brand + " " + model + " laptop is starting." +
        "\nProcessor: " + processorType);
    }
}
