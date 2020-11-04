import java.util.*;

public class Main {
	public static void main(String args[]) {
		ArrayList<Drink> drinkList = new ArrayList<Drink>();
		//create Drink objects
		Drink ojJuice = new Drink("Juice", "Orange Juice", false, "made from orages");
		Drink budBeer = new Drink("Beer", "Budweiser", true, "5%");
		Drink pepSoda = new Drink("Soda", "Pepsi", true, "");
		//add Drinks to ArrayList
		drinkList.add(ojJuice);
		drinkList.add(budBeer);
		drinkList.add(pepSoda);
		//print attributes of each Drink object
		for(Drink aDrink : drinkList) {
			aDrink.printAttributes();
		}
	}
}
