package fr.maxlego08.zshop.buttons;

import fr.maxlego08.menu.api.engine.InventoryEngine;
import fr.maxlego08.menu.api.utils.Placeholders;
import fr.maxlego08.zshop.ShopPlugin;
import fr.maxlego08.zshop.api.PlayerCache;
import fr.maxlego08.zshop.api.buttons.EconomyAction;
import fr.maxlego08.zshop.save.Config;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class ZConfirmBuyButton extends ConfirmationButton {

    private final ShopPlugin plugin;

    public ZConfirmBuyButton(Plugin plugin) {
        this.plugin = (ShopPlugin) plugin;
    }

    @Override
    public void onClick(Player player, InventoryClickEvent event, InventoryEngine inventory, int slot, Placeholders placeholders) {
        super.onClick(player, event, inventory, slot, placeholders);

        PlayerCache cache = this.plugin.getShopManager().getCache(player);
        EconomyAction economyAction = cache.getEconomyAction();
        economyAction.buy(player, cache.getAmount());
        action(player, inventory, Config.purchaseConfirmationConfig, plugin, cache);
    }
}
