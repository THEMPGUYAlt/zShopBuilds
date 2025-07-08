package fr.maxlego08.shop.zcore.utils;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TranslationHelper {

    protected String getItemName(OfflinePlayer offlinePlayer, ItemStack itemStack) {

        if (itemStack == null) {
            return "";

        }
        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasDisplayName()) {
            return itemStack.getItemMeta().getDisplayName();
        }

        String name = itemStack.serialize().get("type").toString().replace("_", " ").toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String getItemName(ItemStack itemStack) {
        if (itemStack == null) return "";

        boolean hasMeta = itemStack.hasItemMeta();
        if (hasMeta && itemStack.getItemMeta().hasDisplayName()) {
            return convertOldHexString(itemStack.getItemMeta().getDisplayName());
        }

        String type = itemStack.serialize().get("type");
        if (type == null) {
            if (hasMeta) return itemStack.getItemMeta().getItemName();
            return itemStack.getType().name();
        }
        String name = type.toString().replace("_", " ").toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String getTranslationName(ItemStack itemStack) {
        return getItemName(itemStack);
    }

    private String convertOldHexString(String string) {

        if (string == null) return null;

        Pattern pattern = Pattern.compile("§x[a-fA-F0-9-§]{12}");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String color = string.substring(matcher.start(), matcher.end());
            String colorReplace = color.replace("§x", "#");
            colorReplace = colorReplace.replace("§", "");
            string = string.replace(color, colorReplace);
            matcher = pattern.matcher(string);
        }

        return string;
    }


}
