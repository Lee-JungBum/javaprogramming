import java.util.*;
import java.io.*;

public class ex9_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 키 입력
		StringBuffer hiddenWord; // -글자포함된단어
		String quest; // 미션단어
		int HIDDENCHAR = 2; // 숨기는 글자 개수
		
		int Count; // 틀린 횟수
		
		

		// 게임을 시작하는 메소드
		System.out.println("지금부터 행맨 개임을 시작합니다.");
		Words words = new Words("words.txt"); // words.txt 파일의 모든 단어를 읽어 벡터에 저장한다.		
		while(true) {
			quest = words.getRandomWord(); // 랜덤한 단어 선택
			if(quest == null) break; // 단어 선택에 문제가 있는 경우 프로그램 종료
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
					System.out.println("5번 실패 하였습니다.");
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
			if(answer.equals("n")) // n을 입력하면 종료
				break;
		}
	}
	


		
	}
	
	// 사용자가 입력한 문자 key가 숨긴 글자와 일치하는지 검사하고 일치하면 true를 리턴한다.
	// 그리고 나서 hiddenWord의 '-'문자를 key 문자로 변경한다.
	private boolean complete(char key) {
		


}

// words.txt 파일을 읽고 벡터에 저장하고 벡터로부터 랜덤하게 단어를 추출하는 클래스
class Words {
	Vector<String> wordVector = new Vector<String>();

	public Words(String fileName) {
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			while(scanner.hasNext()) { // 파일 끝까지 읽음
				String word = scanner.nextLine(); // 한 라인을 읽고 '\n'을 버린 나머지 문자열만 리턴
				wordVector.add(word); // 문자열을 벡터에 저장
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	}
	
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // 총 단어의 개수
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}	
}
