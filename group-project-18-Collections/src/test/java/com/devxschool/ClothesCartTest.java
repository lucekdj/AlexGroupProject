package com.devxschool;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClothesCartTest {
    private ClothesCart cart;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        cart = new ClothesCart();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testAddClothes() {
        cart.addClothes("Blue T-Shirt", ClothesCart.Size.M);
        assertEquals(1, cart.cart.get(ClothesCart.Size.M).size());
        assertEquals("", outContent.toString());

        for (int i = 0; i < 10; i++) {
            cart.addClothes("Item " + i, ClothesCart.Size.S);
        }
        cart.addClothes("Too many items", ClothesCart.Size.S);
        assertEquals("Sorry, the cart is full for size S", outContent.toString().trim());
    }

    @Test
    public void testRemoveClothes() {
        cart.addClothes("Blue T-Shirt", ClothesCart.Size.M);
        cart.removeClothes("Blue T-Shirt", ClothesCart.Size.M);
        assertEquals(0, cart.cart.get(ClothesCart.Size.M).size());
        assertEquals("", outContent.toString());

        cart.removeClothes("Not in cart", ClothesCart.Size.S);
        assertEquals("Sorry, that item is not in the cart for size S", outContent.toString().trim());
    }

    @Test
    public void testUpdateClothes() {
        cart.addClothes("Blue T-Shirt", ClothesCart.Size.M);
        cart.updateClothes("Blue T-Shirt", "Green T-Shirt", ClothesCart.Size.M);
        assertEquals("Green T-Shirt", cart.cart.get(ClothesCart.Size.M).get(0));
        assertEquals("", outContent.toString());

        cart.updateClothes("Not in cart", "New item", ClothesCart.Size.S);
        assertEquals("Sorry, that item is not in the cart for size S", outContent.toString().trim());
    }
}
