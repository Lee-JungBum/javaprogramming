import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		StringShift ss = new StringShift();
	}
}
class StringShift
{
	
	StringShift()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String a = scanner.nextLine();
		char tmp = 'a';
		char[] array_word = new char[a.length()];
		for(int i = 0;i<a.length();i++)
		{
			array_word[i]=a.charAt(i);
		}
		for(int i = 1;i<=a.length();i++)
		{
			tmp=array_word[0];
			for(int j = 1;j<a.length();j++)
			{
				array_word[j-1]=array_word[j];
			}
			array_word[a.length()-1]=tmp;
			System.out.println(array_word);
		}
		scanner.close();
	}
}