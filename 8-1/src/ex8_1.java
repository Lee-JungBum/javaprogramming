/**
*   ��ǻ�Ͱ������� 18114323 ������ 
*   9���� 1���ǽ�(���ڵ� ���� �� ���� �ҷ�����)
*
*/
import java.io.*;	//io�ҷ�����
public class ex8_1 {
	public static void main(String[] args)		//�����Լ�
	{
		InputStreamReader in = null;	//����ִ� in���� �ҷ������� ���ڵ� ����.
		FileInputStream fin = null;		//����ִ� fin���� ���Ϻҷ�����
		try {
			fin = new FileInputStream("C:\\temp\\hangul.txt");	//fin�� c:\\temp\\hagul.txt ���� 
			in = new InputStreamReader(fin,"MS949");	//fin�� ms949�� �ҷ��ð��̴�.
			int c;	//�ҷ��� c
			
			System.out.println("���ڵ� ���� ������ "+in.getEncoding());	//���� ���ڵ���.
			while ((c= in.read()) != -1)	//c�� in���� ���ڸ� �ϳ��� �ҷ����� -1�̵ɶ����� �ݺ��ض�
			{
				System.out.print((char)c);		//c���
			}
			in.close();	//in ����
			fin.close();	//fin ����
		}
		catch(IOException e)	//���� ����� ������
		{
			System.out.println("����� ����"); 	//���
		}
	}
}
