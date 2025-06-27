package fr.maxlego08.shop.api.buttons;

import fr.maxlego08.menu.api.button.Button;
import org.bukkit.entity.Player;

public abstract class EconomyAction extends Button {

    public abstract  void buy(Player player, int amount);

    public abstract  void sell(Player player, int amount);

}
