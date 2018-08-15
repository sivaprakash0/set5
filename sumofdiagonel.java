import java.util.Scanner;
public class sumofdiagonel {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a<=1000){
	int ar[][]=new int[a][a];
	for(int i=0;i<a;i++){
		for(int j=0;j<a;j++){
		ar[i][j]=in.nextInt();
	 }
	}	
	int sum=0;
	for(int i=0;i<a;i++){
		sum=ar[i][i]+sum;
	}
	System.out.println(sum);
	}
}
}
