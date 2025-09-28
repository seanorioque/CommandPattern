public class SmartHomeHub {
    private Command command; // one command at a time

    public void setCommand(Command command) {
        this.command = command;
    }

    public String executeCommand() {
        if (command != null) {
            command.execute();
            return "Command executed successfully.";
        } else {
            return "No command set.";
        }
    }
}
