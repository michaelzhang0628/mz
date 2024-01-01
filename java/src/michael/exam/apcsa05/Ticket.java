package michael.exam.apcsa05;

public abstract class Ticket {
    private static int sNumber = 0;
    private int serialNumber;
    
    public Ticket() {
        serialNumber = getNextSerialNumber();
    }
    
    public abstract double getPrice();
    
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    // returns a new serial number
    private static int getNextSerialNumber() {
        return ++sNumber;
    }
    
    public int getSerialNumber() {
        return serialNumber;
    }
}
