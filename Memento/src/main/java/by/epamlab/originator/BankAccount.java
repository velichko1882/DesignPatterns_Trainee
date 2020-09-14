package by.epamlab.originator;

import by.epamlab.memento.Memento;

public class BankAccount {

    private AccountOwner owner;
    private String accountNumber;
    private int dollarAmount;

    public BankAccount() {
    }

    public BankAccount(AccountOwner owner, String accountNumber, int dollarAmount) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.dollarAmount = dollarAmount;
    }

    public AccountOwner getOwner() {
        return owner;
    }

    public void setOwner(AccountOwner owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDollarAmount() {
        return dollarAmount;
    }

    public void setDollarAmount(int dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    public Memento saveStateToMemento(){
        return new Memento(owner, accountNumber, dollarAmount);
    }

    public void getStateFromMemento(Memento memento){
        owner = memento.getOwner();
        accountNumber = memento.getAccountNumber();
        dollarAmount = memento.getDollarAmount();
    }

    public void topUpAccount(int amount, String signature){
        System.out.println(this);
        Memento memento = saveStateToMemento();
        dollarAmount += amount;
        System.out.println(this);
        if (!owner.getElectronicSignature().equals(signature)){
            System.out.println("Signature is wrong!");
            getStateFromMemento(memento);
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("owner=").append(owner);
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", dollarAmount=").append(dollarAmount);
        sb.append('}');
        return sb.toString();
    }
}
