package simplePlugins.plugins.api.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import simplePlugins.plugins.api.Plugin;
import simplePlugins.plugins.api.wrappers.EntityPlayerWrapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 16 of Februar 2018
 */
public class SimpleCommand extends CommandBase {
    
    protected String name;
    protected String usage;
    protected Method command;
    protected Plugin plugin;
    
    public SimpleCommand(String name, String usage, Method command, Plugin plugin) {
        this.name = name;
        this.usage = usage;
        this.command = command;
        this.plugin = plugin;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getUsage(ICommandSender sender) {
        return usage;
    }
    
    public Plugin getPlugin() {
        return this.plugin;
    }
    
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (sender instanceof  EntityPlayer) {
            this.execute((EntityPlayer) sender);
        }
    }
    
    private void execute(EntityPlayer player) {
        try {
            command.invoke(plugin, new EntityPlayerWrapper(player));
        } catch (IllegalAccessException | InvocationTargetException e) {
            plugin.logger.error("Couldn't execute command '" + this.name + "'.");
            e.printStackTrace();
        }
    }
}
