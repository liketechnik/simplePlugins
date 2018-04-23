package simplePlugins.plugins.api.commands;

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
 * @date 23 of April 2018
 */
public class ParamCommand extends SimpleCommand {
    
    private String[] paramsUsage;
    private String _usage;
    
    public ParamCommand(String name, String usage, String[] paramsUsage, Method command, Plugin plugin) {
        super(name, usage, command, plugin);
        this.paramsUsage = paramsUsage;
    }
    
    @Override
    public String getUsage(ICommandSender sender) {
        if (_usage == null) {
            StringBuilder usage = new StringBuilder(super.usage);
            for (String paramUsage : paramsUsage) {
                usage.append("\n");
                usage.append(paramUsage);
            }
            this._usage = usage.toString();
        }
        return this._usage;
    }
    
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (sender instanceof EntityPlayer) {
            this.execute((EntityPlayer) sender, args);
        }
    }
    
    private void execute(EntityPlayer player, String[] args) {
        try {
            command.invoke(plugin, new EntityPlayerWrapper(player), args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            plugin.logger.error("Couldn't invoke command '" + this.name + "'.");
            e.printStackTrace();
        }
    }
}
