public class BadCalculator {
    // This is a bad design where we are taking type of operation and for each type we have cases.
    // Now if we want to introduce division, we have to modify the calculator.
    // Open/Closed Principle states that we shouldn't be allowed to modify our classes and objects once created.
    // We should only be allowed to extend it.
    public int calculateNumber(int number01, int number02, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = number01 + number02;
                break;
            
            case "sub":
                result = number01 - number02;
        }
        return result;
    }
}
