package by.epamlab;

import by.epamlab.originator.AccountOwner;
import by.epamlab.originator.BankAccount;

public class Runner {

    public static void main(String[] args) {

        AccountOwner owner = new AccountOwner("John", "Simpson", 12345, "BY12345");
        BankAccount bankAccount = new BankAccount(owner, "BY98765", 1000);
        bankAccount.topUpAccount(100, "BY12345");
        bankAccount.topUpAccount(500,"BY123");
    }
}
