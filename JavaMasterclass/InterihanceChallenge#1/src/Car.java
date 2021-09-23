public class Car extends Vehicle{

    private int numberOfDoors;
    private int numberOfWheels;
    private String colour;
    private String engineModel;
    private String fuelType;
    private boolean isManual;

    private int currentGear;

    public Car(String manufacturer, String model, int numberOfDoors, int numberOfWheels, String colour, String engineModel, String fuelType, boolean isManual, int gearNummber) {
        super(manufacturer, model);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.colour = colour;
        this.engineModel = engineModel;
        this.fuelType = fuelType;
        this.isManual = isManual;
        this.currentGear = gearNummber;
    }

    public void changeGear(int currentGear){
        this.currentGear=currentGear;
    }



}
