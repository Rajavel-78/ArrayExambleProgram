import java.util.*;
class Find_grandChildern
{
	public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many names");
		int count=scan.nextInt();
		String[][] names=new String[count][2];
		for(int i=0;i<count;i++)
		{  
			System.out.println("Child name");
			names[i][0]=scan.next();
			System.out.println("father name");
			names[i][1]=scan.next();
			System.out.println("---------");
		}
		System.out.println("grand father name");
		String grand_name=scan.next();
		ArrayList<String>son_name=new ArrayList<String>();
		for(int i=0;i<names.length;i++)
		{
			if(grand_name.equals(names[i][1]))
			{
                 son_name.add(names[i][0]);
			}
		}
		 int grand_child_count=0;
		for(int i=0;i<son_name.size();i++)
		{
			for(int j=0;j<names.length;j++)
			{
              if(son_name.get(i).equals(names[j][1])){
              	grand_child_count+=1;
              }
			}
		}
		System.out.println(grand_child_count);
	}
}