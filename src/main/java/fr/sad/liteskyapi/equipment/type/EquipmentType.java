package fr.sad.liteskyapi.equipment.type;

public enum EquipmentType {

    HEAD(0),
    CHESTPLATE(1),
    LEGGINGS(2),
    BOOTS(3),

    MAIN_HAND(4),
    OFF_HAND(5),
    ;

    private int slot;

    EquipmentType(int slot){
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }
}
