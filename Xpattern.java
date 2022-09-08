import java.util.Scanner;
class Xpattern{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
        System.out.println("Enter the any name but odd length onely");
	    String name=scan.next();
	    String[] nameSplit=name.split("");
	    for(int i=1;i<=nameSplit.length;i++)
	    {
	    	for(int j=1;j<=nameSplit.length;j++)
	    	{
	    		if(nameSplit.length%2==1){
		    		if(i==j||j==(nameSplit.length-i)+1)
		    		{
		    			System.out.print(nameSplit[j-1]);
		    		}
		    		else
		    		{
		    			System.out.print(" ");
		    		}
	    	   }
	    	   else
	    	   {
                 System.out.print("o");
	    	   }
	    	}
	    	System.out.println("");
	    }
	}
}