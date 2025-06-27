package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.api.history.HistoryType;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.zcore.enums.Message;
import fr.maxlego08.shop.zcore.enums.Permission;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;
import org.bukkit.OfflinePlayer;

import java.util.Arrays;

public class CommandShopLogs extends VCommand {

    public CommandShopLogs(ShopPlugin plugin) {
        super(plugin);
        this.setPermission(Permission.ZSHOP_LOGS);
        this.addSubCommand("logs", "log");
        this.addRequireArg("player");
        this.addRequireArg("type", (a, b) -> Arrays.asList("sell", "buy"));
        this.addOptionalArg("page");
        this.setDescription(Message.DESCRIPTION_LOGS);
    }

    @Override
    protected CommandType perform(ShopPlugin plugin) {

        OfflinePlayer offlinePlayer = this.argAsOfflinePlayer(0);
        HistoryType type = HistoryType.valueOf(this.argAsString(1, "SELL").toUpperCase());
        int page = this.argAsInteger(2, 1);
        plugin.getHistoryManager().readLogs(sender, offlinePlayer, type, page);

        return CommandType.SUCCESS;
    }

}
