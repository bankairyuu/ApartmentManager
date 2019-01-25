package hu.krisztiansipos.apartmentmanager.ui;

import hu.krisztiansipos.apartmentmanager.ui.base.ViewModelBase;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.util.List;

public class User extends ViewModelBase {
    public final SimpleStringProperty nameProperty;
    public final SimpleStringProperty emailProperty;
    public final SimpleStringProperty phonenumberProperty;
    public final SimpleListProperty groupListProperty;

    public User(long id, String name, String email, String phonenumber, ObservableList<Group> groupList) {
        super(new SimpleLongProperty(id));
        this.nameProperty = new SimpleStringProperty(name);
        this.emailProperty = new SimpleStringProperty(email);
        this.phonenumberProperty = new SimpleStringProperty(phonenumber);
        this.groupListProperty = new SimpleListProperty(groupList);
    }




}
