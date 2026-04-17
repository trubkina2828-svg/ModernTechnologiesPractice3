package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discountPercent = 0.0;

        switch (customerType.toLowerCase()) {
            case "vip":
                discountPercent = 0.30;
                break;
            case "regular":
                discountPercent = 0.10;
                break;
            case "new":
                discountPercent = 0.15;
                break;
            default:
                discountPercent = 0.0;
        }

        return price * discountPercent;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discountPercent = 0.0;

        if (purchaseCount >= 100) {
            discountPercent = 0.20;
        } else if (purchaseCount >= 50) {
            discountPercent = 0.15;
        } else if (purchaseCount >= 10) {
            discountPercent = 0.10;
        }

        return price * discountPercent;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discountPercent = 0.0;

        if ("SAVE10".equalsIgnoreCase(promoCode)) {
            discountPercent = 0.10;
        } else if ("SAVE20".equalsIgnoreCase(promoCode)) {
            discountPercent = 0.20;
        }

        if (isFirstOrder) {
            discountPercent += 0.05;
        }

        discountPercent = Math.min(discountPercent, 0.30);

        return price * discountPercent;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discountPercent = 0.0;

        // Скидка по возрасту
        if (age >= 60) {
            discountPercent = 0.15;
        } else if (age >= 18 && age <= 25) {
            discountPercent = 0.10;
        } else if (age < 18) {
            discountPercent = 0.20;
        }

        discountPercent = Math.min(discountPercent, 0.50);

        return price * discountPercent;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}
