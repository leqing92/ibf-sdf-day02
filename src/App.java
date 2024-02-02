import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Car avante = new Car("white", 1599, "SNN7456R", "2019", "Avante", "Hyundai", "Sedan");
        avante.honk();
        avante.moveForward();

        Vehicle honda = new Car("Grey", 1600, "SNP4223M", "2020", "Civic", "Honda", "Hatchback");
        honda.honk();
        honda.moveRight();

        Bus schoolBus = new Bus("Yellow", 2000, "PA4556", "2015", "Tiagra", "Mercedes", true, true);
        schoolBus.startSwipe();
        schoolBus.stop();
        schoolBus.setDoorStatus("front");       
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("front");       
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("back");       
        schoolBus.getDoorStatus();
        schoolBus.moveForward();
        schoolBus.moveRight();

        List <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(avante);
        vehicles.add(honda);
        vehicles.add(schoolBus);

        for (Vehicle veh : vehicles){
            System.out.println(veh.toString());
        }

        Container <Vehicle> container = new Container<>();
        container.addItem(schoolBus);
        container.addItem(avante);
        container.addItem(honda);

        List <Vehicle> retrieveVehicles = container.getItems();
        for (Vehicle vehicle : retrieveVehicles){
            System.out.println(vehicle.toString());
        }
    }
}
