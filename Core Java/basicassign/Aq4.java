package basicassign;

import java.util.Scanner;

class ResultDeclaration{
    public static String declareResults( double subject1Marks,
    		double subject2Marks, double subject3Marks) 
    {
    	if (subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
    	{
    		return "Passed";
    	}
    	else if ((subject1Marks>60 && subject2Marks>60 && subject3Marks<60) 
    			||(subject1Marks>60 && subject2Marks<60 && subject3Marks>60)
    			||(subject1Marks<60 && subject2Marks>60 && subject3Marks>60))
    	{
    		return "Promoted";
    	}
    	else
    		return "Failed";
    }
		
}
public class Aq4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double subject1Marks=scanner.nextDouble(),
				subject2Marks=scanner.nextDouble(),
				subject3Marks=scanner.nextDouble();
		System.out.print(ResultDeclaration.declareResults(subject1Marks,subject2Marks,subject3Marks));
		scanner.close();

	}

}