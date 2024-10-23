package Task3;


import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int length;
    private final int width;
    private final int height;
    private final List<Product> itemsList;

    public Cell(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        itemsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (itemsList.size() >= 5) {
            System.out.println("Too many products");
        } else if (product.getLength() < this.getLength() &&
                product.getWidth() < this.getWidth() &&
                product.getHeight() < this.getHeight()) {
            itemsList.add(product);
        } else {
            System.out.println("Invalid size");
        }
    }

    public void printProducts() {
        System.out.println("Products in cell:");
        int i = 1;
        for (Product product : itemsList) {
            System.out.println(STR."\{ i } \{product}");
            i++;
        }
   //     for (int i = 0; i < itemsList.size(); i++) {
   //         System.out.println(STR."\{i + 1})\{itemsList.get(i)}");
   //     }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}