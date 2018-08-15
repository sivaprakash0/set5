package set5;

public class printsum {
public static void main(String[] args) {
	String a=args[0];
	char c[]=a.toCharArray();
	int sum=0,tot=0;
	int res=0;
	for(int i=0;i<a.length();i++){
		sum=0;
		for(int j=i;j<=i;j++){
			//System.out.println("char is "+(c[j]-48));
			sum=sum+c[j]-48;
			//System.out.println("sum is "+sum);
		}
		
		tot=tot+sum;
		res+=tot;
		//System.out.println("tot is "+tot);
	}
	System.out.println(res);
}
}
