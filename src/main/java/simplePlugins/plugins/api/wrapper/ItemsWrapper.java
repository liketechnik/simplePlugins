package simplePlugins.plugins.api.wrapper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 04 of März 2018
 */
public class ItemsWrapper {
    
    /**
     * Compares a given item to another item and checks if
     * the default instance of the item is equal to the other one.
     * (This means, to test if a given item is for example a stick,
     * pass {@link net.minecraft.init.Items#STICK} for the second parameter.)
     * @param test The item whose default instance is compared to the second item.
     * @param item The item the default instance of the first item is compared with.
     * @return If the default instance of the first parameter/item is equal to the second parameter/item.
     */
    public static boolean isItem(Item test, Item item) {
        return test.getDefaultInstance().getItem().equals(item);
    }
    
    /**
     * Compares a given {@link ItemStack} to another item and checks if
     * the default instance of the itemstack is equal to the other one.
     * (This means, to test if a given item is for example a stick,
     * pass {@link net.minecraft.init.Items#STICK} for the second parameter.)
     * @param test The item whose default instance is compared to the second item.
     * @param item The item the default instance of the first item is compared with.
     * @return If the default instance of the first parameter/item is equal to the second parameter/item.
     */
    public static boolean isItem(ItemStack test, Item item) {
        return isItem(test.getItem(), item);
    }
}
