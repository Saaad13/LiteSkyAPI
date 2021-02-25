package fr.sad.liteskyapi.data;

import fr.sad.liteskyapi.user.LiteSkyUser;
import org.bukkit.inventory.ItemStack;

public class DataReward {

    private double money;
    private ItemStack[] itemStacks;

    public DataReward(double money, ItemStack... itemStacks){
        this.money = money;
        this.itemStacks = itemStacks;
    }

    public void accept(LiteSkyUser user){
        if(this.money != 0)
            user.addMoney(this.money);
        if(this.itemStacks != null && user.getOfflinePlayer().isOnline())
            user.getOfflinePlayer().getPlayer().getInventory().addItem(itemStacks);
    }

    public double getMoney() {
        return money;
    }

    public ItemStack[] getItemStacks() {
        return itemStacks;
    }
}
