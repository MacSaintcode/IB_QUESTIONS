package saintcoded;

import java.util.InputMismatchException;

//import java.util.InputMismatchException;
//import java.util.Scanner;

public class errors {

	void error() {
		System.out.println("Hello");
		throw new ArithmeticException("Eniola is SMART");

	}

	public static void main(String[] args)
	/*
	 * throws InterruptedException this informs the method that there MIGHT be an
	 * error
	 */
	{
		
		
		
//		try {
//			errors call = new errors();
//			try {
//			System.out.println(1);
//				call.error();
//				System.out.println(2);
//				
//			} catch (ArithmeticException ae) {
//				System.out.println("ArithmeticException ex");
//				throw ae;
//			}
//			System.out.println();
//			System.out.println(3);
//		} catch (ArithmeticException ea) {
//			System.out.println("ArithmeticException excepion "+ea.getMessage());
//			ea.printStackTrace();
//
//		}
//		System.out.println(4);

//		System.out.println("start");
//		try {
//		Thread.sleep(3000);
//		}catch(InterruptedException ae)
//		
//		{

//		}
//		System.out.println("end");

//		int i = 0;
//		int arr[] = { 2, 4, 6, 7, 9, 0 };
//		String ip = "3.o.243.455";
//		String address[] = ip.split("\\.");
//
//		while (i <= 0) {
//
//			try  {
//				Scanner scan = new Scanner(System.in);
//						
//				System.out.print("CALL INDEX: ");
//				int l = scan.nextInt();
//
//				int a = Integer.parseInt(address[l]);
//				System.out.println(a+" is a index "+l);
//				// throw used to intentionally throw an error 
//
//				System.out.print("CALL INDEX: ");
//				int input2 = scan.nextInt();
//				int arrcall = arr[input2];
//				System.out.println(arrcall+" is a index "+input2);
//
//				System.out.print("INPUT A NUMBER: ");
//				int input = scan.nextInt();
//				System.out.print("INPUT ANODA NUMBER: ");
//				int input1 = scan.nextInt();
//				System.out.println(input / input1);
//
//				i++;
//			} catch (ArithmeticException ae) {
//				System.out.println("Message: " + ae.getMessage());
//				System.out.println("Run again!");
//			} catch (InputMismatchException aem) {
//				System.out.println("Message:" + " CANT INPUT STRING FOR INT" /* aem.getMessage() */);
//				System.out.println("Run again!");
//			} catch (ArrayIndexOutOfBoundsException ac) {
//				System.out.println("Message:" + ac.getMessage());
//				System.out.println("Run again!");
//			} catch (NumberFormatException ag) {
//				System.out.println("Message:" + ag.getMessage());
//				System.out.println("Run again!");
//			} finally {
//				System.out.println("YOU JUST RAN THE CODE!");
//
//			}
//		}
	}

}