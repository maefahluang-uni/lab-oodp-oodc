package lab.oodp.oop.test;

import org.junit.*;
import org.junit.Assert;

import lab.oodp.oop.Matrix;

public class TestMatrix {
	
	public Matrix matrix = null;

	@Before
	public void setUp() {
		matrix = new Matrix();
		matrix.setLetters("X X O O X O X O X ");
	}

	@Test
	public void testGetRow() {
		Assert.assertEquals("X X O" , matrix.getRow(1));
		Assert.assertEquals("O X O" , matrix.getRow(2));
		Assert.assertEquals("X O X" , matrix.getRow(3));

	}
	
	@Test
	public void testLeftDiagonal() {
		String row1 = matrix.getRow(1);
        String row2 = matrix.getRow(2);
        String row3 = matrix.getRow(3);
		String leftDiagonal = matrix.getLeftDiagonal(row1, row2, row3);
		Assert.assertEquals("X X X" , leftDiagonal);

	}
	
	@Test
	public void testRightDiagonal() {
		String row1 = matrix.getRow(1);
        String row2 = matrix.getRow(2);
        String row3 = matrix.getRow(3);
		String rightDiagonal = matrix.getRightDiagonal(row1, row2, row3);
		Assert.assertEquals("O X X" , rightDiagonal);

	}

}
