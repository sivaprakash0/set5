package set5;

import java.util.Scanner;
public class rightangletriangl {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=a-1;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("1");
			}
			System.out.print("\n");
		}
	}
}
