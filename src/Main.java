import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Vehicle a = new Vehicle();
        a.insertVehicles();

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Jaguar");

        System.out.println(a.getVehicleList());
        System.out.println(list);

        ImmutableExample immutableExample = new ImmutableExample("xr13",5,2,"yamaha");
        ImmutableExample immutableExampleCopy = (ImmutableExample) immutableExample.clone();
        immutableExampleCopy.setEngine("hero");

        System.out.println(immutableExample.getEngine());
        System.out.println(immutableExampleCopy.getEngine());
    }
}