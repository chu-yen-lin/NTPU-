public class Order {
    public int orderID = 101;
    public double totalPrice = 0.0; // Default total price for order
    public Shirt[] shirts = new Shirt[5];
    public int itemNum = 0;

    public double addShirt (Shirt shirt) {
         
            shirts[itemNum] = shirt;
			itemNum++;
			
            totalPrice = totalPrice + shirt.price;
			return totalPrice;
        }
        
    

    public void display() {
        System.out.println("====="+orderID+"號訂單資訊=====");
	
        for (int i = 0; i < itemNum; i++) {
            shirts[i].display();
        }
        System.out.println("-----------------");
        System.out.println("總價: " + totalPrice);
    }
} // end of class



