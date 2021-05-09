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
		  System.out.println("** 포인트 관리 프로그램입니다 **");
		  
		  while(true)
		  {
			  System.out.print("이름과 포인트 입력>> ");
			  String name = scanner.next();
				if(name.equals("그만"))
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