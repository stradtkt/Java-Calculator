package main;

public class Main {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperation("*");
		c.setOperatorOne(3.33);
		c.setOperatorTwo(3.45);
		c.calculate();
		System.out.println(c.getAnswer());
	}

}