import java.util.Scanner;

public class Main{
  public static void main(String [] arg) {
      DicApp dicapp = new DicApp();
      dicapp.search();
  }
}
class Dictionary 
{
  private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���" };
  private static String [] eng = {"love", "baby", "money", "future", "hope"};
  public static String kor2Eng(String word)
  {  
	  for(int i=0; i<kor.length; i++) 
	  {
		if(word.equals(kor[i]))
		{
			return eng[i];
		}
	  }
	  return "";
  }
}
class DicApp{
	Scanner scanner = new Scanner(System.in);
	String word;
	DicApp()
	{
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
	}
	public void search()
	{
		while(true)
		{
			System.out.print("�ѱ� �ܾ�?");
			word=scanner.next();
			if (word.equals("�׸�"))
			{
				break;
			}
			else if (Dictionary.kor2Eng(word).equals(""))
			{
				System.out.println(word+ "�� ���� ������ �����ϴ�.");
			}
			else if (word.equals("�Ʊ�")||word.equals("�̷�"))
			{
				System.out.println(word + "�� " + Dictionary.kor2Eng(word));
			}
			else 
			{
				System.out.println(word + "�� " + Dictionary.kor2Eng(word));
			}
		}
	}
}