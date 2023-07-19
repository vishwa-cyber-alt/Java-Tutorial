import java.util.HashMap;
public class One
{
	public static void main(String args[])
	{
	HashMap<String,Integer> n=new HashMap<>();
	n.put("ph",12);
	n.put("n",1);

	System.out.println(n);
	//getting value use get
	System.out.println("value of "+n.get("n"));
	}
}
