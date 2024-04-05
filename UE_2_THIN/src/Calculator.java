import java.util.LinkedList;

public class Calculator {
    private LinkedList<Integer> stack = new LinkedList<>();

    public void calculate(String input, boolean stepMode) throws InterruptedException {
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                pushToStack(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '*') {
                pushToStack(ch);
            }
            if (stepMode) {
                System.out.println(stack);
                Thread.sleep(1000);
            }
        }
        System.out.println("Result: " + stack.pop());
    }

    private void pushToStack(int number) {
        stack.push(number);
    }

    private void pushToStack(char operator) {
        int num1 = stack.pop();
        int num2 = stack.pop();
        switch (operator) {
            case '+':
                stack.push(num1 + num2);
                break;
            case '*':
                stack.push(num1 * num2);
                break;
        }
    }
}