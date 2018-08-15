import java.util.Scanner;
public class strsubstrchk {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		int l=s1.length();
		int c=0,cnt=0;
		for(int i=0;i<s.length()-l;i++){
			String a=s.substring(i,i+l);
			if(a.equals(s1)){
				c=i;
				cnt++;
				break;
			}
		}
		if(cnt==0){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}
	}
}
