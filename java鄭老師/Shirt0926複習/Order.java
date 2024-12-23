public class Order {
    public int orderId=153122;
    public double totalPrice = 0.0; // Default total price for order
    public Shirt[] shirts = new Shirt[5];
    public int itemNo = 0;

    public double addShirt(Shirt shirt) {
		shirts[itemNo] = shirt;
		itemNo++;
		totalPrice = totalPrice + shirt.price;
		return totalPrice;
        
            
            
        }
        
    

    public void display() {
        System.out.println("====="+orderId+"號訂單資訊=====");
		for (int i = 0; i <itemNo; i++) {
            shirts[i].display();
        }
        System.out.println("-----------------");
        System.out.println("訂單總金額: " + totalPrice);
    }
} // end of class



