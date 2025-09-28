public class MusicPlayerIncreaseVolumeCommand implements Command {
    private MusicPlayer player;
    public MusicPlayerIncreaseVolumeCommand(MusicPlayer player) { this.player = player; }
    @Override public void execute() { player.increaseVolume(); }
}