
public class JavaArrayOfobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		food[] refrigerator = new food[3];
		food food1 = new food("pizza");
		food food2 = new food("hamburger");
		food food3 = new food("hotdog");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		for (food i : refrigerator) {
			System.out.println(i.name);
		}
		
	}

}
