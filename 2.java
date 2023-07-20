import java.util.HashMap;
public class Main
{
	public static void main(String args[])
	{
		HashMap<String,Integer> a=new HashMap<>();
		a.put("dell",9800);
		a.put("hp",78000);
	//	System.out.println(a.remove("dell"));
		//System.out.println(a.size());

		//System.out.print(a);
		for(Integer i:a.values()){
			System.out.println(i);
		}
	}
}