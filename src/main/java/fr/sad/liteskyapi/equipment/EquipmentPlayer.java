package fr.sad.liteskyapi.equipment;

import fr.sad.liteskyapi.equipment.type.EquipmentType;

public class EquipmentPlayer {

    private Equipment headEquipment = new Equipment(EquipmentType.HEAD, null, (liteSkyUser) -> {});
    private Equipment chestplateEquipment = new Equipment(EquipmentType.CHESTPLATE, null, (liteSkyUser) -> {});
    private Equipment leggingsEquipment = new Equipment(EquipmentType.LEGGINGS, null, (liteSkyUser) -> {});
    private Equipment bootsEquipment = new Equipment(EquipmentType.BOOTS, null, (liteSkyUser) -> {});

    private Equipment mainhandEquipment = new Equipment(EquipmentType.MAIN_HAND, null, (liteSkyUser) -> {});
    private Equipment offhandEquipment = new Equipment(EquipmentType.OFF_HAND, null, (liteSkyUser) -> {});

    public void setEquipment(int slot, Equipment equipment){
        if(slot == 0)
            headEquipment = equipment;
        else if(slot == 1)
            chestplateEquipment = equipment;
        else if(slot == 2)
            leggingsEquipment = equipment;
        else if(slot == 3)
            bootsEquipment = equipment;
        else if(slot == 4)
             mainhandEquipment = equipment;
        else if(slot == 5)
            offhandEquipment = equipment;
    }

    public Equipment getHeadEquipment() {
        return headEquipment;
    }

    public Equipment getChestplateEquipment() {
        return chestplateEquipment;
    }

    public Equipment getLeggingsEquipment() {
        return leggingsEquipment;
    }

    public Equipment getBootsEquipment() {
        return bootsEquipment;
    }

    public Equipment getMainhandEquipment() {
        return mainhandEquipment;
    }

    public Equipment getOffhandEquipment() {
        return offhandEquipment;
    }

    public void setHeadEquipment(Equipment headEquipment) {
        this.headEquipment = headEquipment;
    }

    public void setChestplateEquipment(Equipment chestplateEquipment) {
        this.chestplateEquipment = chestplateEquipment;
    }

    public void setLeggingsEquipment(Equipment leggingsEquipment) {
        this.leggingsEquipment = leggingsEquipment;
    }

    public void setBootsEquipment(Equipment bootsEquipment) {
        this.bootsEquipment = bootsEquipment;
    }

    public void setMainhandEquipment(Equipment mainhandEquipment) {
        this.mainhandEquipment = mainhandEquipment;
    }

    public void setOffhandEquipment(Equipment offhandEquipment) {
        this.offhandEquipment = offhandEquipment;
    }
}
