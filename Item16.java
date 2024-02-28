public class Item16 {
    public String name;
    public double price;
    public int stock;

    public Item16() {

    }
    public Item16(String nama, double harga, int sisa) {
        name = nama;
        price = harga;
        stock = sisa;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
