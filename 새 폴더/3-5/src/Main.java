import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
	
		String tmp = "";
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			int count = -1;
			System.out.print("���� �̸�>>");
			tmp = scanner.next();
			if(tmp.equals("�׸�"))
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
				System.out.println(course[count]+"�� ������ "+score[count]);
			}
			else
			{
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		scanner.close();
	}
			
}