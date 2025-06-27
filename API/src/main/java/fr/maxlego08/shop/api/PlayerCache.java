package fr.maxlego08.shop.api;

import fr.maxlego08.shop.api.buttons.ItemButton;
import fr.maxlego08.shop.api.buttons.EconomyAction;
import fr.maxlego08.shop.api.utils.PriceModifierCache;

public interface PlayerCache {

    ItemButton getItemButton();

    void setItemButton(ItemButton itemButton);

    EconomyAction getEconomyAction();

    void setEconomyAction(EconomyAction economyAction);

    int getAmount();

    void setItemAmount(int amount);

    PriceModifierCache getPriceModifier(PriceType priceType);

    void setPriceModifier(PriceType priceType, PriceModifierCache cache);

}
