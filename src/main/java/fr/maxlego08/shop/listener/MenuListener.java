package fr.maxlego08.shop.listener;

import fr.maxlego08.menu.api.event.FastEvent;
import fr.maxlego08.menu.api.event.events.ButtonLoadEvent;
import fr.maxlego08.shop.api.ShopManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MenuListener extends FastEvent implements Listener {

    private final ShopManager shopManager;

    public MenuListener(ShopManager shopManager) {
        this.shopManager = shopManager;
    }

    @Override
    public void onButtonLoad(ButtonLoadEvent event) {
        shopManager.onButtonLoad(event);
    }

    @EventHandler
    public void onLoad(ButtonLoadEvent event) {
        shopManager.onButtonLoad(event);
    }
}
