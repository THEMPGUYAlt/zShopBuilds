package fr.maxlego08.shop.api;

public interface PriceModifier {

    PriceType getType();

    double getModifier();

    String getPermission();

}
