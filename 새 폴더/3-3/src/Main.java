import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String a;
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
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
			System.out.print("잘못 입력했습니다. 다시 입력하시오>>");
			a = scanner.next();
			b=a.charAt(0);
			c=b;
		}
		}
		scanner.close();
		
	}
}