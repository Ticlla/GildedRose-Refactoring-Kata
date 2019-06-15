package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].getName());
    }

    @Test
    public void testTwoDays(){
        Item[] itemsStart = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backsthttps://github.com/Ticlla/GildedRose-Refactoring-Kata.gitage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(itemsStart);
        app.updateQuality();

        Item[] itemsEnd = new Item[] {
                new Item("+5 Dexterity Vest", 10, 9), //
                new Item("Aged Brie", 2, 1), //
                new Item("Elixir of the Mongoose", 5, 4), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 14),
                new Item("Backsthttps://github.com/Ticlla/GildedRose-Refactoring-Kata.gitage passes to a TAFKAL80ETC concert", 10, 9),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 2) };


        for (int i = 0; i < itemsEnd.length ; i++) {
            assertEquals(itemsEnd[i].getName(),app.getItems()[i].getName());
            assertEquals(itemsEnd[i].getQuality(),app.getItems()[i].getQuality());
            assertEquals(itemsEnd[i].getSellIn(),app.getItems()[i].getSellIn());
        }


    }

}
