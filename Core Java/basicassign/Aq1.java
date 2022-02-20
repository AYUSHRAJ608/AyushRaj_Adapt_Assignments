package basicassign;
import java.util.Scanner;
class ArmstrongOrNot {
    static public boolean armstrongCheck(int n) {
    	int temp=n;
		int c=0,t;
		while(n>0)
		{
		t=n%10;
		n=n/10;
		c=c+(t*t*t);
		}
		if(temp==c)
			return true;
		else
			return false;
    }
}
public class Aq1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		System.out.println(ArmstrongOrNot.armstrongCheck(num));
	}
}
