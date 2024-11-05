package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder accountHolderAndreaRossi = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder accountHolderAlexBianchi = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount accountRossi = new SimpleBankAccount(accountHolderAndreaRossi.getUserID(), 0);
        BankAccount accountBianchi = new StrictBankAccount(accountHolderAlexBianchi.getUserID(), 0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        accountRossi.deposit(accountHolderAndreaRossi.getUserID(), 10000);
        accountBianchi.deposit(accountHolderAlexBianchi.getUserID(), 10000);
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
        accountRossi.withdraw(accountHolderAndreaRossi.getUserID(), 15000);
        accountBianchi.withdraw(accountHolderAlexBianchi.getUserID(), 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println("Saldo Rossi: " + accountRossi.getBalance());
        System.out.println("Saldo Bianchi: " + accountBianchi.getBalance());
        /*
         * 8) Qual è il risultato e perché?
         */

         //Il risultato dovrebbe essere:
         //Andrea: -5000€
         //Alex: 10000€
        
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        accountRossi.deposit(accountHolderAndreaRossi.getUserID(), 10000);
        accountBianchi.deposit(accountHolderAlexBianchi.getUserID(), 10000);
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        accountRossi.chargeManagementFees(accountHolderAndreaRossi.getUserID());
        accountBianchi.chargeManagementFees(accountHolderAlexBianchi.getUserID());
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println("Saldo Rossi: " + accountRossi.getBalance());
        System.out.println("Saldo Bianchi: " + accountBianchi.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         */
        
         //Il risultato dovrebbe essere:
         //Andrea: 5000€
         //Alex: 19994.8€
    }
}
