import java.util.Scanner;

public class hw2_11_04 {
    public static void main(String[] args) {
//          Создайте методы с математическими операциями +, -, *, /
//          Каждый метод принимает два числа в параметрах и возвращает результат
//          Вызовите все методы в main
//          Результат распечатайте в консоль

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        System.out.println("Введите желаемое действие:");
        char decision = scanner.next().charAt(0);

        if (decision == '+'){
            System.out.println(num1 + num2);
        }
        if (decision == '-'){
            System.out.println(num1 - num2);
        }
        if (decision == '*'){
            System.out.println(num1 * num2);
        }
        if (decision == '/'){
            System.out.println(num1 / num2);
        }
    }
}
