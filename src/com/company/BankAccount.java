package com.company;

public class BankAccount {

    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount > sum) {
            System.out.println("Снято со счёта : " + sum);
            System.out.println("Остаток на счету :" + (amount -= sum));
        } else {
            throw new LimitException("У вас не осталось денег на счету!" );
        }
    }
}
