/**
*   ��ǻ�Ͱ������� 18114323 ������ 
*   9���� 1���ǽ�(���ڵ� ���� �� ���� �ҷ�����)
*
*/
import java.io.*;	//io�ҷ�����
import java.util.*;
public class ex8_4 {
	public static void main(String[] args)		//�����Լ�
	{
		FileInputStream fin = null;		//����ִ� fin���� ���� ���ڵ� ����
		Vector<String> wordVector = new Vector<String>();
		String quest; //����
		char an ='a'; //next?y n
		char ctmp[]; //���������
		char answer;
		int WORDMAX; //�ܾ��
		int index;  //����
		int count=0; //�����
		int answercount = 0;
		int tmp1 = 0, tmp2=0;; //�ӽ÷� ������ index����
		try {
			fin = new FileInputStream("C:\\Users\\User\\Desktop\\words.txt");
		}
		catch(IOException e)	//���� ����� ������
		{
			System.out.println("����� ����"); 	//���
			return;
		}
		Scanner scanner = new Scanner(fin);
		while(scanner.hasNext()) //���͹޾ƿ���
		{
			String word = scanner.nextLine();
			wordVector.add(word);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("���ݺ��� ��� ������ �����մϴ�.");
		WORDMAX = wordVector.size(); // �� �ܾ��� ����
		while(true)
		{
			index = (int)(Math.random()*WORDMAX); //����!
			quest = new String(wordVector.get(index)); //�̼�
			for(int i=0; i<1; i++) // 1 2 ������ ������ �ٽ��ϰ�
			{ 
				tmp1=(int)(Math.random()*quest.length());//���ڼ���ŭ���� 1����
				tmp2=(int)(Math.random()*quest.length());//���ڼ���ŭ���� 2����
				if(tmp1==tmp2)	//tmp1 2 �� ������ �ٽü���
				{
					i--;	//iī���� ������
				}
			}
			String a = quest.substring(0, tmp1)+'-'+quest.substring(tmp1+1);	//1�� -
			String b = a.substring(0,tmp2)+'-' + a.substring(tmp2+1); //2�� -
			ctmp = new char[2];	//���������
			ctmp[0] = quest.charAt(tmp1);//��������1
			ctmp[1] = a.charAt(tmp2);//��������2
			System.out.println(b);
			System.out.println(ctmp);
			
			while(true) {
				System.out.print(">> ");
				answer = sc.next().charAt(0);
			for(int j = 0; j<2;j++)	//�����̵ΰ������� �ι���
			{
				if(answer==ctmp[j])	//�����ϰ��
				{
					
					if(j==0)//0������
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
							System.out.println("�̹� ã�Ƴ� �����Դϴ�.");
							count--;
						}
					}
					else if(j==1)//1������
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
			if(quest.equals(b)) //�´°�� ������.
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
		
			if(count==5) //5�������Ѱ��
			{
				System.out.println("5�� ���� �Ͽ����ϴ�.");
				System.out.println(quest);
				System.out.println("Next(y/n)");
				
				while(count==5) //���ϴ°� �Է��Ҷ����� �ݺ�.
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
				if(an=='y') //�������
				{
					break;
				}
				
			}
			}
			//b�� ���繮����.
			//quest�� ���ؼ� �����ؾ��ҵ�.
		}
		}	
}