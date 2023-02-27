package unit_test.hw;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setProducts(testListProducts());
        Collections.shuffle(shop.getProducts());

        // 1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
        assertThat(shop.getProducts()).hasSize(5);

        // 2. Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(testListProducts().get(4).getCost());

        // 3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.getSortedListProducts().get(0).getCost()).isEqualTo(0);
        assertThat(shop.getSortedListProducts().get(1).getCost()).isEqualTo(50);
        assertThat(shop.getSortedListProducts().get(2).getCost()).isEqualTo(100);
        assertThat(shop.getSortedListProducts().get(3).getCost()).isEqualTo(150);
    }

    public static List<Product> testListProducts() {
        List<Product> productList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            product.setCost(i * 50);
            product.setTitle("Product: " + i);
            productList.add(product);
        }

        return productList;
    }
}




