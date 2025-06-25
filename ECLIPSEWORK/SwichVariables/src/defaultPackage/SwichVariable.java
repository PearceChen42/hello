/**
 * 
 */
package defaultPackage;

/**
 * 
 */
public class SwichVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		System.out.println("X:"+x+" "+"y:" +y);
		temp = x;
		x=y;
		y=temp;
		System.out.println("X:"+x+" "+"y:" +y);
	}

}
