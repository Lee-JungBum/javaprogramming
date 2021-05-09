import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
	
		String tmp = "";
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			int count = -1;
			System.out.print("과목 이름>>");
			tmp = scanner.next();
			if(tmp.equals("그만"))
			{
				break;
			}
			for (int i = 0;i<=4;i++)
			{
				if(tmp.equals(course[i]))
				{
					count =i;
				}
				
			}
			if(count !=-1)
			{
				System.out.println(course[count]+"의 점수는 "+score[count]);
			}
			else
			{
				System.out.println("없는 과목입니다.");
			}
			
		}
		scanner.close();
	}
			
}