package unit_test.lection;

import unit_test.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestCalculation {

    public static void main(String[] args) {
        testCalculatingDiscount();
    }

    /**
     * Нужно написать в калькуляторе метод вычисления суммы покупки
     * (метод принимает сумму, процент скидки и возвращает сумму со скидкой) и проверить его используя AssertJ
     * (отрицательное числа, 0, проценты >= 100% , процент < 0%, обычные скидки).
     * Все ошибки должны быть обработаны,
     * при вводе недопустимых аргументов можно выбрасывать (throw new ArithmeticException("Суть ошибки");), но нужно проверить, что все ошибки проверяются в тестах.
     * (Заготовки метода уже есть в классе Calculator - calculatingDiscount).
     * Само решение необходимо записать в класс CalculatorTest, очистив перед этим данный класс
     * (сейчас там находятся лекционные примеры, для самостоятельного изучения)
     */
    public static void testCalculatingDiscount() {
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 5)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -23)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 100)).isInstanceOf(ArithmeticException.class);

        assertThat(Calculator.calculatingDiscount(0, 5)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(100, 0)).isEqualTo(100);
        assertThat(Calculator.calculatingDiscount(100, 5)).isEqualTo(95);
    }
}
