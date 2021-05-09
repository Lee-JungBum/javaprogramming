import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		System.out.print("곱하고자 하는 두 수 입력>>");
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
		
			
		
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
		}
		catch(InputMismatchException e){
			scanner.nextLine();
			System.out.println("실수는 입력하면 안됩니다.");
			System.out.print("곱하고자 하는 두 수 입력>>");
			continue;
		}
		System.out.println(a+"x"+b+"="+a*b);
		break;
		
		}
		scanner.close();
	}
}