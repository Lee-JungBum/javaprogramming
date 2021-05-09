public class Main {
	public static void main(String[] args)
	{
		int n[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		int j= 0;
		int i=0;
		for (i=0;i<n.length;i++)
		{
			for (j=0;j<n[i].length;j++)
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}