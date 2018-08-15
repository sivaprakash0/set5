public class printsum {
public static void main(String[] args) {
	String a=args[0];
	char c[]=a.toCharArray();
	int sum=0,tot=0,res=0;
	for(int i=0;i<a.length();i++){
		sum=0;
		for(int j=i;j<=i;j++){
		    sum=sum+c[j]-48;
		}
		tot=tot+sum;
		res+=tot;
	}
	System.out.println(res);
}
}
