package fr.maxlego08.shop.save;

import fr.maxlego08.shop.ZPriceModifier;
import fr.maxlego08.shop.api.PriceModifier;
import fr.maxlego08.shop.zcore.logger.Logger;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Config {

    public static int configVersion = 1;
    public static boolean enableDebug = true;
    public static boolean enableDebugTime = false;
    public static boolean disableItemFlag = true;
    public static boolean enableInventoryFullBuy = true;
    public static boolean enableSellCommand = true;
    public static boolean enableSellInventoryCommand = true;
    public static ConfirmAction sellConfirmationConfig;
    public static ConfirmAction purchaseConfirmationConfig;
    public static String defaultEconomy = "VAULT";
    public static String sellInventoryName = "shop_sell";
    public static String confirmInventoryName = "confirm";
    public static String sellInventoryTitle = "&8Sell Inventory";
    public static String buyInventoryName = "shop_buy";
    public static String dateFormat = "EEEE, d MMM yyyy HH:mm:ss";
    public static String depositAllReason = "";
    public static String depositAllLine = "";
    public static List<String> defaultLore = Arrays.asList("&f» &7Buying price&8: &e%buyPrice%", "&f» &7Selling price&8: &e%sellPrice%", "", "&f➥ &r&7Left click to &f&nʙᴜʏ", "&f➥ &r&7Click wheel (or drop key) to &f&nsᴇʟʟ ᴇᴠᴇʀʏᴛʜɪɴɢ", "&f➥ &r&7Right click to &f&nsᴇʟʟ");
    public static List<PriceModifier> priceModifiers = new ArrayList<>();
    public static String language = "en-us";

    private Config() {
    }

    public static void load(YamlConfiguration configuration) {

        int version = configuration.getInt("configVersion", -1);
        if (version != configVersion && version != -1) {
            Logger.info("You are not using the latest version of the configuration, items can be added on deleted. Please update your configuration.", Logger.LogType.WARNING);
        }

        enableDebug = configuration.getBoolean("enableDebug");
        enableDebugTime = configuration.getBoolean("enableDebugTime");
        disableItemFlag = configuration.getBoolean("disableItemFlag");
        enableSellCommand = configuration.getBoolean("enableSellCommand");
        enableSellInventoryCommand = configuration.getBoolean("enableSellInventoryCommand");
        enableInventoryFullBuy = configuration.getBoolean("enableInventoryFullBuy");

        defaultLore = configuration.getStringList("defaultLore");
        defaultEconomy = configuration.getString("defaultEconomy");
        confirmInventoryName = configuration.getString("confirmInventoryName");
        sellInventoryName = configuration.getString("sellInventoryName");
        buyInventoryName = configuration.getString("buyInventoryName");
        sellInventoryTitle = configuration.getString("sellInventoryTitle", "&8Sell Inventory");
        dateFormat = configuration.getString("dateFormat");
        priceModifiers = ((List<Map<String, Object>>) configuration.getList("pricesModifier", new ArrayList<>())).stream().map(ZPriceModifier::new).collect(Collectors.toList());

        LogConfig.load(configuration);
        PriceFormatConfig.load(configuration);
        AbbreviateNumberConfig.load(configuration);

        sellConfirmationConfig = ConfirmAction.valueOf(configuration.getString("sellAction", "NONE"));
        purchaseConfirmationConfig = ConfirmAction.valueOf(configuration.getString("purchaseAction", "NONE"));

        depositAllReason = configuration.getString("deposit-all-reason");
        depositAllLine = configuration.getString("deposit-all-line");

        language = configuration.getString("language", "en-us");
    }
}
