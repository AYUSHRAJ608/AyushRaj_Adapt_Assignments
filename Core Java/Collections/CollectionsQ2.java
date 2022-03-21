import java.util.HashSet;

public class CollectionsQ2 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("Laptop");
		hs.add("Mouse");
		hs.add("Speaker");
		hs.add("Spartphone");
		hs.add("Earphone");
		hs.add("Headphone");
		hs.add("Keyboard");
		hs.add("Charger");
		hs.add("Graphic Cards");
		hs.add("Notebook");
		
		System.out.println("Original");
		System.out.println(hs);

		
		hs.add("Earphone");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
	}
}