import java.util.Scanner;

public class Main{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.run();
  }
}
class Phone {
	String name;
	String number;
	Phone()
	{
		//String name, String number
		//this.name =name;
		//this.number =number;
	}
	public String getname() {return name;}
	public String getnumber(){return number;}
}
class PhoneBook extends Phone {
	int count;
	Scanner scanner = new Scanner(System.in);
	Phone phone[];
	PhoneBook()
	{
		PeopleNumber();
		phone = new Phone[count];
		getInfo();
		
	}
	void PeopleNumber()  							//�ο���
	{
		while(true)
		{
			System.out.print("�ο���>>");
			count = scanner.nextInt();
			if(count<=0)	scanner.nextLine();
			
			else 			break;
		}
		
	}
	void getInfo()
	{
		for (int i = 0; i<=count-1;i++)
		{
			
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			phone[i] = new Phone();
			phone[i].name = new String(scanner.next());
			phone[i].number = new String(scanner.next());
			scanner.nextLine();
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	void run() 
	{
		String searchname;
		int tmp =0;
		while (true)
		{
			System.out.print("�˻��� �̸�>>");
			searchname = scanner.next();
			for(int i =0; i<=count-1 ; i++)
			{
				if (searchname.equals("�׸�"))
				{
					return;
				}
				else if(searchname.equals(phone[i].name))
				{
					System.out.println(phone[i].name+"�� ��ȣ�� "+phone[i].number+ " �Դϴ�.");
					tmp = 0;
					break;
				}
				else tmp = i+1;
			}
			if (tmp == count)
			{
				System.out.println(searchname + " �� �����ϴ�.");
			}
			
		}
	}
	
}