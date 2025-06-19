package fr.maxlego08.zshop.api.buttons;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.zshop.api.economy.ShopEconomy;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class ShowItemButton extends Button {

    public abstract List<String> getLore();

}
