package ProcessAName5026211016;

import java.util.Scanner;

public class ProcessAName5026211016 {

	public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);

        System.out.print("Type your name: ");
	  String name = inputName.nextLine();
        
	  int spaceIndex = name.indexOf(' ');
	  System.out.println(spaceIndex);

	  String lastName = name.substring(spaceIndex+1) +',';
	  char firstName = name.charAt(0);
		
	  System.out.println("Your name is: " + lastName + ' ' + firstName + '.');

	}

}