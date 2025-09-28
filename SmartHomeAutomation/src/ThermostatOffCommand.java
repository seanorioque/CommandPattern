public class ThermostatOffCommand implements Command {
    private ThermoStat thermostat;

    public ThermostatOffCommand(ThermoStat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.turnOff();
    }
}
