import java.util.Scanner;
class ReversalAlgoritham{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How maney element putin Array");
        int count=scan.nextInt();
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
        	System.out.println("Enter your "+(i+1)+"input");
        	arr[i]=scan.nextInt();
        }
        System.out.println("How maney times to rotate");
        int rotateCount=scan.nextInt();
        rotateArray(arr,rotateCount);
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
	}
	public static void rotateArray(int[] arr,int rotateCount){
        if(rotateCount==0)
        {
          return;
        }
        rotateCount=rotateCount%arr.length;
        reverseArray(arr,0,rotateCount-1);
        reverseArray(arr,rotateCount,arr.length-1);
        reverseArray(arr,0,arr.length-1);
	}
	public static void reverseArray(int[] arr,int start,int end){
		int temb=0;
		while(start<end){
          temb=arr[start];
          arr[start]=arr[end];
          arr[end]=temb;
          start++;
          end--;
		}
	}
}