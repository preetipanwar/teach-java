package com.teachjava.miniprograms;

public class Account {

// features -
// deposit money in bank
// cash out money from bank
// see bank balance
// transfer money between bank accounts


// field -> balance     - int
    // constructor
    // printBalance()   - void
    // debit()          - int
    // credit()         - int
    // transfer()       - int           -> passing object as variable

    int balance;

    Account(int balance){
        this.balance = balance;
    }

    void printBalance(){
        System.out.println(balance);
    }

    int debit(int amount){
         balance = this.balance - amount;
         printBalance();
         return balance;
    }

    int credit(int amount){
         balance = this.balance + amount;
         printBalance();
         return balance;
    }

    // passing object as a parameter ()
    void transfer(Account account, int amount){
        // currentObject - amount debit
        debit(amount);
        // account - amount credit
        account.credit(amount);
    }

    public static void main(String[] args) {
        Account dad = new Account(50000);
        Account mom = new Account(40000);

//        dad.printBalance();
//        dad.debit(5000);
//        dad.credit(10000);

        dad.transfer(mom, 5000);
    }
}

