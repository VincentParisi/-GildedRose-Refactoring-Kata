package com.gildedrose.items;

import com.gildedrose.AbstractItem;
import com.gildedrose.Item;

public class BackstagePassItem extends AbstractItem {
    public BackstagePassItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();

        if (isExpired()) {
            item.quality = 0;
            return;
        }

        increaseQuality();

        if (item.sellIn < 10) {
            increaseQuality();
        }

        if (item.sellIn < 5) {
            increaseQuality();
        }
    }
}
