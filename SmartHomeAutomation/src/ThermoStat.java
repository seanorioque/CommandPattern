public class ThermoStat extends Device {
    private int temperature = 22;

    public ThermoStat(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println(name + " thermostat turned ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println(name + " thermostat turned OFF");
    }

    public void increaseTemperature() {
        if(status.equals("OFF")) {
            System.out.println(name + " The Thermostat is off; please switch it on to continue.");
        }
        else if(status.equals("ON")) {
            temperature += 1;
            if (temperature > 30) {    // cap at 30
                temperature = 30;
            }
            System.out.println(name + " thermostat temperature increased to " + temperature + "°C");
        }

    }

    public void decreaseTemperature() {
        if(status.equals("OFF")) {
            System.out.println(name + " The Thermostat is off; please switch it on to continue.");
        }
        else if(status.equals("ON")) {
            temperature -= 1;
            if (temperature < 16) {    // floor at 16
                temperature = 16;
            }
            System.out.println(name + " thermostat temperature decreased to " + temperature + "°C");
        }

    }
}
