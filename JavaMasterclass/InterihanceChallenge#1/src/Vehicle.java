public class Vehicle {

    private String manufacturer;
    private String model;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;

        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Stering at" +currentDirection+ "degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity= velocity;
        currentDirection= direction;
        System.out.println(("Vehicle.move(): Moving at"+currentVelocity+ "in direction"+currentDirection));
    }

    public void stop(){
        this.currentVelocity=0;
    }

}
