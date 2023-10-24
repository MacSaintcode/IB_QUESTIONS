package saintcoded;

import java.util.Arrays;
import java.util.InputMismatchException;

public class ipAdd {
	Integer a;

	boolean checkip(String ip) {
		boolean choice = true;

		String address[] = ip.split("\\.");

		String addr = Arrays.toString(address).replaceAll(",", ".").replaceAll(" ", "");

		System.out.println("SEARCHING FOR IP ADDRESS:" + addr);
		int i = 0;

		while (i <= address.length - 1) {

			try {
				if (address[i].equals("")) {
					choice = false;
					break;
				} else if (address[i].length() > 3) {
					choice = false;
					break;
				}

				a = Integer.parseInt(address[i]);
			} catch (NumberFormatException ea) {
				choice = false;
				break;
			}
			if (a.toString().length() <= 3 && address.length == 4)
				choice = true;
			i++;

			if (/* a.toString().length() > 3|| */ address.length != 4 || a > 255 || a < 0 || a.toString().length() == 0
					|| ip.endsWith(".")) {
				choice = false;
				break;
			}
			for (int l = 0; a.toString().length() == l; l++) {
//				String[] spil = address;
				if (address[l].contains("-")) {
					choice = false;
					break;
				}

			}
		}

		if (choice == false /* || ip.endsWith(".") */)

		{
			System.err.println(choice);
			System.err.println("INVALID IP ADDRESS!\n");

		}

		else if (choice == true) {
			System.out.println(choice);
			System.out.println("IP ADDRESS " + addr + " FOUND\n");
		}

		return choice;

	}

	public static void main(String[] args) {
		ipAdd call = new ipAdd();
		String called[] = { "57.78.0.0000", "-0.13.41.158", "22.243.19.000" };
		int i = 0;
		for (String item : called) {
			call.checkip(called[i]);
			i++;

		}

//		System.out.println("MR JIDE SAID \"MR UDOKA CANT HELP/\\ ASSIST HIMSELF\"");
	}
}
