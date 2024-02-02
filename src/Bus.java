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

    public void setFrontDoorOpened(Boolean frontDoorOpened) {
        this.frontDoorOpened = frontDoorOpened;
    }

    public Boolean getBackDoorOpened() {
        return backDoorOpened;
    }

    public void setBackDoorOpened(Boolean backDoorOpened) {
        this.backDoorOpened = backDoorOpened;
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

    
    
}
