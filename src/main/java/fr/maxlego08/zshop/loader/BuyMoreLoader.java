package fr.maxlego08.zshop.loader;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import fr.maxlego08.zshop.ShopPlugin;
import fr.maxlego08.zshop.api.buttons.AddButton;
import fr.maxlego08.zshop.buttons.ZBuyMore;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class BuyMoreLoader extends ButtonLoader {

    private final ShopPlugin plugin;

    public BuyMoreLoader(ShopPlugin plugin) {
        super(plugin, "zshop_buy_more");
        this.plugin = plugin;
    }

    @Override
    public Button load(YamlConfiguration configuration, String path, DefaultButtonValue defaultButtonValue) {

        int amount = configuration.getInt(path + "amount", 1);

        return new ZBuyMore(plugin, amount);
    }
}
