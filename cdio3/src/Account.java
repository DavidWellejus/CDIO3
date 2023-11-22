class Account {
   private int accountBalance;

   public Account(int amount) {
      this.accountBalance = amount;
   }

   public int getAccountBalance() {
      return this.accountBalance;
   }

   public void addToAccountBalance(int amount) throws IllegalArgumentException {
      if (amount >= 0) {
         this.accountBalance += amount;
      } else {
         throw new IllegalArgumentException("Amount must be equal or greater than 0!");

      }
   }
   public void subtractFromAccountBalance(int amount) throws IllegalArgumentException {
      if (amount >= 0) {
         this.accountBalance -= amount;
      } else {
         throw new IllegalArgumentException("Amount must be equal or greater than 0!");
      }
   }
}
