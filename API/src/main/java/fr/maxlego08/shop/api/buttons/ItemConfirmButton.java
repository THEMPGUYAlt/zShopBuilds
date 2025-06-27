package fr.maxlego08.shop.api.buttons;

import fr.maxlego08.menu.api.requirement.Action;
import fr.maxlego08.shop.api.economy.ShopEconomy;

import java.util.List;

public abstract class ItemConfirmButton extends EconomyAction {

    public abstract double getPrice();

    public abstract ShopEconomy getShopEconomy();

    public abstract List<Action> getPurchaseCommands();

    public abstract boolean enableLog();

    public abstract String getName();

    public abstract String getInventoryConfirm();

}
