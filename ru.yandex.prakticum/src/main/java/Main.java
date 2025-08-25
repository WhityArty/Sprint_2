import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Создание массива продуктов
        Food[] items = {meat, redApple, greenApple};

        // Инициализация корзины
        ShoppingCart cart = new ShoppingCart(items);

        // Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPrice() + " руб.");
    }
}