public class BodyIndex {
    public double calculate(int kg, double height) {
        double index = kg / Math.pow(height, 2);
        return index;
    }
}
