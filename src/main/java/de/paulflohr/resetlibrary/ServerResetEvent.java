package de.paulflohr.resetlibrary;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ServerResetEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private String resetMessage;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public ServerResetEvent(String resetMessage) {
        this.resetMessage = resetMessage;
    }

    public String getResetMessage() {
        return resetMessage;
    }

    public void setResetMessage(String resetMessage) {
        this.resetMessage = resetMessage;
    }
}
