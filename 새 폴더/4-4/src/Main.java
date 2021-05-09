import java.util.Scanner;

public class Main{
  public static void main(String [] arg) {
      DicApp dicapp = new DicApp();
      dicapp.search();
  }
}
class Dictionary 
{
  private static String [] kor = {"사랑", "아기", "돈", "미래", "희망" };
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
		System.out.println("한영 단어 검색 프로그램입니다.");
	}
	public void search()
	{
		while(true)
		{
			System.out.print("한글 단어?");
			word=scanner.next();
			if (word.equals("그만"))
			{
				break;
			}
			else if (Dictionary.kor2Eng(word).equals(""))
			{
				System.out.println(word+ "는 저의 사전에 없습니다.");
			}
			else if (word.equals("아기")||word.equals("미래"))
			{
				System.out.println(word + "는 " + Dictionary.kor2Eng(word));
			}
			else 
			{
				System.out.println(word + "은 " + Dictionary.kor2Eng(word));
			}
		}
	}
}