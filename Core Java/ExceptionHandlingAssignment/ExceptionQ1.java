
import java.util.Scanner;

public class ExceptionQ1 
{
	public static void main(String[] args) 
	{
		int Total=0;
		try(Scanner scanner =new Scanner(System.in);) 
		{
			System.out.print("Enter first number :");
			int firstNumber = scanner.nextInt();
			System.out.print("Enter second number :");
			int secondNumber = scanner.nextInt();
			Total = firstNumber/secondNumber;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("error");
			System.out.println(e);
		}
	
		System.out.println(Total);

	}


}