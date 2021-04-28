package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(20000);
        System.out.println("У вас на карте = " + bankAccount.getAmount());

        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }


        }
        bankAccount.amount =- bankAccount.getAmount();
        System.out.println("Вы сняли оставшуюся сумму " + bankAccount.amount);
    }
}

