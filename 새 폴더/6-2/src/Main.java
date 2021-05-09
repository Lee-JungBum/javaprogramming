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
			if(tmp.equals("그만"))
			{
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(tmp, " ");
			System.out.println("어절 개수는 "+st.countTokens());
		}
		scanner.close();
	}
}