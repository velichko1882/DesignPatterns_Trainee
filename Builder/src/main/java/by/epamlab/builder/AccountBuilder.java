package by.epamlab.builder;

import by.epamlab.account.Account;
import by.epamlab.account.Gender;

public class AccountBuilder {

    private Gender gender = Gender.MAN;
    private String firstName = "no first name";
    private String lastName = "no last name";
    private int age = 0;
    private String country = "no country";
    private String city = "no city";

    public AccountBuilder buildGender (Gender gender){
        this.gender = gender;
        return this;
    }

    public AccountBuilder buildFirstName (String firstName){
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder buildLastName (String lastName){
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder buildAge (int age){
        this.age = age;
        return this;
    }

    public AccountBuilder buildCountry (String country){
        this.country = country;
        return this;
    }

    public AccountBuilder buildCity (String city){
        this.city = city;
        return this;
    }

    public Account build(){
        Account account = new Account();
        account.setGender(gender);
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setAge(age);
        account.setCountry(country);
        account.setCity(city);
        return account;
    }

}
