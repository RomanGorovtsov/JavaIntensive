package Lesson_4;

import java.util.ArrayList;

public class Payment {
    public static void main(String[] args) {

        ArrayList<Products> shoppingList = new ArrayList<>();
        shoppingList.add(new Products("TV"));
        shoppingList.add(new Products("Phone"));
        shoppingList.add(new Products("PlayStation"));

        for (Products products: shoppingList) {
            System.out.println("Тип продукта: "+ products.nameOfProduct);
        }
    }

    public static class Products {
        String nameOfProduct;

        Products(String nameOfProduct) {
            this.nameOfProduct = nameOfProduct;
        }
    }

}
