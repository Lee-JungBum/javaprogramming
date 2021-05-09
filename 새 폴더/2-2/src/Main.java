import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) 
   {
      Scanner scanner1 = new Scanner(System.in); //��ĳ��1���� 
      System.out.print("Input the first coordination(x1, y1)>> "); //ù��° ������ �Է�
      int sx1 = scanner1.nextInt(); //��Ʈ �������� �ڸ���
      int sy1 = scanner1.nextInt();
      System.out.print("Input the second coordination(x2, y2)>> "); //�ι�° ������ �Է�
      int sx2 = scanner1.nextInt();
      int sy2 = scanner1.nextInt();
      if (inRect(sx1,sy1,100,100,200,200)||
    		  inRect(sx2,sy2,100,100,200,200)||
    		  inRect(sx1,sy2,100,100,200,200)||
    		  inRect(sx2,sy1,100,100,200,200))
      {System.out.println("Yes, two rectangles are collided.");} // ���� �ϳ��� ���̸�
              else if(inRect(100,100,sx1,sy1,sx2,sy2)
            		  && inRect(100,200,sx1,sy1,sx2,sy2)
            		  && inRect(200,100,sx1,sy1,sx2,sy2)
            		  && inRect(200,200,sx1,sy1,sx2,sy2))
              {System.out.println("Yes, two rectangles are collided.");} //�ƿ� �Ѵ°�츦 ����ؼ�
                  else{System.out.println("No, two rectangles are NOT collided.");} 
      scanner1.close();
    }
     
 
   public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
      if ((x>=rectx1 && x <= rectx2)&& (y>=recty1 && y <=recty2)) //ù�簢���Ͼ� ���ϴ� �޽�� �� ����
         return true;
      else return false;
   }
}