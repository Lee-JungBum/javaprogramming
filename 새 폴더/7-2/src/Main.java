import java.util.*;

public class Main{
    public static void print(Vector<Integer> v){
       int sum = 0;
       int av;
    	for(int i = 0; i<v.size();i++)
       {
    	   sum+=v.get(i);  
    	   System.out.print(v.get(i)+" ");
       }
    	System.out.println();
    	av=sum/v.size();
    	System.out.println("���� ��� "+av);
    }
    public static void main(String[] args){
    	
    	Scanner scanner = new Scanner(System.in);
    	Vector<Integer> v = new<Integer> Vector();
    	int i=0;
    	while(true)
    	{
    		System.out.print("������ �Է� (0 �Է½� ����)>> ");
    		v.add(scanner.nextInt());
    		if(v.get(i)==0)
    		{
    			v.remove(i);
    		 	return;
    		}
    	 	print(v);
    		i++;
    		
    		
    	}
   
    }
}