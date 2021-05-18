package ine0056.github.com.joinmassegeplugin;


import jdk.internal.jline.internal.Nullable;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Joinmassegeplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("いねプラグインが起動しました...");
        getServer().getPluginManager().registerEvents(this,this);
        // getCommand("version").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("いねプラグインが終了しました...");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.BLUE + e.getPlayer().getName() + "さんが来たで");
    }
    public void onPlayerQuit(PlayerQuitEvent e) {
        e.setQuitMessage(ChatColor.BLUE + e.getPlayer().getName() + "さんがどっかに行ったで");
    }

    @EventHandler
    @Nullable
    public void PlayerDeathEvent(PlayerDeathEvent e) {
        Player player = e.getEntity().getPlayer();
        player.sendMessage(ChatColor.BLUE + player.getName() + " ざーこ♡");
    }

}
