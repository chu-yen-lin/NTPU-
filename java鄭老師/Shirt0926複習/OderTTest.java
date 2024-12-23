public class OderTTest {
public static void main (String[] args){
Order o1 = new Order();
Shirt s1 = new Shirt();
s1.shirtID = 1;
s1.description = "Polo Shirt";
s1.colorCode = 'B';
s1.price = 397.1;
s1.quantityInStock = 2;
double amount = o1.addShirt(s1);
System.out.print("買了一件"+s1.description);
System.out.println("購物車金額:"+amount);

Shirt s2 = new Shirt();
s2.shirtID = 2;
s2.description = "Tee Shirt";
s2.colorCode = 'G';
s2.price = 97.1;
s2.quantityInStock = 8;
amount = o1.addShirt(s2);
System.out.print("買了一件"+s2.description);
System.out.println("購物車金額:"+amount);


Shirt s3 = new Shirt();
s3.shirtID = 3;
s3.description = "naked Shirt";
s3.colorCode = 'Y';
s3.price = 897.6;
s3.quantityInStock = 6;
amount = o1.addShirt(s3);
System.out.print("買了一件"+s3.description);
System.out.println("購物車金額:"+amount);

System.out.println("結帳...");
o1.display();



}

}