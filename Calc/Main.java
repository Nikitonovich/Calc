package mycalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("������� ������ �����");
			a = sc.nextInt();
			System.out.println("������� ������ �����");
			b = sc.nextInt();
			
			System.out.println("������� ����");
			
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

	


