package Curs1;

import java.util.List;

public class Product {

    private final String name;
    private final int price;
    private final List<Category> list;
    private final String dscription;

    public Product(String name, int price, List<Category> list, String dscription) {
        this.name = name;
        this.price = price;
        this.list = list;
        this.dscription = dscription;
    }

    public String getDscription() {
        return dscription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", list=" + list +
                ", dscription='" + dscription + '\'' +
                '}';
    }
}

enum Category{
    ELECTRONICS,
    CLOTHES,
    FOOD,
    DYI
}
