package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;

public class CommandSellInventory extends VCommand {

	public CommandSellInventory(ShopPlugin plugin) {
		super(plugin);
		this.onlyPlayers();
	}

	@Override
	protected CommandType perform(ShopPlugin plugin) {

		plugin.getShopManager().openSellInventory(player);

		return CommandType.SUCCESS;
	}

}
