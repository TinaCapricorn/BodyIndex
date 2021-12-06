public class Main {
    public static void main(String[] args) {
        BodyIndex service = new BodyIndex();
        int kg = 70;
        double height = 1.65;
        double index = service.calculate(kg, height);
        System.out.println(index);
    }
}
