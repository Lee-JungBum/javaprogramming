/**
*   컴퓨터공학전공 18114323 이정범 
*   9주차 1번실습(인코딩 지정 및 파일 불러오기)
*
*/
import java.io.*;	//io불러오기
import java.util.*;
public class ex8_4 {
	public static void main(String[] args)		//메인함수
	{
		FileInputStream fin = null;		//비어있는 fin생성 파일 인코딩 지정
		Vector<String> wordVector = new Vector<String>();
		String quest; //문제
		char an ='a'; //next?y n
		char ctmp[]; //정답저장용
		char answer;
		int WORDMAX; //단어갯수
		int index;  //범위
		int count=0; //종료용
		int answercount = 0;
		int tmp1 = 0, tmp2=0;; //임시로 저장할 index공간
		try {
			fin = new FileInputStream("C:\\Users\\User\\Desktop\\words.txt");
		}
		catch(IOException e)	//파일 입출력 문제시
		{
			System.out.println("입출력 오류"); 	//출력
			return;
		}
		Scanner scanner = new Scanner(fin);
		while(scanner.hasNext()) //벡터받아오기
		{
			String word = scanner.nextLine();
			wordVector.add(word);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		WORDMAX = wordVector.size(); // 총 단어의 개수
		while(true)
		{
			index = (int)(Math.random()*WORDMAX); //선정!
			quest = new String(wordVector.get(index)); //미션
			for(int i=0; i<1; i++) // 1 2 같은걸 나오면 다시하게
			{ 
				tmp1=(int)(Math.random()*quest.length());//굴자수만큼랜덤 1지점
				tmp2=(int)(Math.random()*quest.length());//글자수만큼랜덤 2지점
				if(tmp1==tmp2)	//tmp1 2 가 같으면 다시설정
				{
					i--;	//i카운터 낮춰줌
				}
			}
			String a = quest.substring(0, tmp1)+'-'+quest.substring(tmp1+1);	//1번 -
			String b = a.substring(0,tmp2)+'-' + a.substring(tmp2+1); //2번 -
			ctmp = new char[2];	//문제저장용
			ctmp[0] = quest.charAt(tmp1);//문제저장1
			ctmp[1] = a.charAt(tmp2);//문제저장2
			System.out.println(b);
			System.out.println(ctmp);
			
			while(true) {
				System.out.print(">> ");
				answer = sc.next().charAt(0);
			for(int j = 0; j<2;j++)	//정답이두개임으로 두번비교
			{
				if(answer==ctmp[j])	//정답일경우
				{
					
					if(j==0)//0번저장
					{
						if(answercount!=1)
						{
							b=b.substring(0, tmp1)+ answer +b.substring(tmp1+1);
							System.out.println(b);
							answercount= 1;
							count--;
						}
						else
						{
							System.out.println("이미 찾아낸 글자입니다.");
							count--;
						}
					}
					else if(j==1)//1번저장
					{
						if(answercount!=2)
						{
							b=b.substring(0, tmp2)+ answer +b.substring(tmp2+1);
							System.out.println(b);
							answercount=2;
							count--;
						}
					}
					
				
				}
				
				
			}
				count++;
			if(quest.equals(b)) //맞는경우 나가기.
			{
				count =0;
				System.out.println("Next(y/n)");
				an = sc.next().charAt(0);
				if(an=='n')
				{
					return;
				}
				else if(an =='y')
				{
					count=0;
					break;
				}
				
			}
		
			if(count==5) //5번실패한경우
			{
				System.out.println("5번 실패 하였습니다.");
				System.out.println(quest);
				System.out.println("Next(y/n)");
				
				while(count==5) //원하는값 입력할때까지 반복.
				{
					an = sc.next().charAt(0);
					if(an=='n')
					{
						return;
					}
					else if(an =='y')
					{
						count=0;
						break;
					}
				}
				if(an=='y') //나가기용
				{
					break;
				}
				
			}
			}
			//b가 현재문제임.
			//quest랑 비교해서 정답해야할듯.
		}
		}	
}