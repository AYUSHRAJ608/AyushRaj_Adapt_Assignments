class SingletonInheritanceCheck
{
	private static SingletonInheritanceCheck single_instance = null;
	public String s;
	private SingletonInheritanceCheck()
    {
        s = "Hello I am a string part of Singleton class";
    }
	public static SingletonInheritanceCheck getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonInheritanceCheck();
 
        return single_instance;
    }
}
public class Assignment2Q1 
{
	public static void main(String args[])
    {
		SingletonInheritanceCheck x = SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck y = SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck z = SingletonInheritanceCheck.getInstance();
		
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		System.out.println("Hashcode of z is "+ z.hashCode());
		
		if (x == y && y == z) 
		{
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else 
        {
        	System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
