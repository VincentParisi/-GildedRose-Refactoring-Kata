package com.gildedrose.items;

import com.gildedrose.AbstractItem;
import com.gildedrose.Item;

public class ConjuredItem extends AbstractItem {
    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality(2);
        if (isExpired()) {
            decreaseQuality(2);
        }
    }
}
