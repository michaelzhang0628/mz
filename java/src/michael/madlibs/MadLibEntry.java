package michael.madlibs;

public interface MadLibEntry {
    /** @return the value of this entry in a template **/
     public String templateString();
    
    /** @return the value of this entry in an actual madlib **/ 
     public String madLibString();
    
    /**
    * Collect any relevant information from the user for this entry **/
     public void doLib(UserInterface ui);
}
