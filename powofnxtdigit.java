import java.util.Scanner;
public class powofnxtdigit {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	String s=Integer.toString(a);
	char c[]=s.toCharArray();
	int sum=0,tot;
	if(s.length()==1){
		tot=(int)Math.pow(c[0]-48, 2);
		System.out.println(tot);
	}
	else{
	for(int i=0;i<s.length()-1;i++){
		sum=sum+(int)Math.pow(c[i]-48, c[i+1]-48);
	}
	tot=(int)Math.pow(c[s.length()-1]-48, c[0]-48);
	System.out.println(sum+tot);
   }
}
}
