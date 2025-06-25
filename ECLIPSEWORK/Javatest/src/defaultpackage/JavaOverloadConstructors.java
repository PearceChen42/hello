package defaultpackage;

public class JavaOverloadConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		
		System.out.print("Here are the ingredients of your pizza:");
		System.out.print(pizza.bread +" "+ pizza.cheese +" " +pizza.sauce + " " + pizza.topping );
	}

}
