import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String a;
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		a = scanner.next();
		char b = a.charAt(0);
		char c = b;
		while(true)
		{
		if (b>='a'&&b<='z')
		{
			for (char i = c;i>='a';i--)
			{
				for (char j = 'a'; j<=b;j++)
				{
					System.out.print(j);
				}
				System.out.println();
				b--;
			}
			break;
		}
		
		else
		{
			System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է��Ͻÿ�>>");
			a = scanner.next();
			b=a.charAt(0);
			c=b;
		}
		}
		scanner.close();
		
	}
}