
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
		
		countries.replace("USA", "Detroit");
		
		System.out.println(countries);
		
		countries.remove("USA");
		System.out.println(countries);
		
		System.out.println(countries.get("Russia"));
		
		System.out.println(countries.size());
		
		boolean b = countries.containsKey("England");
		System.out.println(b);
		
		b = countries.containsValue("Beijing");
		System.out.println(b);
		
		for(String i : countries.keySet()) {
			System.out.println(i + ":" + countries.get(i));
		}
		
		countries.clear();
		System.out.println(countries);
		
		
	}

}
