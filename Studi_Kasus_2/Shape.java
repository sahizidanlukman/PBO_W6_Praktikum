public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    // Method abstrak untuk menghitung luas area
    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}