/**
*   ��ǻ�Ͱ������� 18114323 ������ 
*   9���� 3���ǽ�(���� ����Ʈ ��� �� ���丮 ���� + ���丮 �̸�����)
*
*/
import java.io.*;				//io �ҷ�����
import java.util.Scanner;		//scanner �ҷ�����

public class ex8_3 {
	public static void listDirectory(File dir) //list �Լ� ���� �Ű������� ���丮
	{
		System.out.println("-----"+ dir.getPath() + "�� ���� ����Ʈ�Դϴ�.-----");
		
		File[] subFiles = dir.listFiles();					//list�� �����ϰ��ִ� ���Ϲ迭 ����
		
		for(int i = 0; i<subFiles.length; i++)				//���ϼ��ڸ�ŭ �ݺ�
		{
			File f = subFiles[i];							//��¿� ���� 
			long t = f.lastModified();						//���������� ������ �ð� �����ϴ� ����
			System.out.print(f.getName()+"");					//�̸����
			System.out.print("\t\t����ũ��: " + f.length());			//ũ�� ���
			System.out.printf("\t������ �ð�: %tb %td %tT\n",t,t,t,t);	//�ð� ��� tb = �� td = �� tT = �ð�
		}
	}
	public static void main(String[] args)							//�����Լ�
	{
		File f1 = new File("c:\\windows\\system.ini");				//f1 - system.ini
		System.out.println(f1.getPath()+", "+f1.getParent() +", "+f1.getName());	//�ּ�+�̸� ��� , �ּ� ��� , �̸����
		
		String res="";				//��String ����
		if(f1.isFile()) res = "����";		//f1�� �����̸� res = "����"
		else if(f1.isDirectory())res="���丮";		//f1�� ������ res "���丮"
		System.out.println(f1.getPath() + "�� "+res + "�Դϴ�. ");		//f1���ּ�+�̸�"��" res "�Դϴ�. "
		
		File f2 = new File("c:\\Temp\\java_sample");	//f2�� java_sample
		if(!f2.exists())								//������
		{
			f2.mkdir();	//���� ����
		}
		
		listDirectory(new File("c:\\Temp"));	//����������Լ� listDirectoryd�� �Ű������� c:\\temp����
		f2.renameTo(new File("c:\\Temp\\javasample"));	//f2�� �̸�����
		listDirectory(new File("c:\\Temp"));	//����������Լ� listDirectoryd�� �Ű������� c:\\temp����
	}
}
