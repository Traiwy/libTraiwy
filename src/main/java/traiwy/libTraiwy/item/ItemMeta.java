package traiwy.libTraiwy.item;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ItemMeta {
    public void setItemMeta(ItemStack item, String name, List<String> lore){
        org.bukkit.inventory.meta.ItemMeta metaItem = item.getItemMeta();
        if(metaItem != null){
            metaItem.setDisplayName(name);
            metaItem.setLore(lore);
            item.setItemMeta(metaItem);
        }
    }
}
