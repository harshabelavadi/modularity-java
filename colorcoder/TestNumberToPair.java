package colorcoder;

import colorcoder.Constants.MajorColor;
import colorcoder.Constants.MinorColor;
import colorcoder.GetColorFromPairNumber;

static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
}