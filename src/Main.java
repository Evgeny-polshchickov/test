import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Введите первое число: ");
            double operand1 = scanner.nextInt();

            System.out.println("Введите операцию: ( + , - , * , / или 'c' - чтобы стереть результат.)");
            char operation = scanner.next().charAt(0);

            System.out.println("Введите второе число: ");
            double operand2 = scanner.nextInt();


            switch (operation) {
                case 'c':
                    result = 0;
                    break;
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Ошибка, деление на ноль!");
                        return;
                    } else {
                        result = operand1 / operand2;
                        break;
                    }
                default:
                    System.out.println("Ошибка, такой операции не существует");
                    return;
            }

            System.out.println("Результат: " + result);
        }
    }
}