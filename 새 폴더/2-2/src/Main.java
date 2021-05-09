import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) 
   {
      Scanner scanner1 = new Scanner(System.in); //스캐너1생성 
      System.out.print("Input the first coordination(x1, y1)>> "); //첫번째 꼭지점 입력
      int sx1 = scanner1.nextInt(); //인트 기준으로 자른다
      int sy1 = scanner1.nextInt();
      System.out.print("Input the second coordination(x2, y2)>> "); //두번째 꼭지점 입력
      int sx2 = scanner1.nextInt();
      int sy2 = scanner1.nextInt();
      if (inRect(sx1,sy1,100,100,200,200)||
    		  inRect(sx2,sy2,100,100,200,200)||
    		  inRect(sx1,sy2,100,100,200,200)||
    		  inRect(sx2,sy1,100,100,200,200))
      {System.out.println("Yes, two rectangles are collided.");} // 넷중 하나라도 참이면
              else if(inRect(100,100,sx1,sy1,sx2,sy2)
            		  && inRect(100,200,sx1,sy1,sx2,sy2)
            		  && inRect(200,100,sx1,sy1,sx2,sy2)
            		  && inRect(200,200,sx1,sy1,sx2,sy2))
              {System.out.println("Yes, two rectangles are collided.");} //아예 넘는경우를 대비해서
                  else{System.out.println("No, two rectangles are NOT collided.");} 
      scanner1.close();
    }
     
 
   public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
      if ((x>=rectx1 && x <= rectx2)&& (y>=recty1 && y <=recty2)) //첫사각형일아 비교하는 메쏘드 를 생성
         return true;
      else return false;
   }
}