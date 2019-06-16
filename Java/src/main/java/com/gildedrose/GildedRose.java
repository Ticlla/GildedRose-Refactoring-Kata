package com.gildedrose;

public class GildedRose {


    private Item[] items;
    private StrategyGildenRose  strategyGildenRose;

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public Item[] getItems() {

        return items;
    }

    public void setItems(Item[] items) {

        this.items = items;
    }

    public void setEstrategyItem(StrategyGildenRose strategyGildenRose){
        this.strategyGildenRose = strategyGildenRose ;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].getName().equals("Aged Brie")
                    && !items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {

                setEstrategyItem(new ItemCriteria1());

            } else {
                if (items[i].getQuality() < 50) {

                    setEstrategyItem(new ItemCriteria2());

                }
            }


            if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {

                setEstrategyItem(new ItemCriteria3());

            }

            if (items[i].getSellIn() < 0) {

                setEstrategyItem(new ItemCriteria4());

            }

            strategyGildenRose.updateQuality(items[i]);
        }
    }
}