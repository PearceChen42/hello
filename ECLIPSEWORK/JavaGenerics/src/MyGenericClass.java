
public class MyGenericClass <Thing extends Number,T2 extends String> {
	Thing x;
	T2 y;
	MyGenericClass(Thing x,T2 y) {
		this.x = x;
		this.y = y;
		
	}
	
	public T2 getValue() {
		return  y;
	}
}
