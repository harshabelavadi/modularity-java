package colorcoder;

import colorcoder.Constants.MajorColor;
import colorcoder.Constants.MinorColor;

static class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    String ToString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
};
