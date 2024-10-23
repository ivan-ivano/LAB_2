package Task3;

public class Task3 {
    public static void main(String[] args) {
    Product prod1 = new Product("Kiwi", 2, 3 ,2);
    Product prod2 = new Product("Apple", 3, 3 ,3);
    Product prod3 = new Product("Banana",10, 2 ,2);
    Product prod4 = new Product("Grapes", 3, 3 ,3);

    Cell cell1 = new Cell(5, 5, 5);

    cell1.addProduct(prod1);
    cell1.addProduct(prod2);
    cell1.addProduct(prod3);
    cell1.addProduct(prod4);
    cell1.addProduct(prod2);
    cell1.addProduct(prod1);
    cell1.printProducts();

    cell1.addProduct(prod4);

    }
}



