package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.zcore.enums.Message;
import fr.maxlego08.shop.zcore.enums.Permission;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;

public class CommandSellHand extends VCommand {

    public CommandSellHand(ShopPlugin plugin) {
        super(plugin);
        this.setPermission(Permission.ZSHOP_SELL_HAND);
        this.setDescription(Message.DESCRIPTION_SELL_HAND);
        this.addOptionalArg("amount");
        this.onlyPlayers();
    }

    @Override
    protected CommandType perform(ShopPlugin plugin) {
        int amount = this.argAsInteger(0, 64);
        this.plugin.getShopManager().sellHand(player, amount);
        return CommandType.SUCCESS;
    }

}
