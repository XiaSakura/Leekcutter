package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;

import java.util.List;

@Command(label = "stop", usage = "stop",
        description = "关闭此服务器", permission = "server.stop")
public final class StopCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        CommandHandler.sendMessage(null, Grasscutter.getLanguage().Stop_message);
        for (Player p : Grasscutter.getGameServer().getPlayers().values()) {
            CommandHandler.sendMessage(p, Grasscutter.getLanguage().Stop_message);
        }

        System.exit(1);
    }
}
