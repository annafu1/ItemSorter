package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        for (int i = 0; i < items.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < items.length - 1; j++) {
                if(comparator.compare(items[j], items[j+1]) > 0){
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                    changed = true;
                }
            }
            if(!changed){
                break;
            }
        }
        return items;
    }
}
