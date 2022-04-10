package Calculator;

public class CalculatorAbstractInheritance extends CalculatorAbstract {

    @Override
    void calculate(double firstNumber, double secondNumber, String mathOperation) {
        if (mathOperation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Такой математической операции не существует");
        }


    }
}
