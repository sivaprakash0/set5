import java.util.Scanner;
public class sumofasciivalue {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	char c[]=s.toCharArray();
	int sum=0;
	for(int i=0;i<s.length();i++){
		sum=sum+c[i];
    }
	System.out.println(sum);
}
}
