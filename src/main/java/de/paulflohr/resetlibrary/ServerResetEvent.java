package de.paulflohr.resetlibrary;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ServerResetEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private String resetMessage;
    private final CommandSender executor;

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public ServerResetEvent(String resetMessage, CommandSender executor) {
        this.resetMessage = resetMessage;
        this.executor = executor;
    }

    public String getResetMessage() {
        return resetMessage;
    }

    public void setResetMessage(String resetMessage) {
        this.resetMessage = resetMessage;
    }

    public CommandSender getExecutor() {
        return executor;
    }
}
