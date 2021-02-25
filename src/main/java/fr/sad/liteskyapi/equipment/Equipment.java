package fr.sad.liteskyapi.equipment;

import fr.sad.liteskyapi.equipment.type.EquipmentType;
import fr.sad.liteskyapi.user.LiteSkyUser;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public class Equipment {

    private EquipmentType equipmentType;
    private ItemStack itemStack;
    private Consumer<LiteSkyUser> consumer;

    public Equipment(EquipmentType equipmentType, ItemStack itemStack, Consumer<LiteSkyUser> consumer){
        this.equipmentType = equipmentType;
        this.itemStack = itemStack;
        this.consumer = consumer;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public Consumer<LiteSkyUser> getConsumer() {
        return consumer;
    }
}
