import java.util.Scanner;
class Matrix_inArray{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] arr=new int[2][2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(i+" array "+j +"positions");
				arr[i][j]=scan.nextInt();
			}
		}
		int[][] arr1=new int[2][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.println(i+" array "+j +"positions");
				arr1[i][j]=scan.nextInt();
			}
		}
		int[][] arr2=new int[2][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					arr2[i][j]+=arr[i][k]*arr1[k][j];
					
				}
				System.out.println(arr2[i][j]);
			}
		} 


	}
}