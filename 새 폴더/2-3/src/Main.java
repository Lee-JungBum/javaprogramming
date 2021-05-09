import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Input a equation >> ");
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		String b = scanner.next();
		float c = scanner.nextFloat();
		float d;
		switch (b)
		{
		case "+":
			d= a+c;
			System.out.println(a+" + "+c + " = "+d);
			break;
		case "-":
			d= a-c;
			System.out.println(a+" - "+c + " = "+d);
			break;
		case "*":
			d= a*c;
			System.out.println(a+" * "+c + " = "+d);
			break;
		case "/":
			d= a/c;
			if (c==0)
			{
				System.out.println("Can not divide by 0");
				break;
			}
			System.out.println(a+" / "+c + " = "+d);
			break;
		}
      scanner.close();
	}
}