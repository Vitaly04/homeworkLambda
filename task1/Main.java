package homework.lambda.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

        /*
        Причина ошибки - деление на ноль, переменная b получила ноль в результате вызова calc.minus.apply(1,1).
        Способы решения:
        1) изменить значение первого параметра calc.minus.apply(1,1) в чтобы результат был не равен 0;
        2) исправить метод device в классе Calculator, чтобы выбрасывалось исключение в случае деление на 0 :
        BinaryOperator<Integer> devide = (x, y) -> {
            try {
                if (y == 0)
                    throw new ArithmeticException("нельзя делить на ноль!");
                return x/y;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            return 0;
            };
         */
    }
}
