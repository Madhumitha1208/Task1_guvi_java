package Activities;
// Print 10 to 50
public class Exe_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iterating to print 10 to 50
		for (int i = 10; i <= 50; i++) {
			System.out.print(i);
		}
	}

}

//Find positive or negative

import java.util.Scanner;

public class Exe_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// getting input from user
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		// checking condition that the number is greater than zero
		if(a>0) {
			System.out.println("Positive Number");
		//if the condition gets false, then it will check the number is less than zero
		}else if(a<0) {
			System.out.println("Negative Number");
		// if the both condtions are false, then the number is zero
		}else {
			System.out.println("Zero");
		}

	}

}

// Reverse a number

import java.util.Scanner;

public class Exe_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//getting input from user
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int rev = 0;
		// loop condition to reverse a number
		while(a>0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println(rev);
	}
}

//Calculate salary 

import java.util.Scanner;

public class Exe_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Getting input from user
		System.out.println("Enter the salary amount:");
		double amount = sc.nextDouble();
		double discount = 0;
		// checking condition
		if(amount>=500 && amount <= 1000) {
			// calculating discount as 10%
			discount = amount * 0.10;
		}
		//if the above condition is false then it will check this if condition
		else if(amount >= 1000){
			//calculating discount as 20%
			discount = amount * 0.20;
		}
		//calculating final amount
		double finalamount = amount - discount;
		System.out.println("Salary : " +amount);
		System.out.println("Discount : " +discount);
		System.out.println("Final Amount : " +finalamount);
	}

}

//Pattern printing

public class Exe_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new variable and assiging value
		int n = 5;
		// looping for columns
		for (int i = 0; i < 5; i++) {
			//Looping for rows
			for (int j = 0; j < 5; j++) {
				//checking condition if the j is less than i
				if(j<i) {
					System.out.print(n-j);
					//if the condition false, else part will work
			    }else {
				System.out.print(n-i);
			}
		}
			System.out.println();


	}
	}
}
