/**
*   컴퓨터공학전공 18114323 이정범 
*   9주차 1번실습(인코딩 지정 및 파일 불러오기)
*
*/
import java.io.*;	//io불러오기
public class ex8_1 {
	public static void main(String[] args)		//메인함수
	{
		InputStreamReader in = null;	//비어있는 in생성 불러온파일 인코딩 지정.
		FileInputStream fin = null;		//비어있는 fin생성 파일불러오기
		try {
			fin = new FileInputStream("C:\\temp\\hangul.txt");	//fin에 c:\\temp\\hagul.txt 대입 
			in = new InputStreamReader(fin,"MS949");	//fin은 ms949로 불러올것이다.
			int c;	//불러올 c
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());	//현재 인코딩은.
			while ((c= in.read()) != -1)	//c에 in에서 문자를 하나씩 불러오고 -1이될때까지 반복해라
			{
				System.out.print((char)c);		//c출력
			}
			in.close();	//in 종료
			fin.close();	//fin 종료
		}
		catch(IOException e)	//파일 입출력 문제시
		{
			System.out.println("입출력 오류"); 	//출력
		}
	}
}
