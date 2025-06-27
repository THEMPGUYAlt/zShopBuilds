package fr.maxlego08.shop.api.event.events;

import fr.maxlego08.shop.api.economy.EconomyManager;
import fr.maxlego08.shop.api.event.ShopEvent;

public class ZShopEconomyRegisterEvent extends ShopEvent {

    private final EconomyManager manager;

    public ZShopEconomyRegisterEvent(EconomyManager manager) {
        this.manager = manager;
    }

    public EconomyManager getManager() {
        return manager;
    }
}
