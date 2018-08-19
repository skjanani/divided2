package janani;
import java.util.Scanner;
public class Divided2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
//n1=ja.nextInt();
if(n%2==0){
	System.out.println(n/2);
}
else if(n%2!=0){
	System.out.println(n);
}
	}

}
