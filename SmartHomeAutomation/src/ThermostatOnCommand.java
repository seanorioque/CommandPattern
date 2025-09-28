public class ThermostatOnCommand implements Command {
    private ThermoStat thermostat;

    public ThermostatOnCommand(ThermoStat thermostat) {
        this.thermostat = thermostat; // correct assignment
    }

    @Override
    public void execute() {
        thermostat.turnOn();
    }
}
