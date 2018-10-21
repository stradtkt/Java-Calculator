package main;

public class Calculator {
	public double answer;
	public String sign;
	public double operatorOne;
	public double operatorTwo;
	
	public Calculator() {
		
	}
	public String getOperation() {
		return sign;
	}
	
	public void setOperation(String sign) {
		if(sign == "+" || sign == "-" || sign == "*" || sign == "/") {
			this.sign = sign;
		} else {
			System.out.println("Sorry invalid input");
		}	
	}
	public double getOperatorOne() {
		return operatorOne;
	}
	public void setOperatorOne(double x) {
		this.operatorOne = x;
	}
	public double getOperatorTwo() {
		return operatorTwo;
	}
	public void setOperatorTwo(double y) {
		this.operatorTwo = y;
	}

	public double calculate() {
		if(sign == "+") {
			answer = getOperatorOne() + getOperatorTwo();
		} else if(sign == "-") {
			answer = getOperatorOne() - getOperatorTwo();
		} else if(sign == "*") {
			answer = getOperatorOne() * getOperatorTwo();
		} else if(sign == "/") {
			answer = getOperatorOne() / getOperatorTwo();
		}
		return answer;
	}
	
	public double getAnswer() {
		return answer;
	}
}