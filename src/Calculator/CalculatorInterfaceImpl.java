package Calculator;

import java.util.Scanner;

public class CalculatorInterfaceImpl implements CalculatorInterface {

    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.err.println("Неправильный тип данных. Введите число");
        }
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите операцию +, -, *, /");
        String mathOperation = scanner.next();
        while (scanner.hasNext("[*+/-]")) {
            scanner.next();
            System.err.println("Введите правильное значение: +, -, *, / ");
                }

        System.out.println("Введите второе число");
    scanner.close();
    }



    @Override
    public void action(double firstNumber, double secondNumber, String mathOperation) {
        switch (mathOperation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Нет такой математической операции");

        }
}
}
