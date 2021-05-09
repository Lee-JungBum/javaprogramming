public class Main {

	public static void main(String[] args) {
		for (int i = 1;i<=99;i++)
		{
			if(i/10!=0&&(i/10)%3==0)
			{
				System.out.print(i+ " ¹Ú¼ö Â¦");
				if (i%10!=0&&(i%10)%3==0)
				{
					System.out.print("Â¦");
				}
				System.out.println();
				
			}
			else if(i%10!=0&&(i%10)%3==0)
			{
				System.out.println(i+ " ¹Ú¼ö Â¦");
				
			}
		}
	}
}