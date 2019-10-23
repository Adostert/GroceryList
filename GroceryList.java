import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {

		String userFruit, input = null, userInput;
		double sum = 0; 
		boolean isValid = true;

		char cont;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Guenthers Market!");
		// maps are very effiecent at retrieving data from memory
		List<String> item = new ArrayList<>();
		List<Double> cost = new ArrayList<>();
		Map<String, Double> items = new HashMap<>();
		items.put("apple", 0.99);
		items.put("banana", 0.59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("elderberry", 1.79);
		items.put("figs", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);
		System.out.println("===================");

//		for(int i = 0; i < items.size(); i++ ) {
//			System.out.println(items.get(i));

//		items.put("Apple", 0.40);
//		System.out.println(items); // Changes price of "Apple"
		// You'll need to use enhanced for loop to iterate or loop through
//		int counter = 1; 
		do {

			for (String key : items.keySet()) {
				System.out.println(key + " $" + items.get(key));
			}
			userInput = Validator.getString(scan, "What items would you like to order?");
			if (items.keySet().contains(userInput.toLowerCase())) {
				item.add(userInput);
				cost.add(items.get(userInput));
				System.out.println("Adding " + userInput + " to your cart at " + "$" + items.get(userInput));
				userInput = Validator.getString(scan, "Would you like to add anything else? y/n");
				if (userInput.charAt(0) != 'y') {
					isValid = false; 
				}
				else {
					System.out.println("Sorry, we do not have those.");
				}
			}

//		
//			System.out.println("Adding " + input + " to your cart at " + "$" +items.get(input));

		

		} while (isValid);

		System.out.println("Thanks for your order \nHere's what you got:");
		for (int i = 0; i < item.size(); i++) {
			System.out.println(item.get(i) + " " + cost.get(i));
		}
			 for(double num : cost) {
		            sum += num;
		        }
		        System.out.println(sum/(double)cost.size());
		       
		}

//		

	}


