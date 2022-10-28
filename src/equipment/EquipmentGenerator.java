package src.equipment;

import java.util.Arrays;
import src.equipment.weapon.Weapon;

public class EquipmentGenerator {
    private Equipment equipments[] = { new HealthPack() };

    public Equipment getEquipment(int index) {
        if (index >= equipments.length || index < 0) {
            return equipments[0];
        }
        return equipments[index];
    }

    public void addToTheEquipments(Weapon weapon) {
        Equipment[] newEquipmentArray = Arrays.copyOf(this.equipments, this.equipments.length + 1);
        newEquipmentArray[equipments.length] = weapon;
        this.equipments = newEquipmentArray;
    }
}
