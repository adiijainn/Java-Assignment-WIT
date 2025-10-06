
interface Sellable {
    void displayItemDetails();

    int getPrice();
}

abstract class Product {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    abstract int calculateDiscount();
}

class ElectronicItem extends Product implements Sellable {
    int price;

    ElectronicItem(String name, String category, int price) {
        super(name, category);
        this.price = price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + calculateDiscount());
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    int calculateDiscount() {

        return price - (price * 10 / 100);
    }
}

class ClothingItem extends Product implements Sellable {
    int price;

    ClothingItem(String name, String category, int price) {
        super(name, category);
        this.price = price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + calculateDiscount());
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    int calculateDiscount() {

        return price - (price * 20 / 100);
    }
}

public class Products {
    public static void main(String[] args) {
        Sellable item = new ElectronicItem("Laptop", "Electronics", 50000);
        item.displayItemDetails();
    }
}
