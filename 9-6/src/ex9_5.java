import java.util.*;
import java.io.*;

public class ex9_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Ű �Է�
		StringBuffer hiddenWord; // -�������Եȴܾ�
		String quest; // �̼Ǵܾ�
		int HIDDENCHAR = 2; // ����� ���� ����
		
		int Count; // Ʋ�� Ƚ��
		
		

		// ������ �����ϴ� �޼ҵ�
		System.out.println("���ݺ��� ��� ������ �����մϴ�.");
		Words words = new Words("words.txt"); // words.txt ������ ��� �ܾ �о� ���Ϳ� �����Ѵ�.		
		while(true) {
			quest = words.getRandomWord(); // ������ �ܾ� ����
			if(quest == null) break; // �ܾ� ���ÿ� ������ �ִ� ��� ���α׷� ����
			hiddenWord = new StringBuffer(quest);
			Random r = new Random();
			
			for(int k=0; k<HIDDENCHAR; k++) {
				int index = r.nextInt(quest.length());
				char c = quest.charAt(index);
				for(int i=0; i<quest.length(); i++) {
					if(hiddenWord.charAt(i) == c)
						hiddenWord.setCharAt(i,'-');
				}
			}
			Count=0;
			char key;
			boolean hit = false;
			for(int i=0; i<quest.length(); i++) {
				if(hiddenWord.charAt(i) == '-' && quest.charAt(i) == key) {
					hiddenWord.setCharAt(i, key);
					hit = true;
				}
			}
			if(!hit)
				Count++;
			for(int i=0; i<quest.length(); i++) {
				if(hiddenWord.charAt(i) == '-')
					return false;
			}
			return true;
		}
			do {
				if(Count == 5) {
					System.out.println("5�� ���� �Ͽ����ϴ�.");
					break;
				}
				System.out.println(hiddenWord);
				System.out.print(">>");
				String text = scanner.next();
				key =  text.charAt(0);
			}while(!complete(key));
			System.out.println(quest);
		}
			System.out.print("Next(y/n)?");
			String answer = scanner.next();
			if(answer.equals("n")) // n�� �Է��ϸ� ����
				break;
		}
	}
	


		
	}
	
	// ����ڰ� �Է��� ���� key�� ���� ���ڿ� ��ġ�ϴ��� �˻��ϰ� ��ġ�ϸ� true�� �����Ѵ�.
	// �׸��� ���� hiddenWord�� '-'���ڸ� key ���ڷ� �����Ѵ�.
	private boolean complete(char key) {
		


}

// words.txt ������ �а� ���Ϳ� �����ϰ� ���ͷκ��� �����ϰ� �ܾ �����ϴ� Ŭ����
class Words {
	Vector<String> wordVector = new Vector<String>();

	public Words(String fileName) {
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			while(scanner.hasNext()) { // ���� ������ ����
				String word = scanner.nextLine(); // �� ������ �а� '\n'�� ���� ������ ���ڿ��� ����
				wordVector.add(word); // ���ڿ��� ���Ϳ� ����
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	}
	
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // �� �ܾ��� ����
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}	
}