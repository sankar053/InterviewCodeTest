package com.iii.interview;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewCodeTestApplication {

	public static void main(String[] args) {
		// SpringApplication.run(InterviewCodeTestApplication.class, args);
		// prompt for the user's name
		Scanner scanner = new Scanner(System.in);

		System.out.print("Select the problem solution 1 to 10: ");

		// get their input as a String
		Integer selection = scanner.nextInt();

		System.out.println(selection);
		callTheSolution(selection);
	}

	public static void callTheSolution(Integer selection) {
		
		switch(selection){
		
		case 1:
			Solution.problem1();
			break;
		case 2:
			Solution.problem2();
			break;
		case 3:
			Solution.problem3();
			break;
		case 4:
			Solution.problem4();
			break;
		case 5:
			Solution.problem5();
		case 6:
			Solution.problem6();
			break;
		case 10:
			Solution.problem10();
			break;
		}

	}

}
