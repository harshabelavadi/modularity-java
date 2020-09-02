package colorcoder;

import colorcoder.Constants.MajorColor;
import colorcoder.Constants.MinorColor;
import colorcoder.GetPairNumberFromColor;

static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
{
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
}