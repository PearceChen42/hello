import java.util.*;
public class Java2DArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> groceryList=new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("soda");
		drinkList.add("coffee");
	
		 groceryList.add(produceList);
		 groceryList.add(drinkList);
		 groceryList.add(bakeryList);
		
		
		System.out.println(groceryList.get(0).get(2));	
	}

}
