/**
 * Parent Module or Main Module of calculator which helps to calculate as per user's choice.
 * As per DIP Rule, it states:
 * High-Level Modules should not depend on Low-Level Modules. Both should depend on abstraction.
 * --- So low-level is dependent via CalculatorOperation rather being dependent on add or subtract operation.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * --- Abstraction is achieved as via interface we are entering in low-level.
**/

public class Calculator {
    public int calculate (int a, int b, CalculatorOperation operation) {
        return operation.calculate(a, b);
    }
}
