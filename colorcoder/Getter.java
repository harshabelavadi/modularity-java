package colorcoder;

class Getter
{
	static int numberOfMinorColors = ColorNames.numberOfMinorColors;
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor = (MajorColor) fromIndex(zeroBasedPairNumber / numberOfMinorColors, true);
	        MinorColor minorColor = (MinorColor) fromIndex(zeroBasedPairNumber % numberOfMinorColors, false);
	        return new ColorPair(majorColor, minorColor);
	}
	
	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}
	
	static Object fromIndex(int targetIndex, boolean colorType)
	{
		Object colorValues[] = colorType? MajorColor.values(): MinorColor.values();
		int currentIndex;
		for(Object color: colorValues) {
			if (colorType)
				currentIndex = ((MajorColor)color).getIndex();
			else
				currentIndex = ((MinorColor)color).getIndex();
			
			if(currentIndex == targetIndex) {
				return color;
	         }
	       }
	       return null;
	    }
	}