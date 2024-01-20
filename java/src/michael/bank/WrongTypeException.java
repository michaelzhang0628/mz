package michael.bank;

public class WrongTypeException extends Exception {
    private String type;
    
    public WrongTypeException(String t) {
        this.type = t;
    }
    
    public String getType() {
        return type;
    }
}
