import java.util.Scanner;

public class SmartHomeApp {
    private static SmartHomeHub hub = new SmartHomeHub(); // as in UML

    public static void main(String[] args) {
        // Devices
        Light livingRoomLight = new Light("Living Room");
        MusicPlayer musicPlayer = new MusicPlayer("Sony");
        ThermoStat thermostat = new ThermoStat("Nest");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Smart Home Menu ===");
            System.out.println("1. Turn on Light");
            System.out.println("2. Turn Off Light");
            System.out.println("3. Increase Light Brightness");
            System.out.println("4. Decrease Light Brightness");
            System.out.println("5. Turn on Music Player");
            System.out.println("6. Turn off Music Player");
            System.out.println("7. Increase Music Volume");
            System.out.println("8. Decrease Music Volume");
            System.out.println("9. Turn on Thermostat");
            System.out.println("10. Turn Off Thermostat");
            System.out.println("11. Increase Temperature");
            System.out.println("12. Decrease Temperature");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hub.setCommand(new LightOnCommand(livingRoomLight));
                    break;
                case 2:
                    hub.setCommand(new LightOffCommand(livingRoomLight));
                    break;
                case 3:
                    hub.setCommand(new LightIncreaseCommand(livingRoomLight));
                    break;
                case 4:
                    hub.setCommand(new LightDecreaseCommand(livingRoomLight));
                    break;
                case 5:
                    hub.setCommand(new MusicPlayerOnCommand(musicPlayer));
                    break;
                case 6:
                    hub.setCommand(new MusicPlayerOffCommand(musicPlayer));
                    break;
                case 7:
                    hub.setCommand(new MusicPlayerIncreaseVolumeCommand(musicPlayer));
                    break;
                case 8:
                    hub.setCommand(new MusicPlayerDecreaseVolumeCommand(musicPlayer));
                    break;
                case 9:
                    hub.setCommand(new ThermostatOnCommand(thermostat));
                    break;
                case 10:
                    hub.setCommand(new ThermostatOffCommand(thermostat));
                    break;
                case 11:
                    hub.setCommand(new ThermostatIncreaseTempCommand(thermostat));
                    break;
                case 12:
                    hub.setCommand(new ThermostatDecreaseTempCommand(thermostat));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            // execute after each choice except exit
            if (choice != 0) {
                System.out.println(hub.executeCommand());
            }

        } while (choice != 0);

        sc.close();
    }
}
