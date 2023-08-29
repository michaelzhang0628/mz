package michael.madlibs;

public class Slot implements MadLibEntry{
    private String type;
    private String answer;

    public Slot(String type) {
        super();
        this.type = type;
    }

    @Override
    public String templateString() {
        return "<" + type + ">";
    }

    @Override
    public String madLibString() {
        return answer;
    }

    @Override
    public void doLib(UserInterface ui) {
        answer = ui.promptUser("Please enter a " + type + ": ");
    }
}
