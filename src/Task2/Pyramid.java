package Task2;

public class Pyramid extends D3Shape {
    private final double baseSide;
    private final double apothema;
    private final double height;

    public Pyramid(double baseSide, double apothema, double height) {
        this.baseSide = baseSide;
        this.apothema = apothema;
        this.height = height;
    }

    @Override
    public double getArea() {
        double baseArea = baseSide * baseSide;
        double basePer = baseSide * baseSide;
        double sideArea = 0.5 * basePer * apothema;
        return baseArea + sideArea;
    }

    @Override
    public double getVolume() {
        return (baseSide * baseSide * height) / 3;
    }
}