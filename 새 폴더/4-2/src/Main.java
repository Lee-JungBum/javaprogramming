import java.util.Scanner;

public class Main {
  public static void main(String [] arg) {
    int x, y, w, h;
    Scanner scanner = new Scanner(System.in);
    Rectangle t = new Rectangle(1, 1, 10, 10);
    x = scanner.nextInt();
    y = scanner.nextInt();
    w = scanner.nextInt();
    h = scanner.nextInt();
    Rectangle r = new Rectangle(x, y, w, h);
    x = scanner.nextInt();
    y = scanner.nextInt();
    w = scanner.nextInt();
    h = scanner.nextInt();
    Rectangle s = new Rectangle(x, y, w, h);
    r.show();
    System.out.println("s의 면적은 " + s.square());
    if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
    if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
  }
}
class Rectangle {
  int x, y, w, h;
  public Rectangle(int x,int y, int w, int h)
  {
	  this.x=x;
	  this.y=y;
	  this.w=w;
	  this.h=h;
  }
  void show() {System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.w+"x"+this.h+"인 사각형");}
  Boolean contains(Rectangle r) 
  {
	  if((this.x<r.x) && (this.y<r.y) && (this.x+this.w)>(r.x+r.w) && (this.y+this.h)>(r.y+r.h))
			return true;
		else
			return false;
  }
  int square() {return w*h;}
}