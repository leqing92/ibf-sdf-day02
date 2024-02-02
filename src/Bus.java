public class Bus extends Vehicle{
    private Boolean frontDoor;
    private Boolean backDoor;
    private Boolean frontDoorOpened;
    private Boolean backDoorOpened;

    public Bus(Boolean frontDoor, Boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    public Bus(String color, int capacity, String licensePlateNo, String year, String model, String make,
            Boolean frontDoor, Boolean backDoor) {
        super(color, capacity, licensePlateNo, year, model, make);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
        this.frontDoorOpened = false;
        this.backDoorOpened = false;
    }

    public Boolean getFrontDoor() {
        return frontDoor;
    }

    public void setFrontDoor(Boolean frontDoor) {
        this.frontDoor = frontDoor;
    }

    public Boolean getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(Boolean backDoor) {
        this.backDoor = backDoor;
    }

    public Boolean getFrontDoorOpened() {
        return frontDoorOpened;
    }

    // public void setFrontDoorOpened(Boolean frontDoorOpened) {
    //     this.frontDoorOpened = frontDoorOpened;
    // }

    public Boolean getBackDoorOpened() {
        return backDoorOpened;
    }

    // public void setBackDoorOpened(Boolean backDoorOpened) {
    //     this.backDoorOpened = backDoorOpened;
    // }

    //door: front or back
    public void setDoorStatus (String door){

        if(door.toLowerCase().equals("front")){
            if(frontDoor){
                //either open or close the door
                this.frontDoorOpened = !this.frontDoorOpened;
            }else {
                System.err.println("There is no " + door + " door.");
            }
        }

        if(door.toLowerCase().equals("back")){
            if(backDoor){
                //either open or close the door
                this.backDoorOpened = !this.backDoorOpened;
            }else {
                System.err.println("There is no " + door + " door.");
            }
        }

    }
    //getter
    public void getDoorStatus(){
        System.out.println("Front door: " + frontDoor + ", Opened: " + frontDoorOpened);
        System.out.println("Back door: " + backDoor + ", Opened: " + backDoorOpened);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((frontDoor == null) ? 0 : frontDoor.hashCode());
        result = prime * result + ((backDoor == null) ? 0 : backDoor.hashCode());
        result = prime * result + ((frontDoorOpened == null) ? 0 : frontDoorOpened.hashCode());
        result = prime * result + ((backDoorOpened == null) ? 0 : backDoorOpened.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bus other = (Bus) obj;
        if (frontDoor == null) {
            if (other.frontDoor != null)
                return false;
        } else if (!frontDoor.equals(other.frontDoor))
            return false;
        if (backDoor == null) {
            if (other.backDoor != null)
                return false;
        } else if (!backDoor.equals(other.backDoor))
            return false;
        if (frontDoorOpened == null) {
            if (other.frontDoorOpened != null)
                return false;
        } else if (!frontDoorOpened.equals(other.frontDoorOpened))
            return false;
        if (backDoorOpened == null) {
            if (other.backDoorOpened != null)
                return false;
        } else if (!backDoorOpened.equals(other.backDoorOpened))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpened=" + frontDoorOpened
                + ", backDoorOpened=" + backDoorOpened + ", model=" + this.getModel() + "]";
    }

    @Override
    public void honk(){
        System.out.println("Booo... Boo... Boo...");
    }

    @Override
    public void moveForward() {
        System.out.println("Bus is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Bus is moving backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Bus is moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("Bus is moving right...");
    }
}
