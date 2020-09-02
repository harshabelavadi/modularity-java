package colorcoder;

import colorcoder.Constants.MajorColor;
import colorcoder.Constants.MinorColor;
import colorcoder.Constants.numberOfMinorColors;
import colorcoder.ColorPair;

static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
}
