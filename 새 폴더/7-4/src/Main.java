import java.util.Scanner;
import java.util.Vector;

public class Main {
  public static void main(String [] args) {
    GraphicEditor ge = new GraphicEditor("beauty");
    ge.run();
  }
}


class GraphicEditor
{
	Scanner scanner = new Scanner(System.in);
	Vector<Shape> v = new Vector<Shape>();
	GraphicEditor(String a)
	{
		System.out.println("그래픽 에디터 "+ a +"를 실행합니다.");
	}
	public void run()
	{
		
		Shape shape;
		int select=0;
		while(select!=4)
		{
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			select = scanner.nextInt();
			switch(select) 
			{
				case 1:
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					int choice = scanner.nextInt();
					switch(choice) 
					{
						case 1:
							shape = new Line();
							v.add(shape);
							break;
						case 2:
							shape = new Rect();
							v.add(shape);
							break;
						case 3:
							shape = new Circle();
							v.add(shape);
							break;
						default :
							System.out.println("잘못 선택하셨습니다.");
							break;
					}
					
					break;
				case 2:
					System.out.print("삭제할 도형의 위치>>" );
					int position = scanner.nextInt();
					if(v.size() == 0 || v.size()<= position || position < 0)
						System.out.println("삭제할 수 없습니다.");
					else 
						v.remove(position);
					break;
				case 3:
					for(int i=0; i<v.size(); i++)
						v.get(i).draw();
					break;
				case 4:
					System.out.println("beauty를 종료합니다.");
					scanner.close();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
	}
}
abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; } 
    public Shape getNext() { return next; }
    public abstract void draw();
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}