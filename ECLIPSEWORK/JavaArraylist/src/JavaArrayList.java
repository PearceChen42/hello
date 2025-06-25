import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburrger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		
		for(int i = 0 ; i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
