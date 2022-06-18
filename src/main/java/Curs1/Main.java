package Curs1;

import java.util.Collections;

public class Main {

    public static void main(String [] args) {

        Product product1 = new Product("TV", 2345, Collections.singletonList(Category.ELECTRONICS), "description_1");
        Product product2 = new Product("Laptop", 44567, Collections.singletonList(Category.CLOTHES), "description_2");
        Product product3 = new Product("MAC", 45567, Collections.singletonList(Category.FOOD), "description_3");

        System.out.println("First product " + product1);
        System.out.println("Second product " + product2);
        System.out.println("# product " + product3);

    }



}
//modificarea campurilor din clasa  Product nu vor putea fi modificate ca sunt setate ca private si final si nu pot fi schimbate valorile;
