package net.rezxis.sql.spigot;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.rezxis.database.objects.RezxisPlayer;

public class RezxisPlayerUnloadEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final RezxisPlayer rezxisPlayer;

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public RezxisPlayerUnloadEvent(RezxisPlayer rezxisPlayer)
    {
        this.rezxisPlayer = rezxisPlayer;
    }

    public RezxisPlayer getRezxisPlayer() {
        return rezxisPlayer;
    }
}
