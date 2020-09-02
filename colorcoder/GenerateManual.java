package colorcoder;

public class GenerateManual {

	public GenerateManual()
	{
		System.out.println("\n\nColor Coding Manual");
		System.out.println("PairID ---> MajorColor, MinorColor\n");
		for(int pairnumber = 1; pairnumber <= 25; pairnumber++)
	    {
	        ColorPair color_combination = Getter.GetColorFromPairNumber(pairnumber);
	        System.out.println(pairnumber + "--->" + color_combination.getMajor() + "," + color_combination.getMinor() + "\n");
	    }
	}
}