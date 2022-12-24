public class ImmutableExample implements Cloneable{

    private String model;
    private int gears;
    private int wheels;
    private String engine;

    public ImmutableExample(String model, int gears, int wheels, String engine) {
        System.out.println("Constructor called: Setting values");
        this.model = model;
        this.gears = gears;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
