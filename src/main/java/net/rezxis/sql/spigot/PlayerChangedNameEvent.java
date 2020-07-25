package net.rezxis.sql.spigot;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.rezxis.database.objects.RezxisPlayer;

/**
 * User: Austin
 * Date: 9/23/12
 * Time: 5:56 AM
 */
public class PlayerChangedNameEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final RezxisPlayer rezxisPlayer;
    private final String oldName;

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public PlayerChangedNameEvent(RezxisPlayer rezxisPlayer,String name)
    {
        this.oldName = name;
        this.rezxisPlayer = rezxisPlayer;
    }

    public RezxisPlayer getRezxisPlayer() {
        return rezxisPlayer;
    }

    public String getOldName()
    {
        return oldName;
    }
}
