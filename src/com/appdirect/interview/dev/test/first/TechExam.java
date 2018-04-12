package com.appdirect.interview.dev.test.first;

import java.util.Arrays;
import java.util.Comparator;

public class TechExam {

	public static void main(String[] args) {

		P x = new Q();
		Q y = new Q();
		P z = new Q();
		x.f(1);
		((P) y).f(1);
		z.f(1);
	}

}

class P {
	void f(int i) {
		System.out.println(i);
	}
}

class Q extends P {
	void f(int i) {
		System.out.println(2 * i);
	}
}

class Hotel {
	public int bookings = 2;

	public void book() {
		bookings++;
	}
}

class SuperHotel extends Hotel {
	public void book() {
		bookings--;
	}

	public void book(int size) {
		book();
		super.book();
		bookings += size;
	}

	public static void main(String args[]) {
		SuperHotel shotel = new SuperHotel();
		shotel.book(2);
		System.out.print(shotel.bookings);
	}
}

class Sort implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}

class SortTestClass {
	public static void main(String[] args) {
		Integer intArray[] = { 2, 3, 1 };
		Arrays.sort(intArray, new Sort());
		for (Integer i : intArray) {
			System.out.print(i + " ");
		}
	}
}

class Book<T> { // Line 1
	// private static T book; //Line 2
}

class InstanceTester {
	public static void main(String... str) {
		Book<Integer> bookInt = new Book<Integer>(); // Line 3
		Book<Boolean> bookBool = new Book<Boolean>(); // Line 4
		System.out.println("Objects Created Successfully");
	}
}