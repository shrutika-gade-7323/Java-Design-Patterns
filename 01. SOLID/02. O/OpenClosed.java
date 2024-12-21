public class OpenClosed {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation add = new AddOperation();
        Operation sub = new SubtractOperation();

        System.out.println("Addition: " + calculator.calculateNumber(1, 1, sub));
    }
}