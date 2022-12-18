package unikue3118.antibatspawn;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;


public class RemoveBat implements Listener {
    @EventHandler
    public void onEntity(EntitySpawnEvent entityEvent) {
        if(entityEvent.getEntityType() == EntityType.BAT & entityEvent.getEntity().getEntitySpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
            entityEvent.getEntity().remove();
        }
    }
}