import java.util.*;
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
		int count = 0;
		while(true)
		{
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			if(tmp.equals("그만"))
			{
				System.out.println("종료합니다...");
				break;
			}
			String a[] = tmp.split(" ");
			for(int i = 0;i<a.length;i++)
			{
				count++;
			}
			System.out.println("어절 개수는 "+count);
			count = 0;
		}
		scanner.close();
	}
}