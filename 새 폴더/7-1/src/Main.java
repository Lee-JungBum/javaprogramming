import java.util.*;

public class Main{
  public static void printBig(Vector<Integer> v){
	 int longvalue = 0;
	 for (int i=0;i<v.size();i++)
	 {
		
		 if(v.get(i)>=longvalue)
		 {
			 longvalue=v.get(i);
		 }
	 }
	 System.out.println("���� ū ���� "+longvalue);
  }
  public static void main(String[] args){
	  	Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int i=0;
		System.out.print("����(-1�� �Էµ� ������)>> ");
		while(true)
		{
			
		
			
			v.add(scanner.nextInt());
			
			
			
			if(v.get(i)==-1)
			{
				v.remove(i);
				break;
				
			}
			i++;
		}
	printBig(v);
	scanner.close();
  }
}