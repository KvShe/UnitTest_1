package unit_test.hw;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements Comparable<Product> {
    private int cost; // Стоимость продукта
    private String title; // Название


    @Override
    public int compareTo(Product product) {
        return this.cost - product.getCost();
    }

    @Override
    public String toString() {
        return cost + " " + title;
    }
}
