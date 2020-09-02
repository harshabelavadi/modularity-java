package colorcoder;

enum MajorColor {
	WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
	private int index;
    private MajorColor(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static MajorColor fromIndex(int index) {
        for(MajorColor color: MajorColor.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}

enum MinorColor {
	BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
	private int index;
    private MinorColor(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static MinorColor fromIndex(int index) {
        for(MinorColor color: MinorColor.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}