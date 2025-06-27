package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;

public class CommandSell extends VCommand {

	public CommandSell(ShopPlugin plugin) {
		super(plugin);
		this.addSubCommand(new CommandSellAll(plugin).addSubCommand("all"));
		this.addSubCommand(new CommandSellHand(plugin).addSubCommand("hand"));
		this.addSubCommand(new CommandSellAllHand(plugin).addSubCommand("handall"));
		this.onlyPlayers();
	}

	@Override
	protected CommandType perform(ShopPlugin plugin) {
		this.syntaxMessage();
		return CommandType.SUCCESS;
	}

}
