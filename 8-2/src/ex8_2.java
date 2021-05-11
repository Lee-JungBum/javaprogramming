/**
*   컴퓨터공학전공 18114323 이정범 
*   9주차 2번실습(버퍼 사용해보기)
*
*/
import java.io.*;	//io불러오기
import java.util.Scanner;	//scanner불러오기

public class ex8_2 {
	public static void main(String[] args)	//메인
	{
		FileReader fin = null;		//불러온 파일fin에저장 (현재 비어있음)
		int c;						//출력용 int
		try {		//시도해라
			fin = new FileReader("c:\\Temp\\test2.txt");		//fin에 c:\\Temp\\test.txt 대입
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);//out이랑 버퍼는 5글자 받을때까지 반복
			
			while ((c= fin.read()) != -1)//c에 fin으로 불러온걸 대입하고 불러온게 -1이 아니면 반복하라
			{
				out.write(c);			//불러온 c를 out에 대입하라 5칸이되면 작성된다.
			}
			if(!new Scanner(System.in).hasNextLine())	//컨트롤 z예외처리
			{
				System.out.println();
			}
			
			out.flush();
			fin.close();
			out.close();
		}
		catch(IOException e  )		//입출력에 오류가 발생하면
		{
			e.printStackTrace();	//오류출력
		}
		
	}
}
