public class ThermostatIncreaseTempCommand implements Command {
    private ThermoStat thermostat;

    public ThermostatIncreaseTempCommand(ThermoStat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}
