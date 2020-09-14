package by.epamlab;

import by.epamlab.account.Account;
import by.epamlab.account.Gender;
import by.epamlab.builder.AccountBuilder;

public class Runner {

    public static void main(String[] args) {

        Account account = new AccountBuilder()
                .buildGender(Gender.MAN)
                .buildFirstName("John")
                .buildLastName("Simpson")
                .buildAge(25)
                .buildCountry("USA")
                .buildCity("New York")
                .build();
        System.out.println(account);

        Account account1 = new AccountBuilder()
                .buildGender(Gender.WOMAN)
                .buildFirstName("Katty")
                .buildLastName("Jonson")
                .build();
        System.out.println(account1);
    }
}
