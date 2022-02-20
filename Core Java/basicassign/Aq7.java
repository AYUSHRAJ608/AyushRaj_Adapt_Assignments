package basicassign;

class SearchArray
{
    public static boolean searchArray(int[] arr,int toCheckValue)
    {
    	boolean a=false;
    	for (int i=0;i<=arr.length-1;i++) 
    	{
    		if(arr[i]==toCheckValue)
    			a=true;
    	}
    	return a;
    }
}

public class Aq7 
{

	public static void main(String[] args) {
		int[] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        System.out.print(SearchArray.searchArray(arr,valueToCheck));

	}

}