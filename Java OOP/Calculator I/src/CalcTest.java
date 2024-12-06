public class CalcTest {

    public static void main(String[] args) {
        Calc calc=new Calc();
        calc.setOperandOne(10);
        calc.setOperandTwo(5.6);
        calc.setOperation('-');
        calc.performOperation();
        System.out.println(calc.getResult());

        calc.setOperation('+');
        calc.performOperation();
        System.out.println(calc.getResult());

    }
}