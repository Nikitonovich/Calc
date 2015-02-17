package mycalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("¬ведите первое число");
			a = sc.nextInt();
			System.out.println("¬ведите второе число");
			b = sc.nextInt();
			
			System.out.println("¬ведите знак");
			
			String str = sc.next();
			
			if(str.equals("+")){
				System.out.println(a+b);
			}
			else if(str.equals("-")){
				System.out.println(Math.subtractExact(a, b));
			}
			else if(str.equals("*")){
				System.out.println(Math.multiplyExact(a, b));
			}
			else if(str.equals("/")){
				System.out.println(a/b);
				
				sc.close();
			}
		}

	}

	


