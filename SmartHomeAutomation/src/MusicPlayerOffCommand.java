public class MusicPlayerOffCommand implements Command {
    private MusicPlayer player;
    public MusicPlayerOffCommand(MusicPlayer player) { this.player = player; }
    @Override public void execute() { player.turnOff(); }
}