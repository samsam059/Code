import java.util.*;
import java.lang.Exception;
public class pangram {

	public static void main(String[] args) {
		Runnable mega=() -> {
		try {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		int[] arr=new int[26];
		for(int i=0;i<26;i++)
			arr[i]=0;
		int m=0,count=0;
		sc.close();
		for(int i=0;i<str1.length();i++)
		{
			 char c=str1.charAt(i);
			    int a=c;
				if(c>=97&&c<=122&&c!=32)
				{m=a-97;
				arr[m]+=1;
					}}
		for(int i=0;i<26;i++)
		{
			if(arr[i]==0) {
				count=1;
				break;}
		}
		Thread.sleep(200);
		if(count==1)
			System.out.print("Not a Pangram");
		else
			System.out.print("Pangram");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	};
	Thread f=new Thread(mega);
	f.start();;

}
}
