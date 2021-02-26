package fr.sad.liteskyapi.bar;

import fr.sad.liteskyapi.LiteSkyAPI;
import fr.sad.liteskyapi.number.Numberutils;
import fr.sad.liteskyapi.user.LiteSkyUser;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class ActionBarAPI {

    public static Map<LiteSkyUser, ActionBarPriority> cachePriority = new HashMap<>();

    public static void sendUsersBar() {
        LiteSkyAPI.getInstance().getLiteSkyUsers().forEach(user -> {
            sendUserBar(user, user.getColorHealth() + Numberutils.formatFloat(user.getHealth()) + "❤" + ChatColor.RESET + "   " + ChatColor.LIGHT_PURPLE + Numberutils.formatFloat(user.getMana()) + "✦");
        });
    }

    public static void sendUserBar(LiteSkyUser user, String bar){
        sendUserBar(user, bar, ActionBarPriority.DEFAULT);
    }

    public static void sendUserBar(LiteSkyUser user, String bar, ActionBarPriority priority){
        if(user.getOfflinePlayer().isOnline()){
            if(!cachePriority.containsKey(user))
                cachePriority.put(user, priority);

            if(cachePriority.get(user).getPriority() <= priority.getPriority()){
                sendActionBar(user.getOfflinePlayer().getPlayer(), bar);
            }
        }
    }

    private static void sendActionBar(Player player, String bar){
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', bar)));
    }

    public enum ActionBarPriority {
        DEFAULT(0),
        CUSTOM(1),
        ;

        int priority;

        ActionBarPriority(int priority){
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }

}
