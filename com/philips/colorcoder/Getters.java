package com.philips.colorcoder;

class Getters
{
	static int numberOfMinorColors = ColorNames.numberOfMinorColors;
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor = (MajorColor)fromIndex(zeroBasedPairNumber / numberOfMinorColors, true);
	        MinorColor minorColor = (MinorColor)fromIndex(zeroBasedPairNumber % numberOfMinorColors, false);
	        return new ColorPair(majorColor, minorColor);
	}
	
	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}
	
	static IColor fromIndex(int index, boolean colorType)
	{
		IColor colorValues[] = colorType? MajorColor.values(): MinorColor.values();
		
		for(IColor color: colorValues) {
			
			if(color.getIndex() == index) {
				return color;
	         }
	       }
	       return null;
	    }
	}