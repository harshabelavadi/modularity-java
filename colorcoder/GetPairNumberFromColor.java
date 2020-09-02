package colorcoder;

import colorcoder.Constants.MajorColor;
import colorcoder.Constants.MinorColor;
import colorcoder.Constants.numberOfMinorColors;

static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
}