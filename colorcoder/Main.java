package colorcoder;

public class Main {

    public static void main(String[] args) {
        RunTests.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        RunTests.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        RunTests.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        RunTests.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
