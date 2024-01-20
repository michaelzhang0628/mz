package michael.bank;

public class OverDraftException extends Exception {
   private float amount;
   
   public OverDraftException(float a) {
       this.amount = a;
   }

   public float getAmount() {
       return amount;
   }
}
