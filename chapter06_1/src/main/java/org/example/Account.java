package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public int setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;

        }
        return this.balance;
    }
}
