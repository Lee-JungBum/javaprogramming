import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a;
		System.out.print("������ �Է��Ͻÿ�>>");
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
			System.out.print("�߸� �Է��߽��ϴ�. ������ �Է��Ͻÿ�>>");
			a = scanner.nextInt();
			b=a;
		}
		}
		scanner.close();
		
	}
}