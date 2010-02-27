package com.cooliris.media;

import com.cooliris.app.App;

public final class GridLayoutInterface extends LayoutInterface {
    public GridLayoutInterface(int numRows) {
        mNumRows = numRows;
        mSpacingX = (int) (20 * App.PIXEL_DENSITY);
        mSpacingY = (int) (40 * App.PIXEL_DENSITY);
    }

    public void getPositionForSlotIndex(int slotIndex, int itemWidth, int itemHeight, Vector3f outPosition) {
        outPosition.x = (slotIndex / mNumRows) * (itemWidth + mSpacingX);
        outPosition.y = (slotIndex % mNumRows) * (itemHeight + mSpacingY);
        int maxY = (mNumRows - 1) * (itemHeight + mSpacingY);
        outPosition.y -= (maxY >> 1);
        outPosition.z = 0;
    }

    public int mNumRows;
    public int mSpacingX;
    public int mSpacingY;
}
