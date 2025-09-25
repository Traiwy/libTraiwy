package traiwy.libTraiwy.chat;


import org.bukkit.command.CommandSender;

public class ChatUtil {
    public static void sendPrefixMessage(CommandSender commandSender, String message){
        commandSender.sendMessage("§6[MyPlugin] §f" + message);
    }
}
