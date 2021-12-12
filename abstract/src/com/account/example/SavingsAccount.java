package com.account.example;

public class SavingsAccount extends BankAccount {
	 private int minimumbalance = 5000;
	 private int depositupto = 100000;
	
	  @Override
		public void depositr(double amount) {
		  if(amount <depositupto) {
	    		 System.out.println("despoited your amount");
	    	 }
	    	 else {
	    		 System.out.println("error");
	    	 }
	     }
	
	  @Override
	     public void withdraw(double amount) {
		  if(amount >minimumbalance) {
	    		 System.out.println("withdrawed your amount");
	    	 }
	    	 else {
	    		 System.out.println("error");
	    	 }
	     }
}
