package com.przemek;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("PKO");
        bank.addNewBranch("Bialystok");
        bank.addNewBranch("Warszawa");
        bank.addNewCustomerToBranch("Bialystok","Przemek", 20000);
        bank.addCustomerTransaction("Bialystok","Przemek", 10000);
        bank.addCustomerTransaction("Bialystok","Przemek", 10000);
        bank.addCustomerTransaction("Bialystok","Przemek", 10000);
        bank.addNewCustomerToBranch("Bialystok","Monika", 15000);
        bank.addNewCustomerToBranch("Bialystok","Rafał",150000);
        bank.addNewCustomerToBranch("Warszawa","Kasia", 5000);
        bank.addNewCustomerToBranch("Warszawa","Trzaskowski", 1000000);
        bank.addCustomerTransaction("Warszawa","Trzaskowski",666666);
        bank.addCustomerTransaction("Warszawa","HGW", 888888888);
        bank.printCustomersList("Bialystok",true);
        bank.printCustomersList("Warszawa",true);
    }
}
