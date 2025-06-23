package com.gildedrose;

public abstract class AbstractItem implements UpdatableItem {
    protected final Item item;

    public AbstractItem(Item item) {
        this.item = item;
    }

    protected void decreaseSellIn() {
        item.sellIn--;
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void decreaseQuality(int amount) {
        item.quality = Math.max(0, item.quality - amount);
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }
}
