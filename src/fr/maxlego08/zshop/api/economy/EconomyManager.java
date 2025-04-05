package fr.maxlego08.zshop.api.economy;

import java.util.Collection;
import java.util.Optional;

public interface EconomyManager {

    /**
     * Returns a collection of all the registered ShopEconomy objects.
     * <p>
     * This method is thread-safe and will return a new collection each time it is called.
     * The collection returned is not modifiable and is owned by the manager.
     *
     * @return a collection of all registered ShopEconomy objects
     */
    Collection<ShopEconomy> getEconomies();

    /**
     * Registers the given economy with the manager.
     * <p>
     * If the economy is already registered, this method will return false.
     * <p>
     * After calling this method, the economy will be returned by calls to {@link #getEconomies()}.
     *
     * @param economy the economy to register
     * @return whether the economy was successfully registered
     */
    boolean registerEconomy(ShopEconomy economy);

    /**
     * Removes the given economy from the manager.
     * <p>
     * If the economy is not registered, this method will return false.
     * <p>
     * After calling this method, the economy will no longer be returned by calls to {@link #getEconomies()}.
     *
     * @param economy the economy to remove
     * @return whether the economy was successfully removed
     */
    boolean removeEconomy(ShopEconomy economy);

    /**
     * Gets the ShopEconomy associated with the given name.
     *
     * @param economyName the name of the economy
     * @return an Optional containing the ShopEconomy if found, empty otherwise
     */
    Optional<ShopEconomy> getEconomy(String economyName);

    /**
     * Load all the economy managers from the configuration.
     */
    void loadEconomies();
}
