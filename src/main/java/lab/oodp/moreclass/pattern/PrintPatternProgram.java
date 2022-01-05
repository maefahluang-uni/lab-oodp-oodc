package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {

    public void start() {
        
        printPatternOne();
        printPatternTwo();
        
    }
    public void printPatternOne() {
        System.out.println("First Pattern");
        //s TODO uncomment the lines below
        Pattern top = new Pattern(15, '*');
        
        Pattern sideOfFirstLine = new Pattern(7, '#');
        Pattern sideOfLine = new Pattern(7, '~');
        Pattern middle = new Pattern(1, '.');
        
        System.out.println(top);
        System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
        
        for (int i = 0; i < 6; i++) {
            middle.setNumberOfCharacters(middle.getNumberOfCharacters() + 1);
            System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
        }
    }
    
    public void printPatternTwo() {
        System.out.println("Second Pattern");
        
        //TODO: create pattern class and print outs first two line
        System.out.println(new Pattern(36, '@'));

        Pattern equalses = new Pattern(12, '=');
        Pattern dots = new Pattern(12, '.');
        System.out.println("" + equalses + dots + equalses);

        dots.setNumberOfCharacters(10);
        Pattern ampersands = new Pattern(13, '&');

        for (int i = 0; i < 6; i++) {
        	//TODO: print out the lines with & and .
            System.out.println("" + ampersands + dots + ampersands);
            ampersands.setNumberOfCharacters(ampersands.getNumberOfCharacters() + 1);
            dots.setNumberOfCharacters(dots.getNumberOfCharacters() - 2);
        }


    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}
