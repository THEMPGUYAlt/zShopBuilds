package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.zcore.enums.Message;
import fr.maxlego08.shop.zcore.enums.Permission;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;

public class CommandSellAll extends VCommand {

	public CommandSellAll(ShopPlugin plugin) {
		super(plugin);
		this.setPermission(Permission.ZSHOP_SELL_ALL);
		this.setDescription(Message.DESCRIPTION_SELL_ALL);
		this.onlyPlayers();
	}

	@Override
	protected CommandType perform(ShopPlugin plugin) {
		this.plugin.getShopManager().sellAll(this.player);
		return CommandType.SUCCESS;
	}

}
