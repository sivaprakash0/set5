import java.util.Arrays;
import java.util.Scanner;
public class sendsmlno {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int ar[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar[i]=in.nextInt();
	}
	Arrays.sort(ar);
	for(int j=0;j<sz;j++){
		if(ar[j]<ar[j+1]){
			System.out.println(ar[j+1]);
			break;
		}
	}
	
}
}
