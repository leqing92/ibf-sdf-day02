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
        System.out.println("Tuuu...Tuuu...Tuuu...");
    }

}
