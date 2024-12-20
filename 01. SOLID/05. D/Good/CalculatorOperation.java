/** 
 * This is low-level modules interface, so anything to invoke in low-level modules needs to go via this interface.
 * By this we will achieve both loosely couple between high level and low level modules and abstraction as well.**/

public interface CalculatorOperation {
    public int calculate (int a, int b);
}
