import java.util.Scanner;
public class powofposition {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String s=Integer.toString(a);
		char c[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum=sum+(int)Math.pow(c[i]-48,i);
		}
		System.out.println(sum);
	}
}
