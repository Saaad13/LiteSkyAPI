package fr.sad.liteskyapi.task;

import fr.sad.liteskyapi.LiteSkyAPI;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class LiteSkyTask {

    public static BukkitTask runSync(Runnable runnable, long delay, long repeating){
        return Bukkit.getScheduler().runTaskTimer(LiteSkyAPI.getInstance(), runnable, delay, repeating);
    }

    public static BukkitTask runAsync(Runnable runnable, long delay, long repeating){
        return Bukkit.getScheduler().runTaskTimerAsynchronously(LiteSkyAPI.getInstance(), runnable, delay, repeating);
    }

    public static void asLaterSync(Runnable runnable, long delay){
        Bukkit.getScheduler().runTaskLater(LiteSkyAPI.getInstance(), runnable, delay);
    }

    public static void asLaterAsync(Runnable runnable, long delay){
        Bukkit.getScheduler().runTaskLaterAsynchronously(LiteSkyAPI.getInstance(), runnable, delay);
    }

    public static void asSync(Runnable runnable){
        Bukkit.getScheduler().runTask(LiteSkyAPI.getInstance(), runnable);
    }

    public static void asAsync(Runnable runnable){
        Bukkit.getScheduler().runTaskAsynchronously(LiteSkyAPI.getInstance(), runnable);
    }

    public static BukkitTask getTask(int id){
        return Bukkit.getScheduler().getPendingTasks().stream().filter(bukkitTask -> bukkitTask.getTaskId() == id).findFirst().orElseThrow(() -> new NullPointerException("Unknown task with id " + id));
    }

}
