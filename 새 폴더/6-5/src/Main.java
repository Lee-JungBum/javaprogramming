import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		change c = new change();
		
	}
	
}
class change
{
	private String save;
	private String change;
	private StringBuffer sb;
	change()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		save = scanner.nextLine();
		sb=new StringBuffer(save);
		while (true)
		{
			System.out.print("명령: ");
			change = scanner.next();
			if(change.equals("그만"))
			{
				System.out.println("종료합니다.");
				break;
			}
			String token[] = change.split("!");
			if(token.length<2)
			{
				System.out.println("잘못된 명령입니다!");
			}
			else if(token[0].length()==0||token[1].length()==0)
			{
				System.out.println("찾을 수 없습니다!");
			}
			else
			{
				int i = sb.indexOf(token[0]);
				if(i==-1)
				{
					System.out.println("찾을 수 없습니다!");
				
				}
				else
				{
					sb.replace(i, i+token[0].length(),token[1]);
					System.out.println(sb.toString());
				}
			}
			
			
		}
	}
	
}