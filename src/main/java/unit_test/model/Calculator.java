package unit_test.model;

public class Calculator {
    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0) {
            throw new ArithmeticException("purchaseAmount < 0");
        }

        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("discountAmount mey be 0 - 100%");
        }

        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }
}
