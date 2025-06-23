package com.gildedrose.items;

import com.gildedrose.AbstractItem;
import com.gildedrose.Item;

public class AgedBrieItem extends AbstractItem {
    public AgedBrieItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality();
        if (isExpired()) {
            increaseQuality();
        }
    }
}
