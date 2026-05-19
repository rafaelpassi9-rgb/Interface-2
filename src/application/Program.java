package application;

import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p1 = new ConcretePrinter("1048");
		p1.processDoc("My Letter");
		p1.print("My Letter");

		ConcreteScanner s = new ConcreteScanner("2023");
		s.processDoc("My E-mail");
		System.out.println("Scan result: " + s.scan());
	}
}
