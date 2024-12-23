public class Shirt {
	public int shirtID = 0; // Default ID for the shirt
	public String description = "-description required-"; // default  
	// The color codes are R=Red, B=Blue, G=Green, U=Unset
	public char colorCode = 'U';
	public double price = 0.0; // Default price for all items
	public int quantityInStock = 0; // Default quantity for all items
  
	public void display() {
		System.out.println("======��A��T======");
		System.out.println("�s��: " + shirtID);
		System.out.println("����: " + description);
		System.out.println("�C��: " + colorCode);
		System.out.println("����: " + price);
		System.out.println("�w�s: " + quantityInStock);
	} // end of display method
} // end of class
