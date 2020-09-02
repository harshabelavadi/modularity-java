package com.philips.colorcoder;

enum MajorColor implements IColor{
	WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
	private int index;
    private MajorColor(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
}

enum MinorColor implements IColor{
	BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
	private int index;
    private MinorColor(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
}