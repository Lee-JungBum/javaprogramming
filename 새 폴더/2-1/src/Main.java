import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Input 3 integer values>> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if ((a+b>c)&&(a+c>b)&&(b+c>a)){System.out.println("Yes, this is a triangle.");}
		else{System.out.println("No, this is NOT a triangle.");}
      	scanner.close();
	}
}