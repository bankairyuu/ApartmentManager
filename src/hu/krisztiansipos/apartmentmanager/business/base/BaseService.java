package hu.krisztiansipos.apartmentmanager.business.base;

import hu.krisztiansipos.apartmentmanager.data.UserDao;
import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;
import hu.krisztiansipos.apartmentmanager.data.base.Dao;
import hu.krisztiansipos.apartmentmanager.ui.base.ViewModelBase;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseService {
    protected EntityManager em;
    protected BaseDao dao;

    public BaseService(BaseDao dao) {
        this.dao = dao;
    }

    public ViewModelBase get(long id) {
        return null;
    }
}
