// Program #2: Array Mod App
package week_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {

	static Scanner inputscanner = new Scanner(System.in);

	public static void main(String[] args) {

//		Initialize/declare variables.
		ArrayList<Integer> userarr = new ArrayList<>();
		ArrayList<String> stringarr = new ArrayList<>();
		char usercmd = 'z';

//		Print welcome/orientation text.
		System.out.print("Welcome to the Array Mod App! This program allows you to manipulate integer data stored in "
				+ "an array. Commands are:\n[a]dd\n[d]elete\n[e]dit\n[s]ort\n[p]rint\ne[x]it\n\n");

//		Run input loop.
		while (!(usercmd == 'x')) {
			System.out.print("Enter command: ");
			usercmd = inputscanner.next().toLowerCase().charAt(0);
			if (usercmd == 'a') {
				if (userarr.toArray().length < 21) {
					System.out.print("Add what integer?: ");
					userarr.add(inputscanner.nextInt());
					System.out.println("Element added to array.");
				} else {
					System.out.println("Array limit of 20 elements has been reached.");
				}
			} else if (usercmd == 'd') {
				System.out.print("Delete element at what index?: ");
				userarr.remove(inputscanner.nextInt());
				System.out.println("Element deleted from array.");
			} else if (usercmd == 'e') {
				System.out.print("Edit element at what index?: ");
				int editind = inputscanner.nextInt();
				System.out.print("Replace with what?: ");
				userarr.set(editind, inputscanner.nextInt());
				System.out.println("Element updated.");
			} else if (usercmd == 'p') {
				if (userarr.toArray().length == 0) {
					System.out.println("(Empty array)");
				} else {
					for (int ind = 0; ind < userarr.toArray().length; ind++) {
						stringarr.add(userarr.get(ind).toString());
					}
					System.out.println(String.join(", ", stringarr));
					stringarr.clear();
				}
			} else if (usercmd == 's') {
				userarr.sort(null);
				System.out.println("Array sorted.");
			} else if (!(usercmd == 'x')) {
				System.out.print("Invalid input. Please enter a valid command: ");
				usercmd = inputscanner.next().charAt(0);
			}
		}

//		End program. Used to keep window open when run from CLI.
		System.out.println("\n\nProgram finished. Press [enter] to close.");
		inputscanner.next();
	}
}