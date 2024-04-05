public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        String input = "34+34+*";
        boolean stepMode = true; // Set to false for run mode
        calculator.calculate(input, stepMode);
    }
}