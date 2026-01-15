package Assignment1;

import java.util.Scanner;

public class stringoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println( "length of the String : " + s.length());
		System.out.println("character at specific index : " + s.charAt(2));
		System.out.println("String is empty or not" + s.isEmpty());
		System.out.println("index of particular character " + s.indexOf('e'));
		System.out.println("s.lastIndexof('e')");
		System.out.println(s.startsWith("app"));
		System.out.println(s.contains("ple"));
	    System.out.println(s.toLowerCase());
	    System.out.println(s.replace('p', 'm'));
	    System.out.println(s.trim());
	    System.out.println(s.substring(2 , 4));
		System.out.println(s.endsWith("le"));
	}

}
