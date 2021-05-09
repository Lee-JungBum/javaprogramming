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
    	System.out.println("현재 평균 "+av);
    }
    public static void main(String[] args){
    	
    	Scanner scanner = new Scanner(System.in);
    	Vector<Integer> v = new<Integer> Vector();
    	int i=0;
    	while(true)
    	{
    		System.out.print("강수량 입력 (0 입력시 종료)>> ");
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