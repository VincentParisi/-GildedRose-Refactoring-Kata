package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassItemTest {

    @Test
    public void backstagePasses_increaseQualityBy1_whenSellInOver10() {
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, items[0].quality);
    }

    @Test
    public void backstagePasses_increaseQualityBy2_whenSellIn10orLess() {
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 25) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(27, items[0].quality);
    }

    @Test
    public void backstagePasses_increaseQualityBy3_whenSellIn5orLess() {
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 25) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(28, items[0].quality);
    }

    @Test
    public void backstagePasses_qualityDropsTo0_afterConcert() {
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstagePass_neverExceedsQualityFifty() {
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, items[0].quality); // +3 mais max = 50
    }


}
