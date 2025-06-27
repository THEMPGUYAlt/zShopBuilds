package fr.maxlego08.shop.loader;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import fr.maxlego08.shop.ShopPlugin;
import fr.maxlego08.shop.buttons.ZBuyMore;
import org.bukkit.configuration.file.YamlConfiguration;

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
