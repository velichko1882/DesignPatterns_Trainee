package by.epamlab.memento;

import by.epamlab.originator.AccountOwner;

public class Memento {

    private AccountOwner owner;
    private String accountNumber;
    private int dollarAmount;

    public Memento(AccountOwner owner, String accountNumber, int dollarAmount) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.dollarAmount = dollarAmount;
    }

    public AccountOwner getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDollarAmount() {
        return dollarAmount;
    }
}
