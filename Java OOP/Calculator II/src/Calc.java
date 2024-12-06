public class Calc {
    private double currentValue;
    private String lastOperation;

    public Calc performOperation(double num) {
        if (lastOperation == null) {
            currentValue = num;
        } else {
            switch(lastOperation) {
                case "+":
                    currentValue += num;
                    break;
                case "-":
                    currentValue -= num;
                    break;
                case "*":
                    currentValue *= num;
                    break;
                case "/":
                    currentValue /= num;
                    break;
            }
        }
        lastOperation = null;
        return this;
    }

    public Calc performOperation(String op) {
        lastOperation = op;
        return this;
    }

    public double getResult() {
        return currentValue;
    }
}