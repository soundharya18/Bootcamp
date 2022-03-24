
class user extends BankAccount {
    public static void main(String[] args) {
        BankAccount Account = new BankAccount(2000.00);
        BankAccount Account2 = new BankAccount(1200.00);

        Account.Withdraw(3000.00);
        Account2.Deposit(6000.00);
        Account.TransferBalance(Account2, 3000.00);
    }
}

