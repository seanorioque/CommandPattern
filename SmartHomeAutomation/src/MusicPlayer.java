public class MusicPlayer extends Device {
    private int volume = 50; // default volume

    public MusicPlayer(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println(name + " music player started playing.");
    }

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println(name + " music player stopped.");
    }

    public void increaseVolume() {
        if (status.equals("OFF")) {
            System.out.println(name + " The MusicPlayer is off; please switch it on to continue.");
        } else if (status.equals("ON")) {
            volume += 5;
            if (volume > 100) {   // cap at 100
                volume = 100;
            }
            System.out.println(name + " music volume increased to " + volume);
        }
    }

    public void decreaseVolume() {
        if (status.equals("OFF")) {
            System.out.println(name + " The MusicPlayer is off; please switch it on to continue.");
        } else if (status.equals("ON")) {
            volume -= 5;
            if (volume < 0) {   // floor at 0
                volume = 0;
            }
            System.out.println(name + " music volume decreased to " + volume);
        }
    }
}
