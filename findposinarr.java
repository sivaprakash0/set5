package set6;

import java.util.Scanner;

public class findposinarr {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int f=in.nextInt();
	if(sz<=100000){
	int ar[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar[i]=in.nextInt();
	}
	System.out.println(ar[f-1]);
}
}
}