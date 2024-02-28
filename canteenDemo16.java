public class canteenDemo16 {
    public static void main(String[] args) {
        
        Item16 Item1 = new Item16();
        Item1.name = "cokies";
        Item1.price = 200000;
        Item1.stock = 100;

        Item16 Item2 = new Item16();
        Item2.name = "Macaron";
        Item2.price = 250000;
        Item2.stock = 98;

        Item16 Item3 = new Item16();
        Item3.name = "Coffee";
        Item3.price = 67000;
        Item3.stock =103;

        System.out.println("=====Item 1===== ");
        Item1.displayInfo();
        System.out.println("=====Item 2===== ");
        Item2.displayInfo();
        System.out.println("=====Item 3===== ");
        Item3.displayInfo();



    }
}
