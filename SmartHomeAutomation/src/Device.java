public abstract class Device {
    public String name;
    public String status;


    public Device(String name) {
        this.name = name;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
