package fr.maxlego08.shop.api.buttons;

import fr.maxlego08.shop.api.economy.ShopEconomy;
import fr.maxlego08.shop.api.history.HistoryType;
import fr.maxlego08.shop.api.limit.Limit;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Represents an item button in a shop with various properties and actions.
 * This interface extends EconomyAction to handle economy-related actions.
 */
public abstract class ItemButton extends EconomyAction {

    /**
     * Key for storing the mob in NBT for mob spawner.
     */
    public static String nbtMobSpawnerKey = "zshop-mob";

    /**
     * Gets the sell price for a single item.
     *
     * @return The sell price.
     */
    public abstract double getSellPrice();

    /**
     * Gets the buy price for a single item.
     *
     * @return The buy price.
     */
    public abstract double getBuyPrice();

    /**
     * Gets the sell price for a specific amount of items.
     *
     * @param amount The amount of items.
     * @return The total sell price.
     */
    public abstract double getSellPrice(int amount);

    /**
     * Gets the buy price for a specific amount of items.
     *
     * @param amount The amount of items.
     * @return The total buy price.
     */
    public abstract double getBuyPrice(int amount);

    /**
     * Gets the sell price for a specific amount of items for a player.
     *
     * @param player The player.
     * @param amount The amount of items.
     * @return The total sell price for the player.
     */
    public abstract double getSellPrice(Player player, int amount);

    /**
     * Gets the buy price for a specific amount of items for a player.
     *
     * @param player The player.
     * @param amount The amount of items.
     * @return The total buy price for the player.
     */
    public abstract double getBuyPrice(Player player, int amount);

    /**
     * Gets the sell price for a single unit of the item.
     *
     * @return The sell price for a single unit.
     */
    public abstract double getUnitSellPrice();

    /**
     * Gets the buy price for a single unit of the item.
     *
     * @return The buy price for a single unit.
     */
    public abstract double getUnitBuyPrice();

    /**
     * Checks if selling this item is allowed.
     *
     * @return True if selling is allowed, false otherwise.
     */
    public abstract boolean canSell();

    /**
     * Checks if buying this item is allowed.
     *
     * @return True if buying is allowed, false otherwise.
     */
    public abstract boolean canBuy();

    /**
     * Gets the maximum stack size for this item.
     *
     * @return The maximum stack size.
     */
    public abstract int getMaxStack();

    /**
     * Gets the ShopEconomy associated with this item.
     *
     * @return The ShopEconomy.
     */
    public abstract ShopEconomy getEconomy();

    /**
     * Gets the lore of the item.
     *
     * @return The lore as a list of strings.
     */
    public abstract List<String> getLore();

    /**
     * Gets the formatted sell price for a specific amount of items for a player.
     *
     * @param player The player.
     * @param amount The amount of items.
     * @return The formatted sell price.
     */
    public abstract String getSellPriceFormat(Player player, int amount);

    /**
     * Gets the formatted buy price for a specific amount of items for a player.
     *
     * @param player The player.
     * @param amount The amount of items.
     * @return The formatted buy price.
     */
    public abstract String getBuyPriceFormat(Player player, int amount);

    /**
     * Gets the formatted sell price for a specific amount of items.
     *
     * @param amount The amount of items.
     * @return The formatted sell price.
     */
    public abstract String getSellPriceFormat(int amount);

    /**
     * Gets the formatted buy price for a specific amount of items.
     *
     * @param amount The amount of items.
     * @return The formatted buy price.
     */
    public abstract String getBuyPriceFormat(int amount);

    /**
     * Gets the list of buy commands associated with this item.
     *
     * @return The list of buy commands.
     */
    public abstract List<String> getBuyCommands();

    /**
     * Gets the list of sell commands associated with this item.
     *
     * @return The list of sell commands.
     */
    public abstract List<String> getSellCommands();

    /**
     * Checks if giving this item is enabled.
     *
     * @return True if giving is enabled, false otherwise.
     */
    public abstract boolean giveItem();

    /**
     * Gets the optional server buy limit for this item.
     *
     * @return The optional server buy limit.
     */
    public abstract Optional<Limit> getServerBuyLimit();

    /**
     * Gets the optional server sell limit for this item.
     *
     * @return The optional server sell limit.
     */
    public abstract Optional<Limit> getServerSellLimit();

    /**
     * Gets the optional player buy limit for this item.
     *
     * @return The optional player buy limit.
     */
    public abstract Optional<Limit> getPlayerBuyLimit();

    /**
     * Gets the optional player sell limit for this item.
     *
     * @return The optional player sell limit.
     */
    public abstract Optional<Limit> getPlayerSellLimit();

    /**
     * Checks if logging is enabled for this item.
     *
     * @return True if logging is enabled, false otherwise.
     */
    public abstract boolean enableLog();

    /**
     * Logs a transaction for this item.
     *
     * @param amount     The transaction amount.
     * @param itemName   The name of the item.
     * @param price      The price of the transaction.
     * @param playerName The name of the player involved.
     * @param uuid       The UUID of the player.
     * @param type       The type of the transaction (e.g., purchase or sale).
     */
    public abstract void log(int amount, String itemName, String price, String playerName, UUID uuid, HistoryType type);

    /**
     * Checks if the item is affected by price modifiers.
     *
     * @return True if affected, false otherwise.
     */
    public abstract boolean affectByPriceModifier();

    /**
     * Gets the mob associated with this item.
     *
     * @return The mob name.
     */
    public abstract String getMob();

    /**
     * Gets the inventory buy action for this item.
     *
     * @return The inventory buy action.
     */
    public abstract String getInventoryBuy();

    /**
     * Gets the inventory sell action for this item.
     *
     * @return The inventory sell action.
     */
    public abstract String getInventorySell();

    /**
     * Checks if the item is unstackable.
     *
     * @return True if unstackable, false otherwise.
     */
    public abstract boolean isUnStackable();

}
