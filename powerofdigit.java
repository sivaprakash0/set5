package set5;

import java.util.Scanner;

public class powerofdigit {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	String s=Integer.toString(a);
	char c[]=s.toCharArray();
	int sum=0;
	for(int i=0;i<s.length();i++){
		sum=sum+(int)Math.pow(c[i]-48, s.length());
	}
	System.out.println(sum);
}
}
