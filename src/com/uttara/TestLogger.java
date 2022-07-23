package com.uttara;

import java.util.*;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			Logger l = Logger.getInstance();
			
			System.out.println("Enter the message to LOG");
			String message = sc.nextLine();
			//sc.nextLine();
			
			System.out.println("Enter the priority - \n 1. LOW \n 2. MEDIUM \n 3. HIGH \n 4. CRITICAL");
			int priority = sc.nextInt();
			sc.nextLine();
			
			l.log(message,priority);
	}

}
