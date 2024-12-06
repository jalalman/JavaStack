public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
    double result = calc
    .performOperation(10.5)
    .performOperation("+")
    .performOperation(5.2)
    .performOperation("*")
    .performOperation(10)
    .performOperation("=")
    .getResult();

    System.err.println(result);
    }
}
