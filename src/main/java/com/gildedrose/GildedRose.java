package com.gildedrose;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class GildedRose {
    private final List<UpdatableItem> updatableItems;

    public GildedRose(Item[] items) {
        this.updatableItems = Arrays.stream(items)
            .map(ItemFactory::create)
            .collect(Collectors.toList());
    }

    public void updateQuality() {
        for (UpdatableItem item : updatableItems) {
            item.update();
        }
    }
}
