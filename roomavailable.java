import java.util.Scanner;
public class roomavailable {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
  int sz=in.nextInt();
  int f=in.nextInt();
  if(sz<=100000 && f<=10000){
  int ar[]=new int[sz];
  for(int i=0;i<sz;i++){
	  ar[i]=in.nextInt();
  }
  int cnt=0;
  for(int j=0;j<sz;j++){
	  if(ar[j]<=f){
		  cnt++;
	  }
  }
  System.out.println(cnt);
   }
}
}
