public class Calc {
    private double operandOne;
    private double operandTwo;
    private char operation;
    private double result;
    public Calc(){
        this.operandOne=0;
        this.operandTwo=0;
        this.result=0;
        this.operation='+';
    }


    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    public double getResult() {
        return this.result;
    }

    public double performOperation(){
        if(this.operation=='+'){
            return this.result= this.operandOne + this.operandTwo;
        }
        else if(this.operation=='-'){
            return this.result= this.operandOne - this.operandTwo;
        }
        return 0;
    }

}
