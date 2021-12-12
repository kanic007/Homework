package com.account.example;
import java.util.Scanner;
public class Application {
      
	static String dep = "deposite";
	static String cst = "BusinessAccount";
	public static void main(String[] args) {
		
		BankAccount obj1 = new BusinessAccount();
		BankAccount obj2 = new SavingsAccount();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the deposite or widthdward");
		 String name = sc.next();
		 
		 System.out.println("enter the customer type");
		 String customerType = sc.next();
		 
		 System.out.println("enter the amount");
		 int amount = sc.nextInt();
		 
		 
		 if(name.equals(dep)){
			 if(customerType.equals(cst)) {
				 obj1.depositr(amount);
			 }
			 else {
				 obj2.depositr(amount);
			 }
		    }
		 else{
			 if(customerType.equals(cst)) {
				 obj1.withdraw(amount);
			 }
			 else {
				 obj2.withdraw(amount);
			 }
		 }
		
	}

}
