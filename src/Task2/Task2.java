package Task2;

public class Task2 {
    public static void main(String[] args) {
        D2Shape square = new Square(5);
        D2Shape circle = new Circle(5);
        D3Shape cube = new Cube(3);
        D3Shape sphere = new Sphere(5);

        System.out.println("\nTask2.Square area: " + square.getArea());
        System.out.println("Task2.Circle area: " + circle.getArea());

        System.out.println("\nTask2.Cube area: " + cube.getArea());
        System.out.println("Task2.Cube volume: " + cube.getVolume());

        System.out.println("\nTask2.Sphere area: " + sphere.getArea());
        System.out.println("Task2.Sphere volume: " + sphere.getVolume());
    }
}




















