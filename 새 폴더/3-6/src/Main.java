import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
		
			
		
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
		}
		catch(InputMismatchException e){
			scanner.nextLine();
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			continue;
		}
		System.out.println(a+"x"+b+"="+a*b);
		break;
		
		}
		scanner.close();
	}
}