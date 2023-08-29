package michael.madlibs;

import java.util.ArrayList;
import java.util.List;

public class MadLib extends MadLibTemplate {
    private List<MadLibEntry> entries = new ArrayList<MadLibEntry>();

    MadLib(String title) {
        super(title);
    }
    
    @ Override
    void addSlot(String type) {
        this.entries.add(new Slot(type));
    }
    
    @ Override
    void addString(String text) {
        this.entries.add(new TextEntry(text));
    }

    @ Override
    void printAsTemplate(UserInterface ui) {
        StringBuilder s = new StringBuilder();
        for (MadLibEntry entry: entries) {
            s.append(entry.templateString());
        }
        ui.writeString(s.toString());
    }

    @Override
    void doLib(UserInterface ui) {
        for (MadLibEntry entry: entries) {
            entry.doLib(ui);
        }
        StringBuilder s = new StringBuilder();
        for (MadLibEntry entry: entries) {
            s.append(entry.madLibString());
        }    
        ui.writeString(s.toString());
    }
}
