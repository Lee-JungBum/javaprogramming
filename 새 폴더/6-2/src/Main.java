import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)
	{
		Stk stk = new Stk();
	}
}
class Stk
{
	
	Stk()
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			if(tmp.equals("�׸�"))
			{
				System.out.println("�����մϴ�...");
				break;
			}
			StringTokenizer st = new StringTokenizer(tmp, " ");
			System.out.println("���� ������ "+st.countTokens());
		}
		scanner.close();
	}
}