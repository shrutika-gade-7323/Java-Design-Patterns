public class OpenClosed {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation add = new AddOperation();
        Operation subtract = new SubtractOperation();

        System.out.println("Addition: " + calculator.calculateNumber(1, 1, add));
        System.out.println("Subtraction: " + calculator.calculateNumber(1, 1, subtract));
    }
}
