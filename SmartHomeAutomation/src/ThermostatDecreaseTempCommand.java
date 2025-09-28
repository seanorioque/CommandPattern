public class ThermostatDecreaseTempCommand implements Command {
    private ThermoStat thermostat;

    public ThermostatDecreaseTempCommand(ThermoStat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}
