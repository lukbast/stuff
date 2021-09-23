public class TV {

    private String manufacturer;
    private String model;
    private String typeOfScreen;
    private int sizeOfScreen;
    private Resolution resolution;
    private String operatingSystem;


    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfScreen() {
        return typeOfScreen;
    }

    public int getSizeOfScreen() {
        return sizeOfScreen;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public TV(String manufacturer, String model, String typeOfScreen, int sizeOfScreen, Resolution resolution, String operatingSystem) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.typeOfScreen = typeOfScreen;
        this.sizeOfScreen = sizeOfScreen;
        this.resolution = resolution;
        this.operatingSystem = operatingSystem;
    }

    public void playAMovie(){
        System.out.println("PLaying...");
    }

    public void switchPowerOff(){
        System.out.println("PowerSwitchedOut");
    }




}
