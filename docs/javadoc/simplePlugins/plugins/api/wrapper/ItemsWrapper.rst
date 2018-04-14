.. java:import:: net.minecraft.item Item

.. java:import:: net.minecraft.item ItemStack

ItemsWrapper
============

.. java:package:: simplePlugins.plugins.api.wrapper
   :noindex:

.. java:type:: public class ItemsWrapper

   :author: Florian Warzecha

Methods
-------
isItem
^^^^^^

.. java:method:: public static boolean isItem(Item test, Item item)
   :outertype: ItemsWrapper

   Compares a given item to another item and checks if the default instance of the item is equal to the other one. (This means, to test if a given item is for example a stick, pass \ :java:ref:`net.minecraft.init.Items.STICK`\  for the second parameter.)

   :param test: The item whose default instance is compared to the second item.
   :param item: The item the default instance of the first item is compared with.
   :return: If the default instance of the first parameter/item is equal to the second parameter/item.

isItem
^^^^^^

.. java:method:: public static boolean isItem(ItemStack test, Item item)
   :outertype: ItemsWrapper

   Compares a given \ :java:ref:`ItemStack`\  to another item and checks if the default instance of the itemstack is equal to the other one. (This means, to test if a given item is for example a stick, pass \ :java:ref:`net.minecraft.init.Items.STICK`\  for the second parameter.)

   :param test: The item whose default instance is compared to the second item.
   :param item: The item the default instance of the first item is compared with.
   :return: If the default instance of the first parameter/item is equal to the second parameter/item.

