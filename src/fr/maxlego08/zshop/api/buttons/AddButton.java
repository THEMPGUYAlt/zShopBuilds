package fr.maxlego08.zshop.api.buttons;

import fr.maxlego08.menu.api.button.Button;
import org.bukkit.entity.Player;

public abstract class AddButton extends Button {

    public abstract String getAmount();

    public abstract int parseInt(Player player);

}
