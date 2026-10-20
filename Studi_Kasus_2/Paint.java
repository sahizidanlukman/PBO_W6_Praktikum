public class Paint {
    private double coverage; // luas area (sq ft) yang dicakup per galon

    public Paint(double c) {
        coverage = c;
    }

    // Parameter 'Shape s' bersifat polimorfik, menerima objek Sphere, Rectangle, maupun Cylinder
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
