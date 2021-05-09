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
	void PeopleNumber()  							//인원수
	{
		while(true)
		{
			System.out.print("인원수>>");
			count = scanner.nextInt();
			if(count<=0)	scanner.nextLine();
			
			else 			break;
		}
		
	}
	void getInfo()
	{
		for (int i = 0; i<=count-1;i++)
		{
			
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			phone[i] = new Phone();
			phone[i].name = new String(scanner.next());
			phone[i].number = new String(scanner.next());
			scanner.nextLine();
		}
		System.out.println("저장되었습니다...");
	}
	void run() 
	{
		String searchname;
		int tmp =0;
		while (true)
		{
			System.out.print("검색할 이름>>");
			searchname = scanner.next();
			for(int i =0; i<=count-1 ; i++)
			{
				if (searchname.equals("그만"))
				{
					return;
				}
				else if(searchname.equals(phone[i].name))
				{
					System.out.println(phone[i].name+"의 번호는 "+phone[i].number+ " 입니다.");
					tmp = 0;
					break;
				}
				else tmp = i+1;
			}
			if (tmp == count)
			{
				System.out.println(searchname + " 이 없습니다.");
			}
			
		}
	}
	
}