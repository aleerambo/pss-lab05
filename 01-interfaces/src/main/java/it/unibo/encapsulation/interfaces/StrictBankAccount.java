package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    double balance;
    int transactions;
    static double ATM_TRANSACTION_FEE = 0.1;
    static double ACCOUNT_FEE = 5;
    private final int id;

    public StrictBankAccount(final int id, final double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void withdraw(int id, double amount){
        if(this.id == id){
            if(this.balance > amount){
                this.transactions += 1;
                this.balance -= amount;
            }
            else{
                System.out.println("Saldo disponibile insufficiente.");
            }
        }
        else{
            System.out.println("Operazione non autorizzata: l'ID utente NON corrisponde.");
        }
    }

    public void deposit(int id, double amount){
        if(this.id == id){
            this.transactions += 1;
            this.balance += amount;
        }
        else{
            System.out.println("Operazione non autorizzata: l'ID utente NON corrisponde.");
        }

    }

    public void depositFromATM(int id, double amount){
        if(this.id == id){
            this.transactions += 1;
            this.balance = this.balance + amount - ATM_TRANSACTION_FEE;
        }
        else{
            System.out.println("Operazione non autorizzata: l'ID utente NON corrisponde.");
        }
    }

    public void withdrawFromATM(int id, double amount){
        if(this.id == id){
            if(this.balance > amount){
                this.transactions += 1;
                this.balance = this.balance - amount - ATM_TRANSACTION_FEE;
            }
            else{
                System.out.println("Saldo disponibile insufficiente.");
            }
        }
        else{
            System.out.println("Operazione non autorizzata: l'ID utente NON corrisponde.");
        }
    }

    /*
     * This method is used to charge the management fees on the account balance
     * (they are computed every few months). This method does not return the amount
     * computed, it directly collects the amount from the balance.
     */
    public void chargeManagementFees(int id){
        this.balance = this.balance - ACCOUNT_FEE - (ATM_TRANSACTION_FEE*getTransactionsCount());
    }
}
