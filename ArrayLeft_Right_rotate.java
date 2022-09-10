import java.util.Scanner;
class ArrayLeft_Right_rotate{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
        System.out.println("insert how maney elements in array");
        int count=scan.nextInt();
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
        	System.out.println("Enter your "+(i+1)+" elements");
        	arr[i]=scan.nextInt();
        }
        System.out.println("How maney time Leftrotate");
        int left_rotate=scan.nextInt();
        leftrotate(arr,left_rotate);
        System.out.println("How maney time rightrotate");
        int right_rotate=scan.nextInt();
        rightrotate(arr,right_rotate);
    }
    public static void leftrotate(int[] arr,int left_rotate){
        for(int i=0;i<left_rotate;i++){
        	int temb=arr[0];
        	for(int j=0;j<arr.length-1;j++){
               arr[j]=arr[j+1];
        	}
        	arr[arr.length-1]=temb;
        }
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
	}
	public static void rightrotate(int arr[],int right_rotate){
          for(int i=0;i<right_rotate;i++){
          	int temb=arr[arr.length-1];
          	for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
          	}
          	arr[0]=temb;
          }
         for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
	}
}