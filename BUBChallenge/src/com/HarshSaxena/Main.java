package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("State Bank of India");

       if(bank.addBranch("Mumbai")) {
           System.out.println("Mumbai branch added");
       }

        bank.addCustomer("Mumbai", "Harsh", 50.05);
        bank.addCustomer("Mumbai", "Vishal", 175.34);
        bank.addCustomer("Mumbai", "Mehul", 220.12);

        bank.addBranch("Delhi");
        bank.addCustomer("Delhi", "Vivek", 150.54);

        bank.addCustomerTransactions("Mumbai", "Harsh", 44.22);
        bank.addCustomerTransactions("Mumbai", "Harsh", 12.44);
        bank.addCustomerTransactions("Mumbai", "Vishal",  1.65);

        bank.listCustomers("Mumbai", true);
        bank.listCustomers("Delhi", true);

        bank.addBranch("Jaipur");

        if(!bank.addCustomer("Jaipur", "Nikhil", 5.56)){
            System.out.println("Error - Jaipur branch does not exists");
        }

        if(!bank.addBranch("Mumbai")){
            System.out.println("Mumbai branch already exists");
        }
        if(!bank.addCustomerTransactions("Mumbai", "Singh", 56.78)){
            System.out.println("Customer does not exists");
        }
        if(!bank.addCustomerTransactions("Mumbai", "harsh", 34.78)){
            System.out.println("Customer Harsh already exits,");
        }
    }
}
