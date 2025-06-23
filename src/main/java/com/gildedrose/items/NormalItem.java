package com.gildedrose.items;

import com.gildedrose.AbstractItem;
import com.gildedrose.Item;

public class NormalItem extends AbstractItem {
    public NormalItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality();
        if (isExpired()) {
            decreaseQuality();
        }
    }
}
