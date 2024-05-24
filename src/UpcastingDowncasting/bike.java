package UpcastingDowncasting;

public class bike extends Veichle {
	void print() {
		System.out.println("bike running");

	}

	void horn() {
		System.out.println("bike horn");

	}

	public static void main(String[] args) {
		bike bike = new bike();
		bike.print();//bike
		Veichle veichle = new bike();
		veichle.print();
		

	}
}
