package com.gildedrose;

import com.gildedrose.items.*;


public class ItemFactory {
    public static UpdatableItem create(Item item) {
        if (item.name.equals("Aged Brie")) return new AgedBrieItem(item);
        if (item.name.startsWith("Backstage passes")) return new BackstagePassItem(item);
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) return new SulfurasItem(item);
        if (item.name.startsWith("Conjured")) return new ConjuredItem(item);
        return new NormalItem(item);
    }
}
