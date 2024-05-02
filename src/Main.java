
public class Main {

	public static void main(String[] args) {

		// array = used to store multiple values in a single variable

		
		//One way os creating an array 
		String[] cars = { "Volvo", "Camaro", "Toyota ", "BMW", "Tesla" };
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		
		System.out.println();
		
		//Other way of creating a array
		String [] food = new String[3];

		food[0] = "Pizza";
		food[1] = "Burger";
		food[2] = "Fish";

		for ( int i = 0 ; i < food.length ; i ++){
			System.out.println(food[i]);
		}

	}

}
