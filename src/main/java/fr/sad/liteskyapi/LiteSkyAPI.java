package fr.sad.liteskyapi;

import fr.sad.liteskyapi.user.LiteSkyUser;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;
import java.util.UUID;

public abstract class LiteSkyAPI extends JavaPlugin {

    private static LiteSkyAPI instance;

    public LiteSkyAPI(){
        instance = this;
    }

    public static LiteSkyAPI getInstance(){
        return instance;
    }

    public abstract LiteSkyUser getLiteSkyUser(UUID uuid);

    public abstract Set<LiteSkyUser> getLiteSkyUsers();
}
