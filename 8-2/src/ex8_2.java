/**
*   ��ǻ�Ͱ������� 18114323 ������ 
*   9���� 2���ǽ�(���� ����غ���)
*
*/
import java.io.*;	//io�ҷ�����
import java.util.Scanner;	//scanner�ҷ�����

public class ex8_2 {
	public static void main(String[] args)	//����
	{
		FileReader fin = null;		//�ҷ��� ����fin������ (���� �������)
		int c;						//��¿� int
		try {		//�õ��ض�
			fin = new FileReader("c:\\Temp\\test2.txt");		//fin�� c:\\Temp\\test.txt ����
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);//out�̶� ���۴� 5���� ���������� �ݺ�
			
			while ((c= fin.read()) != -1)//c�� fin���� �ҷ��°� �����ϰ� �ҷ��°� -1�� �ƴϸ� �ݺ��϶�
			{
				out.write(c);			//�ҷ��� c�� out�� �����϶� 5ĭ�̵Ǹ� �ۼ��ȴ�.
			}
			if(!new Scanner(System.in).hasNextLine())	//��Ʈ�� z����ó��
			{
				System.out.println();
			}
			
			out.flush();
			fin.close();
			out.close();
		}
		catch(IOException e  )		//����¿� ������ �߻��ϸ�
		{
			e.printStackTrace();	//�������
		}
		
	}
}
