import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DiscountCalculator_v_1_0_0 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("What is the product price?");
            Scanner scanner = new Scanner(System.in);
            double productPrice = scanner.nextDouble();

            System.out.println("What is the value of discount?");
            int discountValue = scanner.nextInt();

            productPrice = productPrice - (productPrice * discountValue / 100);

            BigDecimal newPrice = new BigDecimal(productPrice).setScale(2, RoundingMode.HALF_UP);

            System.out.println("New product price: " + newPrice.doubleValue());

        }
    }
}