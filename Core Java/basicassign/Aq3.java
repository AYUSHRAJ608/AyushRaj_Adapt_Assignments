package basicassign;
import java.util.Scanner;
class SiCi {
	public static double simpleInterest(double principalAmount,
			int time,double interestRate)
	{
		double SimpleInterest = (principalAmount*(interestRate/100/12)*(time*12))/100;
		return SimpleInterest;
	}
    public static double compoundInterest(double principalAmount,int time,double interestRate){
    	double CompundInterest = (Math.pow(principalAmount*(1+(interestRate/100/12)),(time*12))-principalAmount);
    	return CompundInterest;
    }
}
public class Aq3 {
    public static void main (String args[]) {
    	Scanner scanner=new Scanner(System.in);
    	double principalAmount = scanner.nextDouble();
    	int time=scanner.nextInt();
    	double interestRate=scanner.nextDouble();
    	scanner.close();
    	System.out.println(SiCi.simpleInterest(principalAmount,time,interestRate));
    	System.out.println(SiCi.compoundInterest(principalAmount,time,interestRate));
    }
}