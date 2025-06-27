package fr.maxlego08.shop.loader;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.buttons.ZRemoveButton;
import org.bukkit.configuration.file.YamlConfiguration;

public class RemoveButtonLoader extends ButtonLoader {

    private final ShopPlugin plugin;

    public RemoveButtonLoader(ShopPlugin plugin) {
        super(plugin, "zshop_remove");
        this.plugin = plugin;
    }

    @Override
    public Button load(YamlConfiguration configuration, String path, DefaultButtonValue defaultButtonValue) {

        String amount = configuration.getString(path + "amount", "1");

        return new ZRemoveButton(this.plugin, amount);
    }
}
