package fr.maxlego08.shop.api.event.events;

import fr.maxlego08.shop.api.event.CancelledShopEvent;
import fr.maxlego08.shop.api.event.ShopAction;
import org.bukkit.entity.Player;

import java.util.List;

public class ZShopSellAllEvent extends CancelledShopEvent {

    private final Player player;
    private final List<ShopAction> shopActions;

    public ZShopSellAllEvent(Player player, List<ShopAction> shopActions) {
        this.player = player;
        this.shopActions = shopActions;
    }

    public Player getPlayer() {
        return player;
    }

    public List<ShopAction> getShopActions() {
        return shopActions;
    }
}
