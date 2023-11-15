package group2.cdio3;
class Account {
   private int accountBalance;

   public Account(int amount) {
      this.accountBalance = amount;
   }

   public int getAccountBalance() {
      return this.accountBalance;
   }

   public void addToAccountBlalance(int amount){
      this.accountBalance += amount;
   }

}
