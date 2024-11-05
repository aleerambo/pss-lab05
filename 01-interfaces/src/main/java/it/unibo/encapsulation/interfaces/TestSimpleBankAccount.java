package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder accountHolderAndreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder accountHolderAlexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount AndreaRossi = new SimpleBankAccount(accountHolderAndreaRossi.getUserID(), 0);
        SimpleBankAccount AlexBianchi = new SimpleBankAccount(accountHolderAlexBianchi.getUserID(), 0);

        // 4) Effettuare una serie di depositi e prelievi
        AndreaRossi.deposit(accountHolderAndreaRossi.getUserID(), 200); //200
        AlexBianchi.deposit(accountHolderAlexBianchi.getUserID(), 500); //500

        AndreaRossi.depositFromATM(accountHolderAndreaRossi.getUserID(), 100);  //300
        AlexBianchi.depositFromATM(accountHolderAlexBianchi.getUserID(), 10);   //510

        AndreaRossi.withdraw(accountHolderAndreaRossi.getUserID(),  99);    //200
        AlexBianchi.withdraw(accountHolderAlexBianchi.getUserID(),  9); //500

        AndreaRossi.withdrawFromATM(accountHolderAndreaRossi.getUserID(), 99);  //100
        AlexBianchi.withdrawFromATM(accountHolderAlexBianchi.getUserID(), 99);  //400

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        AndreaRossi.getBalance();   //100
        AlexBianchi.getBalance();   //400

        // 6) Provare a prelevare fornendo un id utente sbagliato
        AlexBianchi.withdraw(accountHolderAndreaRossi.getUserID(), 10); //Stampa di errore

        // 7) Controllare nuovamente l'ammontare
        AndreaRossi.getBalance();   //100
        AlexBianchi.getBalance();   //400
    }
}
