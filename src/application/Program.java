package application;

import model.entities.Printer;
import model.entities.Scanner;

public class Program {

	public static void main(String[] args) {

		Printer p1 = new Printer("1048");
		p1.processDoc("My Letter");
		p1.print("My Letter");

		Scanner s = new Scanner("2023");
		s.processDoc("My E-mail");
		System.out.println("Scan result: " + s.scan());
	}
}
