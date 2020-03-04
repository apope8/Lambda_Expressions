package Functional_Interfaces;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyInterfaceImpl {

	public static void main(String[] args) throws IOException {

		//Java lambda expression can implement interfaces with
		//a single unimplemented method (abstract method),
		//but as many default or static methods as you like.

		MyInterface myInterface = (String text) -> {
			System.out.println(text);
		};

		myInterface.printIt("Hello World");

		myInterface.printUtf8To("Hello File Again", new FileOutputStream("data.txt"));

		MyInterface.printItToSystemOut("Hello Out");

	}

}
