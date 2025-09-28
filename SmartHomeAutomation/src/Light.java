public class Light extends Device {
    private int brightness = 0;  // starts at 0

    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        status = "ON";
        brightness = 50;
        System.out.println(name + " light turned ON at brightness " + brightness);
    }

    @Override
    public void turnOff() {
        status = "OFF";
        brightness = 0;
        System.out.println(name + " light turned OFF");
    }

    public void increaseBrightness() {
        if (status.equals("OFF")) {
            System.out.println(name + " The lights are off; please switch them on to continue.");
        } else if (status.equals("ON")) {
            brightness += 10;
            // clamp to maximum 100
            if (brightness > 100) {
                brightness = 100;
            }
            System.out.println(name + " light brightness increased to " + brightness);
        }
    }

    public void decreaseBrightness() {
        if (status.equals("OFF")) {
            System.out.println(name + " The lights are off; please switch them on to continue.");
        } else if (status.equals("ON")) {
            brightness -= 10;
            // clamp to minimum 0
            if (brightness < 0) {
                brightness = 0;
            }
            System.out.println(name + " light brightness decreased to " + brightness);
        }
    }
}
