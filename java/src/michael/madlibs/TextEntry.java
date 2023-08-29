package michael.madlibs;

public class TextEntry implements MadLibEntry{
    private String text;
    
    public TextEntry(String text) {
        super();
        this.text = text;
    }

    @Override
    public String templateString() {
        return text;
    }

    @Override
    public String madLibString() {
        return text;
    }

    @Override
    public void doLib(UserInterface ui) {        
    }
}
