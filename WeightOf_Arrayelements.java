import java.util.*;
class WeightOf_Arrayelements
{
  	public static void main(String[] args) 
  	{
  	    	Scanner sc=new Scanner(System.in);
  	    	System.out.println("HOw maney elements put in array");
  	    	int count=sc.nextInt();
  	    	int[] arr=new int[count];
  	    	for(int i=0;i<count;i++){
  	    		System.out.println("Enter your "+(i+1)+"elements");
            	arr[i]=sc.nextInt();
  	    	}
  	    	weightage(arr);
   }

	public static void weightage(int[] arr)
	{
        int[][] weight_elements=new int[arr.length][2];
        int weight=0;
        int[] weightSort=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
        	if(Math.sqrt(arr[i])-Math.floor(Math.sqrt(arr[i]))==0){
        		weight+=5;
        	}
        	if(arr[i]%4==0&&arr[i]%6==0){
        		weight+=4;
        	}if(arr[i]%2==0){
        		weight+=3;
        	}
        	System.out.println(weight);
        		weight_elements[i][0]=arr[i];
        		weight_elements[i][1]=weight;
        		weightSort[i]=weight;
        		weight=0;
        } 
          Arrays.sort(weightSort);
          for(int j=arr.length-1;j>=0;j--){
        for(int i=0;i<weight_elements.length;i++)
        { 
           if(weight_elements[i][1]==weightSort[j]){
            System.out.println(Arrays.toString(weight_elements[i]));
            }
        }
    }
	}
}