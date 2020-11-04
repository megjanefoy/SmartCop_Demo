
public class Drink {
	String drinkType = "";
	String drinkName = "";
	String drinkDescription = "";
	boolean isCarbonated = false;
			
	/*
	 * Defines a Drink object.
	 */
	public Drink(String drinkType, String drinkName, boolean isCarbonated, String drinkDescription) {
		this.drinkType = drinkType;
		this.drinkName =  drinkName;
		this.isCarbonated = isCarbonated;
		this.drinkDescription = drinkDescription;
	}
	
	/*
	 * Method for printing attributes of a specific Drink object.
	 */
	public void printAttributes() {
		System.out.print(drinkName);
		if (isCarbonated) {
			System.out.print(", carbonated");
		}
		else {
			System.out.print(", not carbonated");
		}
		if (drinkDescription.length() > 1) {
			System.out.print(", " + drinkDescription + ". ");
		}
		else {
			System.out.print(". ");
		}
	}
}
