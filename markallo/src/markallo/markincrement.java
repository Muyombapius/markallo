package markallo;

import java.util.Scanner;

public class markincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=49;
		System.out.println("Enter marks recieved:");
		int mark=input.nextInt();
		while( mark==i) {
			++i;
			System.out.println(i);
			break;
			}
		
		
	}
	}


