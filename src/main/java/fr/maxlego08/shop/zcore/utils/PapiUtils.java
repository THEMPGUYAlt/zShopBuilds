package fr.maxlego08.shop.zcore.utils;

import fr.maxlego08.shop.placeholder.Placeholder;
import org.bukkit.entity.Player;

import java.util.List;

public class PapiUtils {

    private transient Placeholder placeholder;

    private void mapPlaceholders() {
        if (this.placeholder == null) {
            this.placeholder = Placeholder.getPlaceholder();
        }
    }

    public String papi(String placeHolder, Player player) {
        this.mapPlaceholders();
        return this.placeholder.setPlaceholders(player, placeHolder);
    }

    public List<String> papi(List<String> placeHolder, Player player) {
        this.mapPlaceholders();
        return this.placeholder.setPlaceholders(player, placeHolder);
    }

}