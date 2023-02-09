package com.devxschool;

import java.util.*;

public class ClothesCart {
    /**
     * One famous cloth store is refactoring their existing code.
     * Create methods for add, delete, and update cart using ArrayLists and Enums created
     * <p>
     * Following error messages should be included:
     * 'Sorry, the cart is full for size S' - when carts limit is reached (by default 10 items)
     * 'Sorry, that item is not in the cart for size S' - for remove and update when can't find item in a cart
     */


    // Cart of size 10 items, no more allowed
    public static Map<Size, List<String>> cart = new EnumMap<>(Size.class);
    private static final int CART_SIZE = 10;

    // Generates catalogue of all clothes by size
    public ClothesCart() {
        for (Size size : Size.values()) {
            cart.put(size, new LinkedList<>());
        }
    }

    // Sizes of clothes
    public enum Size {
        XS, S, M, L, XL, XXL
    }

    public static void main(String[] args) {
        ClothesCart cart = new ClothesCart();
        addClothes("Blue T-Shirt", Size.M);
        addClothes("Black Jeans", Size.M);
        addClothes("Red Dress", Size.S);
        System.out.println("Cart for size M: " + ClothesCart.cart.get(Size.M));
        removeClothes("Black Jeans", Size.M);
        System.out.println("Cart for size M after removing Black Jeans: " + ClothesCart.cart.get(Size.M));
        addClothes("Yellow Shirt", Size.L);
        addClothes("Green Pants", Size.L);
        System.out.println("Cart for size L: " + ClothesCart.cart.get(Size.L));
        updateClothes("Green Pants", "Green Shorts", Size.L);
        System.out.println("Cart for size L after updating Green Pants to Green Shorts: " + ClothesCart.cart.get(Size.L));
        System.out.println("Cart for all clothes: " + ClothesCart.cart);
    }

    /**
     * One famous cloth store is refactoring their existing code.
     * Create methods for add, delete, and update cart using ArrayLists and Enums created
     * <p>
     * Following error messages should be included:
     * 'Sorry, the cart is full for size S' - when carts limit is reached (by default 10 items)
     * 'Sorry, that item is not in the cart for size S' - for remove and update when can't find item in a cart
     */
    public static void addClothes(String clothes, Size size) {
        // TODO implement this method
        List<String> cloth = cart.get(size);    //new ArrayList<>();
        if (cloth.size() > CART_SIZE) {
            System.out.println("Sorry, the cart is full for size " + size);
        } else {
            cloth.add(clothes);
        }
    }

    public static void removeClothes(String clothes, Size size) {
        // TODO implement this method
        List<String> cloth = cart.get(size);
        if (cloth.contains(clothes)) {                              //  for(String item : cloth){
            cloth.remove(clothes);                                                    //    if(item.equals(clothes)){cloth.remove(clothes);
        } else {
            System.out.println("Sorry, that item is not in the cart for size " + size);

        }

    }

    public static void updateClothes(String oldClothes, String newClothes, Size size) {
        // TODO implement this method
        List<String> cloth = cart.get(size);

        if(cloth.contains(oldClothes)){
            int place = cloth.indexOf(oldClothes);
            cloth.set(place, newClothes);
        }else{
            System.out.println("Sorry, that item is not in the cart for size " + size);
        }

    }
    }