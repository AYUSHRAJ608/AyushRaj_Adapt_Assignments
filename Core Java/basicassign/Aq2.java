package basicassign;
public class Aq2 
{
    public static void main (String [] args) 
    {
    	for (int i=100;i<=999;i++) 
    	{
			String a[]=String.valueOf(i).split("");
			int b=0;
			for (int j=0;j<a.length;j++) 
			{
				b += (int)Math.pow(Integer.parseInt(a[j]), 3);
			}
			if(i==b)
				System.out.println(i);
    	}
    }
}

