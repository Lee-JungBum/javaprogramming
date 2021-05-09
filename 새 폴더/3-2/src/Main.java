import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a;
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
	
		int b =a;
		while(true)
		{
		if (a>0)
		{
			for (int i = 0; i<=a;i++)
			{
				for (int j =b; j>=1; j--) 
				{
					System.out.print("*");
				}
				System.out.println();
				b--;
			}
			break;
		}
		
		else
		{
			System.out.print("잘못 입력했습니다. 정수를 입력하시오>>");
			a = scanner.nextInt();
			b=a;
		}
		}
		scanner.close();
		
	}
}