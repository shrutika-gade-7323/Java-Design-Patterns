public class Calculator {
    // No modifications in our Calculator Functionality.
    // We can keep adding extension by create new operations.
    public int calculateNumber(int number01, int number02, Operation operation) {
        return operation.perform(number01, number02);
    } 
}