/**
*   컴퓨터공학전공 18114323 이정범 
*   9주차 3번실습(파일 리스트 출력 및 디렉토리 생성 + 디렉토리 이름변경)
*
*/
import java.io.*;				//io 불러오기
import java.util.Scanner;		//scanner 불러오기

public class ex8_3 {
	public static void listDirectory(File dir) //list 함수 생성 매개변수는 디렉토리
	{
		System.out.println("-----"+ dir.getPath() + "의 서브 리스트입니다.-----");
		
		File[] subFiles = dir.listFiles();					//list를 저장하고있는 파일배열 생성
		
		for(int i = 0; i<subFiles.length; i++)				//파일숫자만큼 반복
		{
			File f = subFiles[i];							//출력용 파일 
			long t = f.lastModified();						//마지막으로 수정된 시간 저장하는 변수
			System.out.print(f.getName()+"");					//이름출력
			System.out.print("\t\t파일크기: " + f.length());			//크기 출력
			System.out.printf("\t수정한 시간: %tb %td %tT\n",t,t,t,t);	//시간 출력 tb = 월 td = 일 tT = 시간
		}
	}
	public static void main(String[] args)							//메인함수
	{
		File f1 = new File("c:\\windows\\system.ini");				//f1 - system.ini
		System.out.println(f1.getPath()+", "+f1.getParent() +", "+f1.getName());	//주소+이름 출력 , 주소 출력 , 이름출력
		
		String res="";				//빈String 생성
		if(f1.isFile()) res = "파일";		//f1이 파일이면 res = "파일"
		else if(f1.isDirectory())res="디렉토리";		//f1이 폴더면 res "디렉토리"
		System.out.println(f1.getPath() + "은 "+res + "입니다. ");		//f1의주소+이름"은" res "입니다. "
		
		File f2 = new File("c:\\Temp\\java_sample");	//f2는 java_sample
		if(!f2.exists())								//없으면
		{
			f2.mkdir();	//폴더 생성
		}
		
		listDirectory(new File("c:\\Temp"));	//사용자정의함수 listDirectoryd의 매개변수는 c:\\temp폴더
		f2.renameTo(new File("c:\\Temp\\javasample"));	//f2의 이름변경
		listDirectory(new File("c:\\Temp"));	//사용자정의함수 listDirectoryd의 매개변수는 c:\\temp폴더
	}
}
