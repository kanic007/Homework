package com.account.example;

public class BusinessAccount extends BankAccount {
 private int minimumbalance = 25000;
 private int depositupto = 10000000;
	
  //   @Override
	public void depositr(double amount) {
    	 if(amount <depositupto) {
    		 System.out.println("despoited your amount");
    	 }
    	 else {
    		 System.out.println("error");
    	 }
     }
     
  //   @Override
     public void withdraw(double amount) {
    	 if(amount >minimumbalance) {
    		 System.out.println("withdrawed your amount");
    	 }
    	 else {
    		 System.out.println("error");
    	 }
     }
}
