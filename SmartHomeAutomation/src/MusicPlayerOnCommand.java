public class MusicPlayerOnCommand implements Command {
    private MusicPlayer player;
    public MusicPlayerOnCommand(MusicPlayer player) { this.player = player; }
    @Override public void execute() { player.turnOn(); }
}