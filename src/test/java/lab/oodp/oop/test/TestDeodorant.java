package lab.oodp.oop.test;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.oop.Deodorant;

import static org.junit.Assert.assertEquals;


public class TestDeodorant {

    private Deodorant deo1, deo2;

    @Before
    public void setUp() {
        deo1 = new Deodorant("Gentle", "Baby Powder", 4.99);
        deo2 = new Deodorant("Spring", "Blossom", 3.99);
    }

    @Test
    public void testPrice() {

        assertEquals(4.99, deo1.getPrice(), 1e-10);
        assertEquals(3.99, deo2.getPrice(), 1e-10);

        deo1.setPrice(2.56);
        assertEquals(2.56, deo1.getPrice(), 1e-10);

    }

    @Test
    public void testBrand() {

        assertEquals("Gentle", deo1.getBrand());
        assertEquals("Spring", deo2.getBrand());

        deo2.setBrand("Lynx");
        assertEquals("Lynx", deo2.getBrand());

    }


    @Test
    public void testFragrance() {

        assertEquals("Baby Powder", deo1.getFragrance());
        assertEquals("Blossom", deo2.getFragrance());

        deo1.setFragrance("Garbage");
        assertEquals("Garbage", deo1.getFragrance());
    }

    @Test
    public void testMoreExpensiveThan() {

        assertEquals(true, deo1.isMoreExpensiveThan(deo2));
        assertEquals(false, deo2.isMoreExpensiveThan(deo1));

        deo1.setPrice(3);

        assertEquals(false, deo1.isMoreExpensiveThan(deo2));
        assertEquals(true, deo2.isMoreExpensiveThan(deo1));

        deo2.setPrice(3);

        assertEquals(false, deo1.isMoreExpensiveThan(deo2));
        assertEquals(false, deo2.isMoreExpensiveThan(deo1));

    }

}
