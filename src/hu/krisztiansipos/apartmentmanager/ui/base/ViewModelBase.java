package hu.krisztiansipos.apartmentmanager.ui.base;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;

public abstract class ViewModelBase extends SimpleObjectProperty {
    public final SimpleLongProperty idProperty;

    public ViewModelBase(SimpleLongProperty idProperty) {
        this.idProperty = idProperty;
    }
}
