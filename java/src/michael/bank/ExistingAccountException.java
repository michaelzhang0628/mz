package michael.bank;

public class ExistingAccountException extends Exception {
    private String owner;
    private String type;
    
    public ExistingAccountException(String o, String t) {
        this.owner = o;
        this.type = t;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String getType() {
        return type;
    }
}
