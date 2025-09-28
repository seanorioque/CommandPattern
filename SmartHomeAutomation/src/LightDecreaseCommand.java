public class LightDecreaseCommand implements Command {
    private Light light;
    public LightDecreaseCommand(Light light) { this.light = light; }
    @Override public void execute() { light.decreaseBrightness();
    }
}