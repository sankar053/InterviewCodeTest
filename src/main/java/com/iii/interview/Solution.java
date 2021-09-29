/**
 * 
 */
package com.iii.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author admin
 *
 */
public class Solution {

	private static Scanner scanner = new Scanner(System.in);

	public static void problem1() {

		System.out.print("Problem Statement : write a program  which takes a string str as parameter and returns true"
				+ " if it equals to &quot;Hello World&quot;,\r\n" + "false otherwise.\n ");

		System.out.print("Enter your String Input: ");
		// get their input as a String
		String selection = scanner.nextLine();
		System.out.println("Hello World".equalsIgnoreCase(selection));

		System.exit(1);

	}

	public static void problem2() {

		System.out.print("write a program to check if given String is Palindrome?. \n ");

		System.out.print("Enter your String Input: ");
		// get their input as a String
		String selection = scanner.nextLine();

		System.out.println("Palindrome :" + IntStream.range(0, selection.length() / 2)
				.noneMatch(i -> selection.charAt(i) != selection.charAt(selection.length() - i - 1)));

		System.exit(1);

	}

	public static void problem3() {

		System.out.print("write a program to to reverse a singly linked list without recursion?. \n ");

		SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
		SinglyLinkedList linkedlist = new SinglyLinkedList(head);
		linkedlist.add(new SinglyLinkedList.Node(2));
		linkedlist.add(new SinglyLinkedList.Node(3));
		linkedlist.print();
		linkedlist.reverse();
		linkedlist.print();
		System.exit(1);

	}

	public static void problem4() {

		System.out.print(
				"&quot;can you count the number of times a word has been repated in the given string &quot;This this program\r\n"
						+ "doen by you is a good program&quot. \n ");

		System.out.print("Enter your String Input: ");
		// get their input as a String
		Map<String, Integer> duplicate = new HashMap<>();
		String selection = scanner.nextLine();
		List<String> stingList = Arrays.asList(selection.split(" "));
		stingList.stream().forEach(a -> {

			if (duplicate.get(a) != null) {
				Integer val = duplicate.get(a);
				duplicate.put(a, val + 1);
			} else {
				duplicate.put(a, 1);
			}

		});
		duplicate.entrySet().stream().forEach(a -> System.out.print(a.getKey() + "==>" + a.getValue()));
		System.exit(1);

	}

	public static void problem5() {

		System.out.print("Write a program to reverse a given String using recursion? \n ");

		System.out.print("Enter your String Input: ");
		// get their input as a String

		String selection = scanner.nextLine();
		reverse(selection);
		System.exit(1);

	}

	public static void reverse(String str) {

		if (str == null||str.length()<1)
			System.out.println("");
		else {
			System.out.print(str.charAt(str.length() - 1));

		reverse(str.substring(0, str.length() - 1));
		}

	}
	
	public static void problem6() {

		System.out.print("Write a program to swap the values of two numeric variables without using any other variables? \n ");

		System.out.print("Enter your  Input1: ");
		// get their input as a String

		int in1 = scanner.nextInt();
		
		System.out.print("Enter your  Input2: ");
		// get their input as a String

		int in2 = scanner.nextInt();
		
		System.out.println("Before Sweap -->\n"+"Input1 :"+in1 +"\nInput2 :"+in2);
		in1=in1+in2;  //5+7=12
		in2=in1-in2;   //12-7=5
		in1=in1-in2;   //12-5=7
		
		System.out.println("Before Sweap -->\n"+"Input1 :"+in1 +"\nInput2 :"+in2);
		System.exit(1);
	}
	
	

	public static void problem10() {

		System.out.print("There is an arrayList of employees with EmpID, EmpName, EmpSal. Write a program to print all employees having salary greater than 50000. \n ");

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Amit", 55000));
		empList.add(new Employee(102, "Manish", 34000));
		empList.add(new Employee(103, "Lokesh", 100000));
		empList.add(new Employee(104, "Krishna", 17000));
		empList.add(new Employee(105, "Sriram", 90000));
		
		
		
		
	

		System.out.println("original List:");
		empList.stream().forEach(a-> System.out.println(a.getName()));
		System.out.println("filtered List by salary greater than 50000:");
				empList.stream().filter(a->a.getSalary()>50000).forEach(a-> System.out.println(a.getName()));
				System.exit(1);	
	
	}

}
