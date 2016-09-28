package model;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class NotMain {

    public static void NotMain(String[] args) {
        Locale locale = new Locale("no", "US");
        ResourceBundle apptexts = ResourceBundle.getBundle("apptexts", locale);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

	    Product car = new Product(
	            apptexts.getString("car_name"),
                Double.parseDouble(apptexts.getString("car_price"))
        );

        Product house = new Product(
                apptexts.getString("house_name"),
                Double.parseDouble(apptexts.getString("house_price"))
        );

        Cart cart = new Cart();
        cart.addProduct(car);
        cart.addProduct(house);

        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + " " + formatter.format(product.getPrice()));
        }

    }
}
