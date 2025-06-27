package fr.maxlego08.shop.command.commands;

import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.command.VCommand;
import fr.maxlego08.shop.convert.ShopGuiPlusConverter;
import fr.maxlego08.shop.zcore.enums.Message;
import fr.maxlego08.shop.zcore.enums.Permission;
import fr.maxlego08.shop.zcore.utils.commands.CommandType;

public class CommandShopConvert extends VCommand {

    private final ShopGuiPlusConverter shopGuiPlusConverter;

    public CommandShopConvert(ShopPlugin plugin) {
        super(plugin);
        this.shopGuiPlusConverter = new ShopGuiPlusConverter(plugin);
        this.setPermission(Permission.ZSHOP_CONVERT);
        this.addSubCommand("convert");
        this.setDescription(Message.DESCRIPTION_CONVERT);
    }

    @Override
    protected CommandType perform(ShopPlugin plugin) {
        this.shopGuiPlusConverter.convert(sender);
        return CommandType.SUCCESS;
    }

}
