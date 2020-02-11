package consolecalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) {
		
		calc calc = new calc();
		double a = 0;
		double b = 0;
		String sign = "";
		double result = 0;
		
		System.out.println("welcome to the calculator!!!");

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("please enter first No. :- ");
			a = Double.parseDouble(reader.readLine());
			System.out.println("please enter second No. :- ");
			b = Double.parseDouble(reader.readLine());
			System.out.println("please enter operator");
			System.out.println("options:- +, -, *, / ");
			sign = reader.readLine();

		} catch (NumberFormatException e) {
			System.out.println("This is not a number!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading your input!!!");
			e.printStackTrace();
		}
		
		switch(sign){
		case "+":
			result = calc.add(a, b);
			System.out.println("result is :-");
			System.out.println(result);
			break;
		case "-":
			result = calc.substract(a, b);
			System.out.println("result is :-");
			System.out.println(result);
			break;
		case "*":
			result = calc.multiply(a, b);
			System.out.println("result is :-");
			System.out.println(result);
			break;
		case "/":
			result = calc.devide(a, b);
			System.out.println("result is :-");
			System.out.println(result);
			break;
		default:
			System.out.println("wrong sign");
		}
		
	}

}
