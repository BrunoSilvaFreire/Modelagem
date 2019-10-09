package me.ddevil.uml;

public interface Database {
    boolean addText(TechnicalText text);

    boolean removeText(TechnicalText text);

    TechnicalText search(User user, String terms);
}
