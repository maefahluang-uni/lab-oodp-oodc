package lab.oodp.oop;

public class Matrix {

    /**
     * Runs an example program.
     */
	String letters;
	
    private void start() {
        String row1 = getRow(1);
        String row2 = getRow(2);
        String row3 = getRow(3);
        printRows(row1, row2, row3);

        String leftDiagonal = getLeftDiagonal(row1, row2, row3);
        printDiagonal("Left",leftDiagonal);
        
        String rightDiagonal = getRightDiagonal(row1, row2, row3);
        printDiagonal("Right",rightDiagonal);
    }
    
    public void setLetters(String l) {
    	letters = l;
    }

    //TODO: complete this method to print out a row
    public String getRow(int row) {
        int len = 6;
        int start = (row - 1) * len;
        int end = row * len - 1;
        return letters.substring(start, end);
    }

    //TODO: complete this method to print out a left diagonal
    public String getLeftDiagonal(String row1, String row2, String row3) {
        return row1.charAt(0) + " " + row2.charAt(2) + " " + row3.charAt(4);
    }
    
    //TODO: complete this method to print out a right diagonal
    public String getRightDiagonal(String row1, String row2, String row3) {
        return row1.charAt(4) + " " + row2.charAt(2) + " " + row3.charAt(0);
    }


    public void printDiagonal(String remark, String diagonal) {
        System.out.println(remark+" Diagonal: " + diagonal);
    }
    

    public void printRows(String row1, String row2, String row3) {
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        Matrix ex = new Matrix();
        ex.setLetters("X X O O X O X O X ");
        ex.start();
    }
}
