import java.util.Scanner;

public class Main{
  public static void main(String [] arg) {
	  int a,b;
	  String c;
	  System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
	  Scanner scanner = new Scanner(System.in);
	  a = scanner.nextInt();
	  b= scanner.nextInt();
	  c = scanner.next();
	  switch(c)
	  {
      case "+": 
          Add add = new Add();
          add.setValue(a, b);
          System.out.println(add.calculate());
          break;
      case "-":
    	 Sub sub = new Sub();
          sub.setValue(a, b);
          System.out.println(sub.calculate());
          break;
      case "*" :
    	  Mul mul = new Mul();
    	  mul.setValue(a, b);
    	  System.out.println(mul.calculate());
          break;
      case "/" :
    	  Div div = new Div();
    	  div.setValue(a, b);
    	  System.out.println( div.calculate());
          break;
      default :
          System.out.println("�ش��ϴ� ������ �����ϴ�.");
	  }
	  scanner.close();
  }
}
class Add{
  int a, b;
  void setValue(int a, int b) {
      this.a = a;
      this.b= b;
  }
  int calculate() {
     return a+b;
  }
}
class Sub{
  int a, b;
  void setValue(int a, int b) {
	  this.a = a;
      this.b= b;
  }
  int calculate() {
      return a-b;
  }
}
class Mul{
  int a, b;
  void setValue(int a, int b) {
	  this.a = a;
      this.b= b;
  }
  int calculate() {
	  return a*b;
  }
}
class Div{
  int a, b;
  void setValue(int a, int b) {
	  this.a = a;
      this.b= b;
  }
  int calculate() {
      return a/b;
  }
}