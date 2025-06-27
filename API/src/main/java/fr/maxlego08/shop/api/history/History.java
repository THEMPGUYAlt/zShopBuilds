package fr.maxlego08.shop.api.history;

public interface History {

    long getDate();

    HistoryType getType();

    String getMessage();

    String getDateAsString();
}
