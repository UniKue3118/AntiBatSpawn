package unikue3118.antibatspawn;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiBatSpawn extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("On!");  //서버의 로그에 출력
        getServer().getPluginManager().registerEvents(new RemoveBat(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Off.");  //서버의 로그에 출력
    }
}