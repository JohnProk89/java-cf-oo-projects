package ch13apis.bankapp;

import ch13apis.bankapp.model.JointAccount;
import ch13apis.bankapp.model.OverDraftAccount;

public class Main {

    public static void main(String[] args) {
        OverDraftAccount overDraftAccount = new OverDraftAccount(
                1, "GR12345678910", "Giannis", "Prokopiou", "123456789", 0.0);
        JointAccount jointAccount = new JointAccount(
                2, "GR12345678911", "Giannis", "Prokopiou",
                "123456789", "Ioannis", "Prokopiou", "234567891", 0.0
        );
       try {
           overDraftAccount.deposit(1000.0);
           overDraftAccount.withdraw(2000.0, "123456789");
           System.out.println("Current balance in account with iban: " + overDraftAccount.getIban() +
                   " -> " + overDraftAccount.getBalance());
           jointAccount.deposit(1000.0);
           jointAccount.withdraw(100.0, "123456789");
           jointAccount.withdraw(200.0, "234567891");
           System.out.println("Current balance in account with iban: " + jointAccount.getIban() +
                   " -> " + jointAccount.getBalance());
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
    }
}
