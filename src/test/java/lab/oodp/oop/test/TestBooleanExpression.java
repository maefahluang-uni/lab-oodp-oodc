package lab.oodp.oop.test;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.control.BooleanExpression;

import static org.junit.Assert.assertEquals;

public class TestBooleanExpression {
    private BooleanExpression cr;

    @Before
    public void setup() {
        cr = new BooleanExpression();
    }

    @Test
    public void testTestForYesValid() {
        assertEquals(true, cr.testForYes('y'));
        assertEquals(true, cr.testForYes('Y'));
    }

    @Test
    public void testTestForYesInvalid() {
        assertEquals(false, cr.testForYes('n'));
        assertEquals(false, cr.testForYes('N'));
        assertEquals(false, cr.testForYes('x'));
    }

    @Test
    public void testTestForOddValid() {
        assertEquals(true, cr.testForOdd(1));
        assertEquals(true, cr.testForOdd(84651));
        assertEquals(true, cr.testForOdd(96837));
    }

    @Test
    public void testTestForOddInvalid() {
        assertEquals(false, cr.testForOdd(13548));
        assertEquals(false, cr.testForOdd(24));
        assertEquals(false, cr.testForOdd(956172));
    }

    @Test
    public void testStartsWithAValid() {
        assertEquals(true, cr.startsWithA("Andrew"));
        assertEquals(true, cr.startsWithA("alex"));
    }

    @Test
    public void testStartsWithAInvalid() {
        assertEquals(false, cr.startsWithA("Yu-Cheng"));
        assertEquals(false, cr.startsWithA("Cameron"));
    }

    @Test
    public void testIsTSwizzleValid() {
        assertEquals(true, cr.isTaylorSwift("Taylor Swift"));
    }

    @Test
    public void testIsTSwizzleInvalid() {
        assertEquals(false, cr.isTaylorSwift("Bob Marley"));
    }

    @Test
    public void testIsCorrectYearValid() {
        assertEquals(true, cr.isCorrectYear(1979));
        assertEquals(true, cr.isCorrectYear(1997));
        assertEquals(true, cr.isCorrectYear(2016));
    }

    @Test
    public void testIsCorrectYearInvalid() {
        assertEquals(false, cr.isCorrectYear(1977));
        assertEquals(false, cr.isCorrectYear(1978));
        assertEquals(false, cr.isCorrectYear(2013));
    }
}
