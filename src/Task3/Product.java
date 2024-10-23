package Task3;

public class Product {
    private final int length;
    private final int width;
    private final int height;
    private final String name;

    public Product(String name, int length, int width, int height ) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."\{name}: length=\{length}, width=\{width}, height=\{height}";

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
