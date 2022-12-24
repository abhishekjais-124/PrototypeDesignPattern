import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{

    private List<String> vehicleList = new ArrayList<>();

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle() {}

    public void insertVehicles(){
        vehicleList.add("audi");
        vehicleList.add("bmw");
        vehicleList.add("kawasaki");
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();

        for(String s : this.getVehicleList()) {
            tempList.add(s);
        }

        return new Vehicle(tempList);
    }
}
