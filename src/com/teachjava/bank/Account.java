package com.teachjava.bank;

public class Account {

    // properties
    int balance;

    // constructor method
    public Account(int balance){
        this.balance = balance;     // initialize
    }

    // print balance | instance method
    public void printBalance(){
         System.out.println(balance);
    }

    // credit() - add money
    public int credit(int amount){
        return balance = balance + amount;
    }

    // debit() - deduct money
    public int debit(int amount){
        return balance = balance - amount;
    }

    // transfer amount from one account to another


    public static void main(String[] args) {
        // object --> new bank account

        // Dad bank account
        Account dad = new Account(30000);
        // Mom bank account
        Account mom = new Account(40000);

        dad.credit(5000);

        // object.method()
        dad.printBalance();
        mom.printBalance();

        // object reference variable
        //        Superhero shaktiman = new Superhero();
        //        Superhero gangadhar = shaktiman;
        //
        //        gangadhar.eat();
        //        shaktiman.eat();

        // gangadhar - shaktiman  --> object


        // accessing static properties/variable
        // System.out.println(Account.interestRate);
    }

}
