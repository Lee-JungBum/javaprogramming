import java.util.*;

public class Main{
  public static void main(String[] args){
    CustomerManager a = new CustomerManager();
  }
}
class CustomerManager{
	  HashMap<String, Integer> hs = new HashMap<String, Integer>();
	  Scanner scanner = new Scanner(System.in);
	  CustomerManager()
	  {
		  System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		  
		  while(true)
		  {
			  System.out.print("�̸��� ����Ʈ �Է�>> ");
			  String name = scanner.next();
				if(name.equals("�׸�"))
					break;
				int point = scanner.nextInt();
				if(hs.get(name) == null) {
					hs.put(name, point);
				}
				else {
					hs.put(name,  hs.get(name)+point);
				}
				Set<String> key = hs.keySet();
				Iterator<String> it = key.iterator();
				while(it.hasNext())
				{
					String outname = it.next();
					int outpoint = hs.get(outname);
					System.out.print("("+outname + ", "+outpoint+")");
				}
				System.out.println();
		  } 
	  }
}