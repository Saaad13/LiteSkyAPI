package fr.sad.liteskyapi.user;

import fr.sad.liteskyapi.equipment.EquipmentPlayer;
import fr.sad.liteskyapi.skills.Skill;
import fr.sad.liteskyapi.skills.SkillType;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;

import java.util.Map;
import java.util.UUID;

public interface LiteSkyUser {

    UUID getUUID();

    void setHealth(float health);

    float getHealth();

    ChatColor getColorHealth();

    void setMaxHealth(float maxHealth);

    float getMaxHealth();

    void setMana(float mana);

    float getMana();

    EquipmentPlayer getEquipment();

    void setMoney(double money);

    void addMoney(double money);

    void removeMoney(double money);

    double getMoney();

    Map<SkillType, Skill> getSkills();

    OfflinePlayer getOfflinePlayer();

}
