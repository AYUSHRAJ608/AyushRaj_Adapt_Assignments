import java.util.ArrayList;
import java.util.List;

public class FrameworkQ3 {

	public static void main(String[] args) {
		String string ="A quick brown fox jumps over the lazy dog";
		String[] splitArray = string.split(" ");
		List<String> splitList = new ArrayList<>();
		for (String i : splitArray) {
			splitList.add(i);
		}
		System.out.println(splitList);
		String[] arraySplit = new String[splitList.size()];
		splitList.toArray(arraySplit);
		for(String k : arraySplit)
			System.out.println(k);

	}

}