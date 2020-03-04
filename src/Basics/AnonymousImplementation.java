package Basics;

import java.util.Comparator;

public class AnonymousImplementation {
	//Anonymous implementation of interface before lambda

	public static void main(String[] args) {

		//Before Lambda
		Comparator<String> stringComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		int comparison =  stringComparator.compare("hello", "world");
		System.out.println("Before Lambda");
		System.out.println(comparison);


		//After Lambda

//		Comparator<String> stringComparatorLambda =
//				(String o1, String o2) -> {return o1.compareTo(o2); };
//
		//Lambda Simplified
		Comparator<String> stringComparatorLambda =
				(o1, o2) -> o1.compareTo(o2);

		int lambdaCompare = stringComparatorLambda.compare("hello", "world");
		System.out.println("After Lambda");
		System.out.println(lambdaCompare);

		//Using lambda against a method with no parameters

//		System.out.println("No params");
//		MyFunction myFunction = () -> {
//			System.out.println("Hello World");
//		};

		// one param
//		System.out.println("One param");
//		MyFunction myFunction = text -> System.out.println(text);
//
//		myFunction.applyWithParams("Hello World");

		//Multiple params
//		System.out.println("Multiple params");
//		MyFunction myFunction = (text1, text2) -> System.out.println(text1 + text2);
//
//		myFunction.applyWithParams("Hello World ", "Hows it going?");

		//Return String
		System.out.println("Return String params");
		MyFunction myFunction = (text1, text2) -> {
			System.out.println(text1 + text2);
			return text1 + " + " + text2;
		};

		String returnValue = myFunction.applyWithParams("Hello World ", "Hows it going?");
		System.out.println(returnValue);

		MyFunction myFunction2 = myFunction;
		String returnValue2 = myFunction2.applyWithParams("Text 1", "Text 2");
		System.out.println(returnValue2);


	}

}
