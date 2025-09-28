public class MusicPlayerDecreaseVolumeCommand implements Command {
    private MusicPlayer player;  // <-- you need this field

    public MusicPlayerDecreaseVolumeCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.decreaseVolume();
    }
}
