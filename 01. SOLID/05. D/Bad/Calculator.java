/**
 * Parent Module or Main Module of calculator which helps to calculate as per user's choice.
 * As per DIP Rule, it states:
 * High-Level Modules should not depend on Low-Level Modules. Both should depend on abstraction
 * --- So the above rule is broken. Our calculator class is directly dependent on low-level class.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * --- Also is dependent on actual class.
**/

public class Calculator {
    public int calculate (int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                result = a + b;
            case "sub":
                result = a - b;
        }
        return result;
    }
}
