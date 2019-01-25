package hu.krisztiansipos.apartmentmanager.business;

import hu.krisztiansipos.apartmentmanager.business.base.BaseService;
import hu.krisztiansipos.apartmentmanager.data.UserDao;
import hu.krisztiansipos.apartmentmanager.data.UserEntity;
import hu.krisztiansipos.apartmentmanager.ui.Group;
import hu.krisztiansipos.apartmentmanager.ui.User;
import hu.krisztiansipos.apartmentmanager.ui.base.ViewModelBase;
import javafx.beans.property.SimpleListProperty;

import javax.persistence.EntityManager;

public class UserService extends BaseService {

    public UserService(EntityManager em) {
        super(new UserDao(em));
    }

    @Override
    public ViewModelBase get(long id) {
        UserEntity entity = (UserEntity) dao.get(id);

        // TODO: getGroupList refactor
        User user = new User(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhoneNumber(), getGrupList(id));

        return user;
    }

    private SimpleListProperty<Group> getGrupList(long id)
    {

        return null;
    }
}
