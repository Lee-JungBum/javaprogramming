import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		System.out.print("Input money>> ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int a = money / 10000;
		money = money - a*10000;
		int b = money / 1000;
		money = money - b*1000;
		int c = money / 100;
		money = money - c*100;
		int d = money / 10;
		money = money - d*10;
		int e = money;
		int tmp=0;
		
		tmp = a/5;
			if(a/5 != 0){System.out.println(tmp+" 50,000won bill(s)");}
		tmp = a%5;
			if(a%5 != 0){System.out.println(tmp+" 10,000won bill(s)");}
			if(b != 0) {System.out.println(b+" 1,000won bill(s)");}
		tmp = c/5;
			if(c/5 != 0){System.out.println(tmp+" 500won coin");}
		tmp = c%5;
			if(c%5 != 0){System.out.println(tmp+" 100won coin(s)");}
		tmp = d/5;
			if(d/5 != 0){System.out.println(tmp+" 50won coin");}
		tmp = d%5;
			if(d%5 != 0){System.out.println(tmp+" 10won coin(s)");}
			if(e != 0) {System.out.println(e+" 1won coin(s)");}
		scanner.close();
	}
}