public class Main
{
	public static void main(String[] args)
	{
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,20);
		System.out.println("원 a :"+ a);
		System.out.println("원 b :"+ b);
		if(a.equals(b)) System.out.println("같은 원");
		else System.out.println("서로 다른 원");
	}
}

class Circle
{
	private int a,b;
	private int radius;
	Circle(int a, int b, int radius)
	{
		this.a=a;
		this.b=b;
		this.radius=radius;
	}
	public String toString()
	{
		return " Circle("+a+","+b+")반지름"+radius;
	}
	public boolean equals(Circle circle)
	{
		if(this.a==circle.a&&this.b==circle.b)
			return true;
		else
			return false;
	}
	
}