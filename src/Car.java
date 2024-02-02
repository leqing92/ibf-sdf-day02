public class Car extends Vehicle {

    private String bodyType; // sedan or hatchback

    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String color, int capacity, String licensePlateNo, String year, String model, String make,
            String bodyType) {
        super(color, capacity, licensePlateNo, year, model, make);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void honk() {
        System.out.println(this.getLicensePlateNo() + "Tuuu...Tuuu...Tuuu...");
    }

    @Override
    public void moveForward() {
        System.out.println("Car is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is moving backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Car is moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("Car is moving right...");
    }

    @Override
    public String toString() {
        return "Car [color=" + this.getColor() + ", capacity=" + this.getCapacity() + ", licensePlateNo=" + this.getLicensePlateNo() + ", year="
                + this.getYear() + ", model=" + this.getModel() + ", make=" + this.getMake() + ", bodyType=" + bodyType + "]";
    }

}
