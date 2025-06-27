package fr.maxlego08.shop.loader;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.buttons.ZShowItemButton;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;

public class ShowItemButtonLoader extends ButtonLoader {

    private final ShopPlugin plugin;

    public ShowItemButtonLoader(ShopPlugin plugin) {
        super(plugin, "zshop_show");
        this.plugin = plugin;
    }

    @Override
    public Button load(YamlConfiguration configuration, String path, DefaultButtonValue defaultButtonValue) {

        List<String> lore = configuration.getStringList(path + "lore");

        return new ZShowItemButton(this.plugin, lore);
    }
}
