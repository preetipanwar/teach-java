package com.teachjava.topics;

// using object as parameter
//method(parameter){
//}

// features -
// deposit money in bank
// cash out money from bank
// see bank balance
// transfer money between bank accounts

public class Account {

    // field -> balance
    // constructor
    // printBalance() - void
    // debit() - int
    // credit() - int
    // transaction() - int // parameter as object

    int balance;

    Account(int balance){
        this.balance = balance;
    }

    void printBalance(){
        System.out.println(balance);
    }

    int debit(int amount){
         balance = balance - amount;
         printBalance();
         return balance;
    }

    int credit(int amount){
        balance = balance + amount;
        printBalance();
        return balance;
    }

    // parameter as object
    int transfer(Account person, int amount){
        // balance deduct
        balance = balance - amount;
        // balance transfer : balance add
        person.balance = person.balance + amount;
        return balance;
    }

    // testing ...
    public static void main(String[] args) {
        // mom object
        Account mom = new Account(50000);
        // dad object
        Account dad = new Account(40000);

        mom.printBalance();   // initial balance
        mom.debit(5000);
        mom.credit(10000);

        dad.printBalance();
        dad.credit(50000);
        dad.debit(40000);


        mom.transfer(dad, 50000);
        mom.printBalance();
        dad.printBalance();

    }

}
