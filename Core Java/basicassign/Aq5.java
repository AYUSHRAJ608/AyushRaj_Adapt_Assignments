package basicassign;
import java.util.Scanner;
class TaxAmount{
    public static double calculateTaxAmount(int ctc){
    	double taxAmount = 0;
    	if(ctc>0 && ctc<=180000)
    		taxAmount=0;
    	else if (ctc>=180001 && ctc<=300000)
    		taxAmount=(ctc*10)/100;
    	else if (ctc>=300001 && ctc<=500000)
    		taxAmount=(ctc*20)/100;
    	else if (ctc>=500001 && ctc<=1000000)
    		taxAmount=(ctc*30)/100;
    	return taxAmount;
    }
}
public class Aq5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ctc = scanner.nextInt();
		System.out.print(TaxAmount.calculateTaxAmount(ctc));
		scanner.close();

	}
}
