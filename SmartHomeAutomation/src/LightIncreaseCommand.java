public class LightIncreaseCommand implements Command {
    private Light light;
    public LightIncreaseCommand(Light light) { this.light = light; }
    @Override public void execute() { light.increaseBrightness(); }
}