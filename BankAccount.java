

public  class BankAccount {
    private double Balance;

    public BankAccount() {
    }

    public BankAccount(double Balance) {
        this.Balance = Balance;
    }

    public double Deposit(double Amount) {
        if (Amount < 5000) {
            Balance = Balance + Amount;
        } else {
            System.out.println("Transaction cancelled. Max deposit-5000| Your deposit:" + Amount);
        }
        return Balance;
    }

    public double Withdraw(double Amount) {
        if (Balance > Amount) {
            Balance = Balance - Amount;
        } else {
            System.out.println("Insufficient Fund");
        }
        return Balance;
    }

    public void printBalance() {
        System.out.println("Current Balance is" + Balance);
    }

    public void TransferBalance(BankAccount To, double Amount) {
        if (this.Balance > Amount) {
            this.Balance = Balance - Amount;
            To.Balance = To.Balance + Amount;
        } else {
            System.out.println("Transfer cancelled.You are trying to transfer" + Amount + "but only" + Balance + "available.");
        }

    }
}



